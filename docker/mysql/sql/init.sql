CREATE DATABASE IF NOT EXISTS mysqldb;

CREATE TABLE IF NOT EXISTS genres(
    id INTEGER not null,
    genre varchar(20) not null,
    PRIMARY KEY (id, genre)
);
CREATE TABLE IF NOT EXISTS targets(
    id INTEGER not null,
    target varchar(10) not null,
    PRIMARY KEY (id, target)
);
CREATE TABLE IF NOT EXISTS features(
    id INTEGER not null,
    feature varchar(20) not null,
    PRIMARY KEY (id, feature)
);


INSERT INTO genres(id,genre)VALUES(1, 'RPG');
INSERT INTO targets(id,target)VALUES(1, '男性');
INSERT INTO features(id,feature)VALUES(1, '勇者');
INSERT INTO features(id,feature)VALUES(2, '魔法');
INSERT INTO features(id,feature)VALUES(3, '西洋');