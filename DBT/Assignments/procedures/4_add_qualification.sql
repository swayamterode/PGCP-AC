-- Write a procedure (named addQualification) that takes studentID, and qualification details as a parameter.
-- If studentIDis present in the STUDENT table, then insert the qualification in STUDENT_QUALIFICATION table and return a message “Record inserted” or else print ‘Student not found’. 
-- (hint: using OUT parameter) (Use: STUDENT, andSTUDENT_QUALIFICATION tables)

DELIMITER $$
DROP PROCEDURE IF EXISTS addQualification$$
CREATE PROCEDURE addQualification(
  IN  p_studentId   INT,
  IN  p_name        VARCHAR(130),
  IN  p_college     VARCHAR(130),
  IN  p_university  VARCHAR(130),
  IN  p_marks       VARCHAR(45),
  IN  p_year        INT,
  OUT p_message     VARCHAR(200)
)
BEGIN
  DECLARE v_namefirst VARCHAR(200);
  DECLARE v_newID INT;

  DECLARE EXIT HANDLER FOR SQLEXCEPTION
  BEGIN
    ROLLBACK;
    SET p_message = "PROCEDURE FAILED";
    SELECT p_message AS Message;
  END;

  START TRANSACTION;

  -- Check if student exists
  SELECT namefirst INTO v_namefirst 
  FROM student 
  WHERE ID = p_studentId;

  IF v_namefirst IS NOT NULL THEN

    -- Auto-generate next ID
    SELECT COALESCE(MAX(ID), 0) + 1 INTO v_newID 
    FROM student_qualifications;

    INSERT INTO student_qualifications (ID, studentID, name, college, university, marks, year)
    VALUES (v_newID, p_studentId, p_name, p_college, p_university, p_marks, p_year);

    SET p_message = "Record Inserted!";

  ELSE
    SET p_message = "Student Not Found!";
  END IF;

  COMMIT;

  SELECT p_message AS Message;

END$$
DELIMITER ;


-- CALL addQualification(27, 'M.Tech', 'IIT Delhi', 'IIT', '88', 2024, @msg);
-- SELECT @msg;  -- Check OUT parameter value
