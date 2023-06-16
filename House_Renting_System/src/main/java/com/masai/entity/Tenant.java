package com.masai.entity;

public class Tenant {
	private int id;
	private String name;
	private String userName;
	private String password;
}

/*
 * Table : tenant

id: int auto_increment
name: string not null
username: string unique not null
password:string not null
type: enum(student, working_professional)
is_bachelor: enum(yes,no);*
 */