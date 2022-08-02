package com.example.springcache;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableCaching
@RestController
public class ItemController {

	private final ItemService itemService;

	public ItemController(final ItemService itemService) {
		this.itemService = itemService;
	}


	@GetMapping
	public String getItemName(final Long itemId) {
		return itemService.findById(itemId);
	}

}
