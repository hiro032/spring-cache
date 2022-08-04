package com.example.springcache;

import com.example.springcache.entity.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ItemService {

	private final ItemRepository itemRepository;

	public ItemService(final ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Cacheable(value = "item")
	public String findById(final Long id) {
		log.info("no cache");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		final Item item = itemRepository.findById(id)
				.orElseThrow(RuntimeException::new);

		return item.getName();
	}
}
