package com.infotech.service;

import java.util.List;

import com.infotech.hibernatePojo.AssetDetails;
import com.infotech.hibernatePojo.User;

public interface AssetService {
	public void addUser(User user);
	public void removeUser(Integer user_id);
	public void removeAsset(Integer assetId);
	public void updateAsset(AssetDetails assetDetails);
	public List<AssetDetails> getAllAssetDetails(String AssetType);
}