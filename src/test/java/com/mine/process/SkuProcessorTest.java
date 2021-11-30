package com.mine.process;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class SkuProcessorTest {
	/**
	 * Scenario A
	 */
	@Test
	public void test1() {
		HashMap<String, SkuDetails> cart = new HashMap<>();
		SkuDetails sku = new SkuDetails(1, 50);
		cart.put("A", sku);
		SkuDetails sku1 = new SkuDetails(1, 30);
		cart.put("B", sku1);
		SkuDetails sku2 = new SkuDetails(1, 20);
		cart.put("C", sku2);
		SkuProcessor processor = new SkuProcessor();
		assertEquals(100, processor.processTotal(cart));
	}

	/**
	 * Scenario B
	 */
	@Test
	public void test2() {
		HashMap<String, SkuDetails> cart = new HashMap<>();
		SkuDetails sku = new SkuDetails(5, 50);
		sku.setPromoCount(3);
		sku.setPromoPrice(130);
		cart.put("A", sku);
		SkuDetails sku1 = new SkuDetails(5, 30);
		sku1.setPromoCount(2);
		sku1.setPromoPrice(45);
		cart.put("B", sku1);
		SkuDetails sku2 = new SkuDetails(1, 20);
		cart.put("C", sku2);
		SkuProcessor processor = new SkuProcessor();
		assertEquals(370, processor.processTotal(cart));
	}

	/**
	 * Scenario C
	 */
	@Test
	public void test3() {
		HashMap<String, SkuDetails> cart = new HashMap<>();
		SkuDetails sku = new SkuDetails(3, 50);
		sku.setPromoCount(3);
		sku.setPromoPrice(130);
		cart.put("A", sku);
		SkuDetails sku1 = new SkuDetails(5, 30);
		sku1.setPromoCount(2);
		sku1.setPromoPrice(45);
		cart.put("B", sku1);
		SkuDetails sku2 = new SkuDetails(1, 20);
		sku2.setComboId("D");
		sku2.setComboPrice(30);
		cart.put("C", sku2);
		SkuDetails sku3 = new SkuDetails(1, 15);
		cart.put("D", sku3);
		SkuProcessor processor = new SkuProcessor();
		assertEquals(280, processor.processTotal(cart));
	}
}
