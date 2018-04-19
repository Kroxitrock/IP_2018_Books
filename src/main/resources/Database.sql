drop database if exists books;
create database books;

use books;

create table language(
  id int auto_increment unique primary key,
  name varchar(100) unique
);

create table user(
	  id int auto_increment unique primary key,
    name varchar(120) unique,
    password varchar(40),
    email varchar(150) unique,
    preferred_language int,

    foreign key (preferred_language) references language(id)
);

create table author(
    id int auto_increment unique primary key,
    name varchar(255),
    bio varchar(1000)
);

create table book(
    id int auto_increment unique primary key,
    author_id int,
    release_date date,
    genre varchar(255),
    cover_path varchar(255),

    foreign key (author_id) references author(id)
);

create table book_description(
    id int auto_increment unique primary key,
    book_id int,
    language_id int,
    name varchar(255),
    description varchar(10000),
    pages int,

    foreign key (book_id) references book(id),
    foreign key (language_id) references language(id)
);

create table read_list(
    id int auto_increment unique primary key,
    user_id int,
    book_id int,
    status int(10),

    foreign key (user_id) references user(id),
    foreign key (book_id) references book(id)
);

create table comments(
  id int auto_increment unique primary key,
  user_id int,
  book_id int,
  body varchar(255),
  rating decimal,

  foreign key (user_id) references user(id),
  foreign key (book_id) references book(id)
);
