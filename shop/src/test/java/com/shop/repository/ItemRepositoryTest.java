package com.shop.repository;

import com.shop.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    @DisplayName("상품 저장 테스트")
    public void createItemTest() {
        Item item = new Item();
        item.setItemNm("test stuff");
        item.setPrice(10000);
        item.setItemDetail("test stuff detail");
        item.setStockNumber(100);
        item.setRegTime(LocalDateTime.now());
        item.setUpdateTime(LocalDateTime.now());
        Item savedItem = itemRepository.save(item);
        System.out.println(savedItem.toString());
    }

    public void createItemList() {
        for (int i = 1; i <= 10; i++) {
            Item item = new Item();
            item.setItemNm("test stuff" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("test stuff detail" + i);
            item.setStockNumber(100 + i);
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            Item savedItem = itemRepository.save(item);
            System.out.println(savedItem.toString());
        }
    }

    @Test
    @DisplayName("상풍명 조회 테스트")
    public void findByItemNmTest() {
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNm("test stuff1");
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    @Test
    @DisplayName("상품명, 상품상세설명 테스트")
    public void findByItemNmOrItemDetailTest() {
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNmOrItemDetail("test stuff1", "test stuff detail5");
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    @Test
    @DisplayName("가격 Less than 테스트")
    public void findByPriceLessThanTest() {
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThan(10005);
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    @Test
    @DisplayName("가격 내림차순 조회 테스트")
    public void findByPriceLessThanOrderByPriceDescTest() {
        this.createItemList();
        List<Item> itemList = itemRepository.findByPriceLessThanOrderByPriceDesc(10005);
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
}