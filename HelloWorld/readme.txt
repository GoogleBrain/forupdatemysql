说明：
for update 是行级锁。MYSQL表的主键必须是Integer类型的，才能实现行级锁；

启动事务后，在另一个事务中不能对行级锁所在行的数据就行修改，除非是这个事务提交了。

create table student(
id integer primary key AUTO_INCREMENT,
name varchar(20),
age varchar(20));