create database proceduredb ;
use proceduredb;;


#Write procedure to print natural numbers from 1 to 10 using do-While control flow statement.
DELIMITER //
CREATE PROCEDURE PrintNaturalNumbers()
BEGIN
    DECLARE counter INT DEFAULT 1;
    DECLARE result VARCHAR(255) DEFAULT '';
    WHILE counter <= 10 DO
        -- Concatenate the current natural number to the result
        SET result = CONCAT(result, counter, ':');
        SET counter = counter + 1;
    END WHILE;
    -- Print the result without trailing colon
    SELECT result AS Result;
END //
DELIMITER ;

-- Call the stored procedure
CALL PrintNaturalNumbers();

#Write an Sql program in Procedure print even numbers up to 10 using- loop – flow control statement.
DELIMITER //
CREATE PROCEDURE PrintEvenNumbersUpTo10()
BEGIN
    DECLARE counter INT DEFAULT 2;
    DECLARE result VARCHAR(255) DEFAULT '';

    WHILE counter <= 10 DO
        -- Concatenate the current even number to the result
        SET result = CONCAT(result, IF(result = '', '', ','), counter);
        -- Increment counter by 2 to get the next even number
        SET counter = counter + 2;
    END WHILE;
    -- Print the result
    SELECT result AS Result;
END //
DELIMITER ;

-- Call the stored procedure
CALL PrintEvenNumbersUpTo10();

#create table student with roll no, name,course,marks
create table student(RollNo int, name varchar(20), course varchar(20), marks int);

#create insert trigger
DELIMITER //
create trigger before_insert_student 
before insert on student
FOR EACH ROW
BEGIN
    -- Ensure that Mark is within the range of 20 to 100
    IF NEW.marks < 20 THEN
        SET NEW.marks = 20;
    ELSEIF NEW.marks > 100 THEN
        SET NEW.marks = 100;
    END IF;
END;
//
DELIMITER ;

#create update trigger
DELIMITER @
create trigger before_update_student
before update on student
FOR EACH ROW
BEGIN
	if new.marks < 20 then
		set new.marks = 20;
    elseif new.marks > 100 then
		set new.marks = 100;
    END if;
END;
@
DELIMITER ;

# insert and update some records
insert into student values(1, 'Nisha', 'java', 55),(2, 'Ann', 'c++', 70);
insert into student values(3, 'Remya', 'DBMS', 45);
select * from student;     

update student set mark=100 where name= 'Ann';
update student set mark= 250 where name ='Nisha';

# create customer table
create table CUSTOMERS (ID int ,NAME varchar(20) ,AGE int,ADDRESS varchar(30),SALARY int);

#insert some records
insert into CUSTOMERS values(1,'Nisha',25,'Pune',80000),(2,'Ivan',24,'Mumbai',50000),(3,'Alice',29,'Delhi',5000);
select * from CUSTOMERS;

#create the update trigger for customer table
DELIMITER //
CREATE TRIGGER salary_difference_trigger
BEFORE UPDATE ON CUSTOMERS
FOR EACH ROW
BEGIN
    DECLARE salary_difference INT;

    IF OLD.SALARY > NEW.SALARY THEN
        SET salary_difference = OLD.SALARY - NEW.SALARY;
        SELECT CONCAT('Salary decreased by ', salary_difference) INTO @message;
        SET @message = 'No salary decrease detected.';
        -- Handle the exception by storing the message in a user-defined variable
    END IF;
END;
//
DELIMITER ;


-- Update a row where the old salary is greater than the new salary
UPDATE CUSTOMERS SET SALARY = 55000 WHERE ID = 1;

select @message;



#create table prduct_price_history and product
create table product(product_id int, product_name varchar(32),
supplier_name varchar(32), unit_price int);

create table product_price_history(product_id int, product_name varchar(32),
supplier_name varchar(32), unit_price int);

#create update trigger
DELIMITER //
CREATE TRIGGER update_price_history
AFTER UPDATE ON product
FOR EACH ROW
BEGIN
    INSERT INTO product_price_history (product_id, product_name, supplier_name, unit_price)
    VALUES (OLD.product_id, OLD.product_name, OLD.supplier_name, OLD.unit_price);
END //
DELIMITER ;


insert into product values(1,'Laptop','Dell',60000),(2,'Keyboard','Hp',500),(3,'Pendrive','Sandisk',850);
insert into product values(4,'Bag','Kitex',670),(5,'Chair','Nilkamal',490),(6,'Watch','Boat',6990);

select * from product;

UPDATE product
SET unit_price = 690
WHERE product_id = 5;

select * from product_price_history;

#Create a Procedure to read all records from Product table using a cursor. After fetching Done by one the rows, display Product Id and Product name of products with price > 500
-- Create Procedure to fetch records with price > 500
DELIMITER //
CREATE PROCEDURE fetch_products_with_price_above_500()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE product_id_val INT;
    DECLARE product_name_val VARCHAR(255);

    -- Declare the cursor
    DECLARE product_cursor CURSOR FOR
        SELECT product_id, product_name
        FROM product
        WHERE unit_price > 500;

    -- Declare continue handler
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    -- Open the cursor
    OPEN product_cursor;

    -- Start fetching rows
    FETCH_LOOP: LOOP
        -- Fetch data into variables
        FETCH product_cursor INTO product_id_val, product_name_val;

        -- Check if no more rows to fetch
        IF done = 1 THEN
            LEAVE FETCH_LOOP;
        END IF;

        -- Display Product Id and Product Name
        SELECT CONCAT('Product Id: ', product_id_val, ', Product Name: ', product_name_val) AS Product_Info;

    END LOOP;

    -- Close the cursor
    CLOSE product_cursor;

END //

DELIMITER ;

CALL fetch_products_with_price_above_500;




