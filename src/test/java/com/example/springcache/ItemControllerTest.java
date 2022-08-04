package com.example.springcache;

import static org.junit.jupiter.api.Assertions.*;

import com.example.springcache.entity.Item;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItemControllerTest {


	@Autowired
	private ItemController itemController;

	@Autowired
	private ItemRepository itemRepository;

	@BeforeEach
	void setUp() {
		final Item item = new Item("item 1", BigDecimal.TEN);
		final Item item2 = new Item("item 2", BigDecimal.TEN);
		itemRepository.save(item);
		itemRepository.save(item2);
	}

	@Test
	void getItem() {
		List<Item> all = itemRepository.findAll();

		for (Item item : all) {
			System.out.println("item.getId() = " + item.getId());
		}

		final LocalDateTime start = LocalDateTime.now();
		itemController.getItemName(1L);
		final LocalDateTime end = LocalDateTime.now();


		final LocalDateTime start1 = LocalDateTime.now();
		itemController.getItemName(1L);
		final LocalDateTime end1 = LocalDateTime.now();



		final LocalDateTime start2 = LocalDateTime.now();
		itemController.getItemName(2L);
		final LocalDateTime end2 = LocalDateTime.now();


		final LocalDateTime start3 = LocalDateTime.now();
		itemController.getItemName(2L);
		final LocalDateTime end3 = LocalDateTime.now();

	}
}
