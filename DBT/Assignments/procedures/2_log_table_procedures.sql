-- Question 2

-- Create a LOG table having following columns (id (auto_increment), curr_date, curr_time, and message).
-- Write a procedure (named checkUser) to pass the email-ID as an input,
-- check whether the passed email-ID is available in the LOGIN table or not available.
-- If the email-ID is available then display the username and his password.
-- If the email-ID is not available then, insert (curr_date, curr_time, and message) in the LOG table.

DELIMITER $$
DROP PROCEDURE IF EXISTS checkUser$$

CREATE PROCEDURE checkUser(IN p_email varchar(200))
BEGIN
    DECLARE v_username VARCHAR(200);
    DECLARE v_password VARCHAR(200);

    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        SELECT"Procedure failed!" AS Message;
    END;

    -- Start Transaction
    START TRANSACTION;

    -- CHECK THE CONDITION
    SELECT username, pass INTO v_username, v_password FROM login WHERE p_email=email LIMIT 1; 
    -- this is just safeguard check to avoid the duplicates records, 
    -- think of this like if there are more than 2 records who show same results 
    -- then this would pick the first record.

    -- CHECKING THE CONDITION
    IF v_username IS NOT NULL THEN
        SELECT v_username AS Username, v_password As Password;
    ELSE
        INSERT INTO LOG(currDate, currTime, message)
                VALUES(CURDATE(), CURTIME(), CONCAT("Email ",p_email, " Not found in login table!"));
      SELECT * FROM LOG;
    END IF;
    COMMIT;
    SELECT "LOG Operations done!" AS Message;
END$$
DELIMITER ;

-- CLI CODE

mysql> CALL checkUser('swayam@gmail.com');
+----+------------+----------+---------------------------------------------------+
| ID | currDate   | currTime | message                                           |
+----+------------+----------+---------------------------------------------------+
|  1 | 2026-03-17 | 16:00:23 | Email swym@gmail.com  Not found in login table!   |
|  2 | 2026-03-17 | 16:00:37 | Email swysdsm@gmail.com Not found in login table! |
|  3 | 2026-03-17 | 16:02:54 | Email  Not found in login table!                  |
|  4 | 2026-03-17 | 18:31:41 | Email swayam@gmail.com Not found in login table!  |
+----+------------+----------+---------------------------------------------------+
4 rows in set (0.003 sec)

+----------------------+
| Message              |
+----------------------+
| LOG Operations done! |
+----------------------+
1 row in set (0.005 sec)

Query OK, 0 rows affected (0.005 sec)

