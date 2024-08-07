SELECT DISTINCT job FROM Employee;

SELECT * FROM Employee ORDER BY Deptno ASC, Job DESC;

SELECT DISTINCT Job FROM Employee
ORDER BY Job DESC;

SELECT * FROM Employee WHERE Hiredate < '1981-01-01';

SELECT Empno, Ename, Sal, (Sal / 30) AS DailySal, (Sal * 12) AS Annsal FROM Employee ORDER BY Annsal ASC;

SELECT Empno, Ename, Sal, DATEDIFF(CURDATE(), Hiredate) AS Exp FROM Employee WHERE Mgr = 7369;

SELECT * FROM Employee WHERE Comm > Sal;

SELECT * FROM Employee WHERE Job IN ('CLERK', 'ANALYST') ORDER BY Job DESC;

SELECT * FROM Employee WHERE (Sal * 12) BETWEEN 22000 AND 45000;

SELECT Ename FROM Employee WHERE Ename LIKE 'S____';

SELECT * FROM Employee WHERE Empno NOT LIKE '78%';

SELECT * FROM Employee WHERE Job = 'CLERK' AND Deptno = 20;

SELECT e1.* FROM Employee e1 JOIN Employee e2 ON e1.Mgr = e2.Empno WHERE e1.Hiredate < e2.Hiredate;

SELECT * FROM Employee e1 WHERE Deptno = 20 AND Job IN (SELECT DISTINCT Job FROM Employee WHERE Deptno = 10);

SELECT * FROM Employee WHERE Sal IN (SELECT Sal FROM Employee  WHERE Ename IN ('FORD', 'SMITH') ) ORDER BY Sal DESC;

SELECT * FROM Employee WHERE Job IN (SELECT Job FROM Employee WHERE Ename IN ('SMITH', 'ALLEN'));

SELECT DISTINCT JobFROM Employee WHERE Deptno = 10 AND Job NOT IN ( SELECT DISTINCT Job FROM Employee WHERE Deptno = 20);

SELECT MAX(Sal) AS HighestSal FROM Employee;

SELECT * FROM Employee WHERE Sal = (SELECT MAX(Sal) FROM Employee);

SELECT SUM(Sal) AS TotalSal FROM Employee WHERE Job = 'MANAGER';

SELECT * FROM Employee WHERE Ename LIKE '%A%';

SELECT e.* FROM Employee e JOIN (SELECT Job, MIN(Sal) AS MinSal FROM Employee  GROUP BY Job) AS min_salaries ON e.Job = min_salaries.Job AND e.Sal = min_salaries.MinSal ORDER BY e.Sal ASC;

CREATE VIEW v1 AS SELECT e.Ename, e.Job, d.Dname, d.Loc FROM Employee e JOIN Department d ON e.Deptno = d.Deptno;

DELIMITER //
CREATE PROCEDURE FetchEmpAndDeptByDno(IN dno INT)
BEGIN
    SELECT e.Ename, d.Dname
    FROM Employee e
    JOIN Department d ON e.Deptno = d.Deptno
    WHERE e.Deptno = dno;
END //

DELIMITER ;

ALTER TABLE Student ADD Pin BIGINT;
ALTER TABLE Student MODIFY Sname VARCHAR(40);

DELIMITER //

CREATE TRIGGER after_salary_update
AFTER UPDATE ON Employee
FOR EACH ROW
BEGIN
    IF OLD.Sal <> NEW.Sal THEN
        INSERT INTO emp_log (Emp_id, Log_date, New_salary, Action)
        VALUES (NEW.Empno, CURDATE(), NEW.Sal, 'New Salary');
    END IF;
END //

DELIMITER ;




