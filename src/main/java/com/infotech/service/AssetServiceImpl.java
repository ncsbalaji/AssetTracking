package com.infotech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.dao.AssetDao;
import com.infotech.hibernatePojo.AssetDetails;
import com.infotech.hibernatePojo.AssetType;
import com.infotech.hibernatePojo.Location;
import com.infotech.hibernatePojo.Role;
import com.infotech.hibernatePojo.User;
@Service
public class AssetServiceImpl implements AssetService {
	
	@Autowired
	private AssetDao assetDao;
	
	public AssetServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		assetDao.addUser(user);
	}

	@Override
	@Transactional
	public void removeUser(Integer user_id) {
		// TODO Auto-generated method stub
		assetDao.removeUser(user_id);
	}

	@Override
	@Transactional
	public void removeAsset(Integer assetId) {
		// TODO Auto-generated method stub
		assetDao.removeAsset(assetId);
	}

	@Override
	@Transactional
	public void updateAsset(AssetDetails assetDetails) {
		// TODO Auto-generated method stub
		assetDao.updateAsset(assetDetails);
	}

	@Override
	@Transactional
	public List<AssetDetails> getAllAssetDetails(String AssetType) {
		// TODO Auto-generated method stub
		return assetDao.getAllAssetDetails(AssetType);
	}

	@Override
	@Transactional
	public void addLocaton(Location location) {
		// TODO Auto-generated method stub
		assetDao.addLocaton(location);
		
	}

	@Override
	@Transactional
	public List<Location> getLocations() {
		// TODO Auto-generated method stub
		return assetDao.getLocations();
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return assetDao.getUsers();
	}

	@Override
	@Transactional
	public List<AssetType> getAssetTypes() {
		// TODO Auto-generated method stub
		return assetDao.getAssetTypes();
	}

	@Override
	@Transactional
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return assetDao.getRoles();
	}

	@Override
	@Transactional
	public void addAssetDetails(AssetDetails assetDetails) {
		// TODO Auto-generated method stub
		assetDao.addAssetDetails(assetDetails);
	}

	@Override
	@Transactional
	public AssetDetails getAssetDetails(Integer asset_details_id) {
		// TODO Auto-generated method stub
		return assetDao.getAssetDetails(asset_details_id);
	}

	@Override
	public String getStatistics() {
		// TODO Auto-generated method stub
		return assetDao.getStatistics();
	}

}
