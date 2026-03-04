USE ex0303;

-- 1-1번
create table users (
	user_seq int primary key, -- 1-2번
    name varchar(10),
    email varchar(30) not null unique, -- 1-3번
    phone varchar(13),
    is_sleep varchar(2) default 'N' -- 1-4번
);

-- 2번
insert into users(user_seq, name, email, phone) values (111, "홍길동", "hong@gildong.com", "010-1111-1111");
insert into users(user_seq, name, email, phone) values (222, "이길동", "lee@gildong.com", "010-2222-2222");
insert into users(user_seq, name, email, phone) values (333, "삼길동", "sam@gildong.com", "010-3333-3333");

-- 3번
select * from users;

delete from users;

-- 4번
update users set is_sleep = 'Y' where user_seq = 222;

-- 5번
insert into users(user_seq, name, email, phone) values (222, '이길동2', 'lee2@gildong.com', '010-2222-2222');
-- Error Code: 1062. Duplicate entry '222' for key 'users.PRIMARY'

-- 6번
insert into users(user_seq, name, email, phone) values (2222, '이길동2', 'lee2@gildong.com', '010-2222-2222');
-- 오류 없음

-- 7번
insert into users(user_seq, name, phone) values (2222, '이길동2', '010-2222-2222');
-- Error Code: 1364. Field 'email' doesn't have a default value

-- 8번
insert into users(user_seq, name, phone) values (2222, '이길동2', 'lee2@gildong.com', '010-2222-2222');
-- Error Code: 1136. Column count doesn't match value count at row 1

-- 9번
select * from users where user_seq = 2222;
delete from users where user_seq = 2222;
select * from users;

-- 10번
drop table users;




-- --------------------------------------------------------------------------------------------
-- WS01 users테이블을 생성한 데이터베이스에서 작업한다.
USE ex0303;

select * from users;

insert into users (user_seq, name, email, phone) values (444, '사길동', 'sa@gildong@com', '010-4444-4444');
insert into users (user_seq, name, email, phone) values (555, '오길동', 'o@gildong@com', '010-5555-5555');

CREATE TABLE account
( 
    account_seq   INT PRIMARY KEY,
    account_number VARCHAR(50) not null,
    balance       INT,
    user_seq      INT ,
    foreign key(user_seq) references users(user_seq)
);

select * from account;
delete from account;
drop table account;

insert into account (account_seq, account_number, balance, user_seq) values (50, '00500505005005', 3000, 222);
insert into account (account_seq, account_number, balance, user_seq) values (10, '00100101001001', 1000, 111);
insert into account (account_seq, account_number, balance, user_seq) values (30, '00300303003003', 5000, 222);
insert into account (account_seq, account_number, balance, user_seq) values (70, '00700707007007', 7000, 444);
insert into account (account_seq, account_number, balance, user_seq) values (40, '00400404004004', 4000, 222);
insert into account (account_seq, account_number, balance, user_seq) values (60, '00600606006006', 2000, 222);
insert into account (account_seq, account_number) values (80, '00800808008008');
insert into account (account_seq, account_number, balance, user_seq) values (20, '00200202002002', 6000, 111);

SELECT * FROM USERS;
SELECT * FROM ACCOUNT;

-- 1번
select * from account where user_seq = 111;

-- 2번
select * from account where balance < 5000;

-- 3번
select * from account where balance between 5000 and 10000;

-- 4번
select * from account where account_number like '%4%';

-- 5번
select * from users where name like '삼%';

-- 6번
select distinct * from users;

-- 7번
select * from account where balance is null;

-- 8번
select * from account where user_seq is not null;

-- 9번
select * from account where user_seq is not null and balance <= 4000;

-- 10번
select * from account order by user_seq;

-- 11번
select * from account order by user_seq, balance desc;

-- 12번
select * from account where balance is null;
update account set balance = 0 where balance is null;

-- 13번
select email from users;
select substring_index(email, '@', 1) as email_id from users;