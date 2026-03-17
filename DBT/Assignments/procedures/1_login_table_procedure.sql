-- Question 1:
-- Create a LOGIN table (username, password, and email).
-- Write a procedure (named addUser) to pass the username, password,
-- and email-ID through the procedure and store the data in the LOGIN table.

DELIMITER $$

DROP PROCEDURE IF EXISTS addUser$$

CREATE PROCEDURE addUser(
    IN p_username varchar(200),
    IN p_pass varchar(100),
    IN p_email varchar(200)
)

BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION -- handling error
    BEGIN
    ROLLBACK; -- ROLLBACK IF SOMETHING goes wrong!
    SELECT "Error Occurred, Transaction rolled back!" AS Message; -- this will display message.
END;

    -- Start Transaction
    START TRANSACTION;

    -- Insert user record
    INSERT INTO LOGIN(username,pass,email) VALUES(p_username,p_pass,p_email);

    -- Commit if everything is perfect and successful
    COMMIT;
    --  Display message to the user that data has been inserted.
    SELECT 'Data Inserted!' AS Message;
END$$

DELIMITER ;

-- SQL CLI

CREATE TABLE LOGIN(username varchar(200), pass varchar(200), email varchar(100));
source /Users/swym/Downloads/login.sql
CALL addUser('Swayam Terode', 'Password@123', 'swym@gmail.com');
SELECT * FROM LOGIN;