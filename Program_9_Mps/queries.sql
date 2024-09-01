CREATE TABLE users (
    uid INT PRIMARY KEY AUTO_INCREMENT,
    fname VARCHAR(50),
    lname VARCHAR(50),
    email VARCHAR(100) UNIQUE,
    mobile VARCHAR(15)
);

CREATE TABLE messages (
    mid INT PRIMARY KEY AUTO_INCREMENT,
    `from` VARCHAR(100),
    `to` VARCHAR(100),
    msg TEXT,
    uid INT,
    FOREIGN KEY (uid) REFERENCES users(uid)
);
