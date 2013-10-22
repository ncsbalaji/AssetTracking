package com.infotech.hibernatePojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class User {
	
	@Id
	@Column(name = "user_id")
	private long user_id;
	
	@Column(name ="user_name")
	private String user_name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "user_role_id")
	private long role_id;
	
	@Column(name = "vertical_name")
	private String vertical_name;
	
	@ManyToOne
	@JoinColumn(name = "user_role_id", insertable = false, updatable = false)
	private Role role;
	
	@OneToMany
	@JoinColumn(name = "asset_user_id")
	private List<AssetDetails> assetList;
	
	public User(){
		
	}
	
	public User(long user_id, String user_name, String password, String email, long role_id, String vertical_name){
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.email = email;
		this.role_id = role_id;
		this.vertical_name = vertical_name;
	}

	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getRole_id() {
		return role_id;
	}
	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}
	public String getVertical_name() {
		return vertical_name;
	}
	public void setVertical_name(String vertical_name) {
		this.vertical_name = vertical_name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	public List<AssetDetails> getAssetList() {
		return assetList;
	}

	public void setAssetList(List<AssetDetails> assetList) {
		this.assetList = assetList;
	}
	
}
