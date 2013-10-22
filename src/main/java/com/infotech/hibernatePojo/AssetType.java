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
@Table(name = "AssetType")
public class AssetType {
	
	@Id
	@GeneratedValue
	@Column(name = "asset_type_id")
	private long asset_type_id; 
	
	@Column(name = "asset_type_name")
	private String asset_type_name;
	
	@OneToMany
	@JoinColumn(name = "assetDetails_type_id")
	//@IndexColumn(name ="asset_id")
	private List<AssetDetails> assetList;
	
	public AssetType(){
		
	}
	
	public AssetType(String asset_type_name){
		this.asset_type_name = asset_type_name;
	}
	
	public long getAsset_id() {
		return asset_type_id;
	}
	public void setAsset_id(long asset_type_id) {
		this.asset_type_id = asset_type_id;
	}
	public String getAsset_name() {
		return asset_type_name;
	}
	public void setAsset_name(String asset_type_name) {
		this.asset_type_name = asset_type_name;
	}
	public List<AssetDetails> getAssetList() {
		return assetList;
	}
	public void setAssetList(List<AssetDetails> assetList) {
		this.assetList = assetList;
	}
	
}
