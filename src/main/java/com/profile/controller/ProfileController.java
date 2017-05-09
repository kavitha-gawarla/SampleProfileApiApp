package com.profile.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.profile.model.Person;
import com.profile.service.ProfileService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	ProfileService profileService;
	
	
	
	
	
	@RequestMapping("/startprofile")
	public String startProfile(Model model) {
		if(!model.containsAttribute("personalInfo")){
		Person personalInfo = new Person();
		model.addAttribute("personalInfo", personalInfo);
		}
		return "startprofile";
	}

	@RequestMapping(value = "saveprofile", method = RequestMethod.POST)
	public String addPersonalInfo(@Valid @ModelAttribute("personalInfo") Person user, BindingResult result,
			 final RedirectAttributes redirectAttributes, Model model) {
		if (result.hasErrors()) {
			 redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.personalInfo", result);
			 
	            redirectAttributes.addFlashAttribute("personalInfo", user);
			return "redirect:startprofile";
		}
		
		profileService.saveProfile(user);
		return "registrationsucess";
	}

}
