/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/3/11 9:40:53                            */
/*==============================================================*/


drop table if exists ACCOUNT;

/*==============================================================*/
/* Table: ACCOUNT                                               */
/*==============================================================*/
create table ACCOUNT
(
   aid                  int(5) not null auto_increment,
   email                varchar(50),
   password             varchar(50),
   nick_name            varchar(50),
   birthday             date,
   primary key (aid)
);

