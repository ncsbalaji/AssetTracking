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
@Table(name = "Location")
public class Location {
	
	@Id
	@GeneratedValue
	@Column(name = "location_id")
	private long location_id;
	
	@Column(name = "location_name")
	private String location_name;
	
	@OneToMany
	@JoinColumn(name = "asset_location_id")
	private List<AssetDetails> assetList;
	
	public Location(){
		
	}
	
	public Location(String location_name){
		this.location_name = location_name;
	}
	
	public long getLocation_id() {
		return location_id;
	}
	public void setLocation_id(long location_id) {
		this.location_id = location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public List<AssetDetails> getAssetList() {
		return assetList;
	}

	public void setAssetList(List<AssetDetails> assetList) {
		this.assetList = assetList;
	}

}
