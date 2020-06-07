CREATE TABLE admin
(
    id varchar(255) PRIMARY KEY,
    user_id varchar(255),
    username varchar(255),
    password varchar(16)
);

CREATE TABLE user
(
    id varchar(255) PRIMARY KEY,
    email varchar(255),
    password varchar(16),
    nickname varchar(255),
    sex varchar(2) check (sex='男'or sex='女'),
    birthday datetime,
    image varchar(255),
    information varchar(255)
);

CREATE TABLE message
(
    id varchar(255) PRIMARY KEY,
    sender_id varchar(255),
    receiver_id varchar(255),
    sendtime datetime,
    content varchar(255),
    is_checked int check (is_checked=0 or is_checked=1)
);

CREATE TABLE trajectory
(
    id varchar(255) PRIMARY KEY,
    start_time datetime,
    end_time datetime,
    user_id varchar(255),
    type varchar(255)
);

CREATE TABLE notification
(
    id varchar(255) PRIMARY KEY,
    admin_id varchar(255),
    content varchar(255),
    publish_time datetime,
    level int
);

CREATE TABLE landmark
(
    id varchar(255) PRIMARY KEY,
    user_id varchar(255),
    longitude varchar(255),
    latitude varchar(255),
    altitude varchar(255),
    time datetime,
    type varchar(255),
    information varchar(255),
    picture varchar(255),
    is_checked int check (is_checked=0 or is_checked=1)
);
insert into landmark values
(1,null,213.1,23.11,23.31,'2018-12-23 10:12:22','军事机构','xqqxxxxx','',true),
(2,null,223.1,232.1,23.41,'2018-12-23 10:12:22','军事机构','xqxxxxx','',true),
(3,null,323.1,23.31,23.31,'2018-12-23 10:12:22','军事机构','xxwxxxx','',true),
(4,null,243.1,23.41,23.21,'2018-12-23 10:12:22','军事机构','xxexxxx','',true),
(5,null,213.1,23.e1,23.11,'2018-12-23 10:12:22','军事机构','xxxdxxx','',true),
(6,null,23.1,23.e1,23.21,'2018-12-23 10:12:22','军事机构','xxxxxxx','',true),
(7,null,423.1,23.14,23.31,'2018-12-23 10:12:22','军事机构','xsxxxxx','',true),
(8,null,253.1,23.51,23.31,'2018-12-23 10:12:22','军事机构','xxxcxxx','',true);
CREATE TABLE trajectory_datail
(
    id varchar(255) PRIMARY KEY,
    user_id varchar(255),
    trajectory_id varchar(255),
    longitude varchar(255),
    latitude varchar(255),
    altitude varchar(255),
    insert_time datetime,
    content varchar(255)
);

添加约束

CREATE INDEX notification_admin_id_index ON notification (admin_id);
#添加foreginkey之前 先要设置索引 索引结构的话暂时没要求

ALTER TABLE admin
    ADD CONSTRAINT admin_notification__fk
        FOREIGN KEY (admin_id) REFERENCES notification (admin_id);



