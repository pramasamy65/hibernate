/* Drop database if it already exists */
DROP DATABASE IF EXISTS Music;

/* Create database */
CREATE DATABASE Music;

/* Change to the Music database */
USE Music;

/* Create tables */
CREATE TABLE Artists ( ArtistId int IDENTITY(1,1) NOT NULL PRIMARY KEY, ArtistName nvarchar(255) NOT NULL,ActiveFrom DATE NULL);