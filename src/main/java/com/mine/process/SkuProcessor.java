package com.mine.process;

import java.util.HashMap;

/**
 * @author Manjula SKU operations - methods
 *
 */
public class SkuProcessor {
	public int processTotal(HashMap<String, SkuDetails> cart) {
		int total = 0;
		for (String id : cart.keySet()) {
			SkuDetails sku = cart.get(id);
			int count = sku.getCount();
			if (sku.getComboId() != null) {
				SkuDetails combosku = cart.get(sku.getComboId());
				combosku.setCount(0);
				cart.put(sku.getComboId(), combosku);
				total = total + sku.getCount() * sku.getComboPrice();
			} else if (sku.getPromoCount() > 0) {
				// apply promo

				total = total + sku.getPromoPrice() * (count / sku.getPromoCount());
				total = total + sku.getPrice() * (count % sku.getPromoCount());
			} else {
				total = total + sku.getPrice() * (count);
			}
		}
		return total;

	}

}
