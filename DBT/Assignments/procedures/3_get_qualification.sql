-- Question 3:

-- Write a procedure(named getQualification) that takes studentID as a parameter.
-- If studentIDis present in the student table, then print his student details along with STUDENT_QUALIFICATION details
-- and if the studentIDis not present display message “Student not found…” (Use: STUDENT, andSTUDENT_QUALIFICATION tables)

DELIMITER $$
DROP PROCEDURE IF EXISTS getQualification$$
CREATE PROCEDURE getQualification( IN studentID INT)
BEGIN
    DECLARE v_studentFirstName VARCHAR(300);

    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        SELECT "PROCEDURE did not work!!" AS Message;
    END;

-- Start Transactions
    START TRANSACTION;

    SELECT namefirst INTO v_studentFirstName FROM student WHERE id=studentID;

    IF v_studentFirstName IS NOT NULL THEN
        SELECT s.ID, s.namefirst, s.namelast, s.DOB, s.emailID, GROUP_CONCAT(sf.name ORDER BY sf.year) AS qualifications FROM student s
            JOIN student_qualifications sf ON s.ID = sf.studentID GROUP BY s.ID, s.namefirst, s.namelast, s.DOB, s.emailID HAVING id=studentID;
    ELSE
    SELECT "Student Not Found!" AS Message;
    END IF;

    COMMIT;
END$$
DELIMITER ;

-- MYSQL CLI
mysql> CALL getQualification(1);
+----+-----------+----------+------------+------------------------+----------------+
| ID | namefirst | namelast | DOB        | emailID                | qualifications |
+----+-----------+----------+------------+------------------------+----------------+
|  1 | saleel    | bagde    | 1984-06-12 | saleel.bagde@gmail.com | 10,12,BE       |
+----+-----------+----------+------------+------------------------+----------------+
1 row in set (0.002 sec)

Query OK, 0 rows affected (0.002 sec)

mysql> CALL getQualification(123232);
+--------------------+
| Message            |
+--------------------+
| Student Not FOUND! |
+--------------------+
1 row in set (0.001 sec)

Query OK, 0 rows affected (0.001 sec)