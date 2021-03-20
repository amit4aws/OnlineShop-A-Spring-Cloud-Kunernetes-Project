package com.onlineshop.item.rest;

import java.util.List;
import com.onlineshop.item.entity.Item;
import com.onlineshop.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;


@RestController
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());

	
	@GetMapping("/getAllItemsOnCart")
	public List<Item> getItemsOnCart() {
		logger.info("ItemController :: getItemsOnCart ");
		return itemRepository.getAll();
	}


	



}
