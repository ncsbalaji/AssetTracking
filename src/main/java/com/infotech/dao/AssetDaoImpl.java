package com.infotech.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infotech.hibernatePojo.AssetDetails;
import com.infotech.hibernatePojo.AssetType;
import com.infotech.hibernatePojo.Location;
import com.infotech.hibernatePojo.Role;
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
		assetDetailsUpdate.setAssetDetails_type_id(assetDetails.getAssetDetails_type_id());
		assetDetailsUpdate.setAssetType(assetDetails.getAssetType());
		assetDetailsUpdate.setAssociate_id(assetDetails.getAssociate_id());
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

	@Override
	public void addLocaton(Location location) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(location);
		
	}

	@Override
	public List<Location> getLocations() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Location").list();
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Override
	public List<AssetType> getAssetTypes() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from AssetType").list();
	}

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Role").list();
	}

	@Override
	public void addAssetDetails(AssetDetails assetDetails) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(assetDetails);
		
	}

	@Override
	public AssetDetails getAssetDetails(Integer asset_details_id) {
		// TODO Auto-generated method stub
		return (AssetDetails)sessionFactory.getCurrentSession().load(AssetDetails.class, asset_details_id.longValue());
	}
	
	@Override
	public String getStatistics(){
		return sessionFactory.getStatistics().getSessionOpenCount()+" --open sessions "+sessionFactory.getStatistics().getSessionCloseCount()+"--close sessions";
	}

}
