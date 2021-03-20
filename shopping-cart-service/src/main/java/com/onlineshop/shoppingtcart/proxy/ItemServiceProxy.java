package com.onlineshop.shoppingtcart.proxy;

import java.util.List;

import com.onlineshop.shoppingtcart.entity.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name ="item-service")
public interface ItemServiceProxy {
	
	@GetMapping("/getAllItemsOnCart")
	public List<Item> getAllItemsOnCart();

}
