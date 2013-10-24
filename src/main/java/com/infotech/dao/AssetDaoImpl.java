package com.infotech.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infotech.hibernatePojo.AssetDetails;
import com.infotech.hibernatePojo.User;
@Repository
public class AssetDaoImpl implements AssetDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public AssetDaoImpl(){
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void removeUser(Integer user_id) {
		// TODO Auto-generated method stub
		User user = (User)sessionFactory.getCurrentSession().load(User.class, user_id);
		if(user != null){
			sessionFactory.getCurrentSession().delete(user);
		}

	}

	@Override
	public void removeAsset(Integer assetId) {
		// TODO Auto-generated method stub
		AssetDetails assetDetails = (AssetDetails)sessionFactory.getCurrentSession().load(AssetDetails.class, assetId);
		if(assetDetails != null){
			sessionFactory.getCurrentSession().delete(assetDetails);
		}
	}

	@Override
	public void updateAsset(AssetDetails assetDetails) {
		// TODO Auto-generated method stub
		AssetDetails assetDetailsUpdate =new AssetDetails();
		assetDetailsUpdate.setAsset_details_id(assetDetails.getAsset_details_id());
		assetDetailsUpdate.setAsset_type_id(assetDetails.getAsset_type_id());
		assetDetailsUpdate.setAssetType(assetDetails.getAssetType());
		assetDetailsUpdate.setAssocitate_id(assetDetails.getAssocitate_id());
		sessionFactory.getCurrentSession().update(assetDetailsUpdate);
	}

	@Override
	public List<AssetDetails> getAllAssetDetails(String assetType) {
		// TODO Auto-generated method stub
		String queryString = "from AssetDetails";
		if (assetType.equals("laptop")) {
			queryString += " where assetDetails_type_id = (select asset_type_id from AssetType where asset_type_name = '"+"Laptop')";
		}
		if(assetType.equals("desktop")){
			queryString += " where assetDetails_type_id = (select asset_type_id from AssetType where asset_type_name = '"+"Desktop')";
		}
		return sessionFactory.getCurrentSession().createQuery(queryString).list();
	}

}
