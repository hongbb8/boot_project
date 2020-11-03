package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Shop;
import com.example.demo.mapper.ShopMapper;

@Controller
@RequestMapping("shop")
public class ShopController {

	@Autowired
	private ShopMapper mapper;
	
	@RequestMapping("list")
	public String findShopList(Model model){
		List<Shop> slist = mapper.findAll();
		model.addAttribute("slist", slist);
		return "hh";
	}
	@RequestMapping("toAdd")
	public String toAdd(){
		return "add";
	}
	@RequestMapping("add")
	public String add(Shop shop){
		mapper.save(shop);
		return "redirect:list";
	}
	@RequestMapping("del")
	public String del(Shop shop){
		mapper.delete(shop);
		return "redirect:list";
	}
	
	@RequestMapping("toup")
	public String toup(Long sid,Model model){
		Shop shop = mapper.findBySid(sid);
		model.addAttribute("shop", shop);
		return "toup";
	}
	
	
	@RequestMapping("up")
	public String up(Shop shop){
		mapper.save(shop);
		return "redirect:list";
	}
	
}
