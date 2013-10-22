package com.infotech.hibernatePojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name="Roles")
public class Role {
	
	@Id
	@GeneratedValue
	@Column(name ="role_id")
	private long role_id;
	
	@Column(name = "role_name")
	private String role_name;

	@OneToMany
	@JoinColumn(name = "user_role_id")
	//@IndexColumn(name = "user_role_id")
	//the column in which the index is stored in users table
	private List<User> users;
	
	public Role(){
		
	}
	
	public Role(String role_name){
		this.role_name = role_name;
	}
	
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public long getRole_id() {
		return role_id;
	}
	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
