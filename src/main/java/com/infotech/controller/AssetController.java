package com.infotech.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.hibernatePojo.AssetDetails;
import com.infotech.hibernatePojo.Location;
import com.infotech.hibernatePojo.Role;
import com.infotech.hibernatePojo.User;
import com.infotech.pojo.LocationFormPojo;
import com.infotech.service.AssetService;

@Controller
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	@RequestMapping(value="/index")
	public ModelAndView test(){
		return new ModelAndView("assetSelection");
	}
	
	@RequestMapping(value="/assetSelection.do/type/{type}", method = RequestMethod.GET)
	public ModelAndView assetSelection(@PathVariable String type){
		List<AssetDetails> assetList = assetService.getAllAssetDetails(type);
		ModelAndView modelAndView = new ModelAndView("displayAssets");
		modelAndView.addObject("assetType", type);
		modelAndView.addObject("assetList", assetList);
		return modelAndView;
	}
	
	/*@RequestMapping(value="/asset/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editAssetPage(@PathVariable Integer id, @ModelAttribute List<AssetDetails> assetList){
		System.out.println("****"+ assetList.size());
		AssetDetails assetDetails = new AssetDetails();
		Iterator<AssetDetails> assetListIterator = assetList.listIterator();
		while(assetListIterator.hasNext()){
			System.out.println("***"+assetListIterator.next().getComp_name());
		}
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("locationList", assetService.getLocations());
		modelMap.addAttribute("userList",assetService.getUsers());
		modelMap.addAttribute("typeList",assetService.getAssetTypes());
		
		modelMap.addAttribute("assetDetails", assetDetails);
		
		ModelAndView modelAndView = new ModelAndView("editAsset");
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}*/
	@RequestMapping(value="/asset/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editAssetPage(@PathVariable Integer id){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("locationList", assetService.getLocations());
		System.out.println("in edit asset page controller");
		modelMap.addAttribute("userList",assetService.getUsers());
		modelMap.addAttribute("typeList",assetService.getAssetTypes());
		/*AssetDetails assetDetails = new AssetDetails(); 
		assetDetails = assetService.getAssetDetails(id);
		System.out.println(assetDetails.getComp_name()+"****________*********** "+ assetDetails.getAsset_details_id());*/
		modelMap.addAttribute("assetDetails", assetService.getAssetDetails(id));
		
		ModelAndView modelAndView = new ModelAndView("editAsset");
		modelAndView.addAllObjects(modelMap);
		System.out.println("**session statistics***"+assetService.getStatistics());
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editAsset(){
		return new ModelAndView();
	}
	
	@RequestMapping(value="/asset/addAsset", method = RequestMethod.GET)
	public ModelAndView addAssetPage(){
		ModelAndView modelAndView = new ModelAndView("addAsset");
		ModelMap modelMap = new ModelMap();
		/*AssetDetails assetDetails = new AssetDetails();
		modelMap.addAttribute("assetDetails", assetDetails);*/
		modelMap.addAttribute("locationList", assetService.getLocations());
		modelMap.addAttribute("userList",assetService.getUsers());
		modelMap.addAttribute("typeList",assetService.getAssetTypes());
		modelMap.addAttribute("asset",new AssetDetails());
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/addAsset/process", params={"cancel!=true"})
	public ModelAndView addingAsset(@ModelAttribute AssetDetails asset){
		AssetDetails assetDetails = new AssetDetails(asset.getAssociate_id(),asset.getLocation_id(),asset.getAssetDetails_type_id(),
				 asset.getIp_address(), asset.getComp_name(), asset.getModel(), asset.getTrack_number(), 
				 asset.getMonitor_number(), asset.getRam(), asset.getHardDrive());
		assetService.addAssetDetails(assetDetails);
		ModelAndView modelAndView = new ModelAndView("assetSelection");
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/addLocation")
	public ModelAndView addLocationPage(){
		ModelAndView modelAndView = new ModelAndView("addLocation");
		modelAndView.addObject("locationPojo",new LocationFormPojo());
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/addUser")
	public ModelAndView addUserPage(){
		ModelAndView modelAndView = new ModelAndView("addUser");
		ModelMap modelMap = new ModelMap();
		List<Role> roleList = assetService.getRoles();
		modelMap.addAttribute("user", new User());
		modelMap.addAttribute("roleList", roleList);
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/addUser/process", params={"cancel!=true"})
	public ModelAndView addingUser(@ModelAttribute User user){
		User addUser = new User(user.getUser_id(), user.getUser_name(), 
				user.getPassword(), user.getEmail(),user.getRole_id(),user.getVertical_name());
		assetService.addUser(addUser);
		ModelAndView modelAndView = new ModelAndView("assetSelection");
		return modelAndView;
	}
	
	@RequestMapping(params="cancel=true")
	public ModelAndView cancelPage(){
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/addLocation/process", params={"cancel!=true"})
	public ModelAndView addingLocation(@ModelAttribute LocationFormPojo locationPojo){
		Location location = new Location(locationPojo.getCity()+"-"+locationPojo.getArea()+"-"
							+locationPojo.getPhase()+"-"+locationPojo.getFloor()+"-"+locationPojo.getBlock());
		
		assetService.addLocaton(location);
		ModelAndView modelAndView = new ModelAndView("assetSelection");
		return modelAndView;
	}

}
