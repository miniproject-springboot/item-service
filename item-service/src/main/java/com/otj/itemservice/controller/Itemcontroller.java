package com.otj.itemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.otj.itemservice.model.Item;
import com.otj.itemservice.repository.ItemRepo;

@RestController
public class Itemcontroller {
	
	@Autowired
	private ItemRepo itemRepo;
	
	@GetMapping("service2/items")
	public List<Item> getItems() {
		return itemRepo.findAll();
	}
	@GetMapping("service2/items/{itemname}")
	public Item getItems(@PathVariable String itemname) {
		return itemRepo.findByName(itemname);
	}

}
