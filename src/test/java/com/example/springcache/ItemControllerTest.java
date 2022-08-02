package com.example.springcache;

import static org.junit.jupiter.api.Assertions.*;

import com.example.springcache.entity.Item;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
		itemRepository.save(item);
	}

	@Test
	void getItem() {

		final LocalDateTime start = LocalDateTime.now();
		itemController.getItemName(1L);
		final LocalDateTime end = LocalDateTime.now();

		System.out.println(end.getSecond() - start.getSecond());

		final LocalDateTime start1 = LocalDateTime.now();
		itemController.getItemName(1L);
		final LocalDateTime end1 = LocalDateTime.now();
		System.out.println(end1.getSecond() - start1.getSecond());
	}
}
