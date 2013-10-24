package com.infotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.hibernatePojo.AssetDetails;
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
		modelAndView.addObject("assetList", assetList);
		return modelAndView;
		
	}

}
