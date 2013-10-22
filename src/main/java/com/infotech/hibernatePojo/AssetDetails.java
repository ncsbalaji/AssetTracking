package com.infotech.hibernatePojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AssetDetails")
public class AssetDetails {
	
	@Id
    @GeneratedValue
    @Column
	private long asset_details_id;
	
	@Column( name = "asset_user_id")
	private long associtate_id;
	
	@Column( name = "asset_location_id")
	private long location_id;
	
	@Column
	private String ip_address;
	
	@Column
	private String comp_name;
	
	@Column
	private String model;
	
	@Column
	private String track_number;
	
	@Column
	private String monitor_number;
	
	@Column
	private String ram;
	
	@Column
	private String hardDrive;
	
	@Column(name = "assetDetails_type_id")
	private long assetDetails_type_id;
	
	@ManyToOne
	@JoinColumn( name = "assetDetails_type_id", insertable = false, updatable = false)
	private AssetType assetType;
	
	@ManyToOne
	@JoinColumn( name = "asset_user_id", insertable = false, updatable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn( name = "asset_location_id", insertable = false, updatable = false)
	private Location location;
		
	public AssetDetails(){
		
	}
	
	public AssetDetails(long associate_id, long location_id, long assetDetails_type_id, String ip_address, String comp_name, String model, String track_number, String monitor_number, String ram, String hardDrive){
		this.associtate_id = associate_id;
		this.location_id = location_id;
		this.assetDetails_type_id = assetDetails_type_id;
		this.ip_address = ip_address;
		this.model = model;
		this.track_number = track_number;
		this.monitor_number = monitor_number;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.comp_name = comp_name;
	}

	public long getAssocitate_id() {
		return associtate_id;
	}

	public void setAssocitate_id(long associtate_id) {
		this.associtate_id = associtate_id;
	}

	public long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(long location_id) {
		this.location_id = location_id;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrack_number() {
		return track_number;
	}

	public void setTrack_number(String track_number) {
		this.track_number = track_number;
	}

	public String getMonitor_number() {
		return monitor_number;
	}

	public void setMonitor_number(String monitor_number) {
		this.monitor_number = monitor_number;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public long getAsset_details_id() {
		return asset_details_id;
	}

	public void setAsset_details_id(long asset_details_id) {
		this.asset_details_id = asset_details_id;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public long getAsset_type_id() {
		return assetDetails_type_id;
	}

	public void setAsset_type_id(long asset_type_id) {
		this.assetDetails_type_id = asset_type_id;
	}
	
	

}
