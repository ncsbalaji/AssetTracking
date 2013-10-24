package com.infotech.controller;

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
	
	@RequestMapping(value="/asset/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editAssetPage(@PathVariable Integer id){
		ModelAndView modelAndView = new ModelAndView("editAsset");
		//List<AssetDetails> assetList = assetService.
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/addAsset", method = RequestMethod.GET)
	public ModelAndView addAssetPage(){
		ModelAndView modelAndView = new ModelAndView("addAsset");
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("locations", assetService.getLocations());
		modelMap.addAttribute("users",assetService.getUsers());
		modelMap.addAttribute("assetTypes",assetService.getAssetTypes());
		modelMap.addAttribute("asset",new AssetDetails());
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}
	
	@RequestMapping(value="/asset/addLocation")
	public ModelAndView addLocationPage(){
		ModelAndView modelAndView = new ModelAndView("addLocation");
		modelAndView.addObject("locationPojo",new LocationFormPojo());
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
