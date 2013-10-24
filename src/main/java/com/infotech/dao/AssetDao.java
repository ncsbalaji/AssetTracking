package com.infotech.dao;

import java.util.List;

import com.infotech.hibernatePojo.AssetDetails;
import com.infotech.hibernatePojo.AssetType;
import com.infotech.hibernatePojo.Location;
import com.infotech.hibernatePojo.User;

public interface AssetDao {
	public void addUser(User user);
	public void removeUser(Integer user_id);
	public void removeAsset(Integer assetId);
	public void updateAsset(AssetDetails assetDetails);
	public List<AssetDetails> getAllAssetDetails(String AssetType);
	public void addLocaton(Location location);
	public List<Location> getLocations();
	public List<User> getUsers();
	public List<AssetType> getAssetTypes();
}
