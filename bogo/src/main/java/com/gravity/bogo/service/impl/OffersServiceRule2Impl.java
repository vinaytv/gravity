package com.gravity.bogo.service.impl;

import com.gravity.bogo.dto.Offers;
import com.gravity.bogo.service.OffersServiceRule2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OffersServiceRule2Impl implements OffersServiceRule2 {
    @Override
    public Offers rule2(List<Integer> productPriceList) {
        Offers offers = new Offers();

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();

        for (int price : productPriceList) {
            if (!map.containsKey(price)) {
                map.put(price, 1);
            } else {
                discountedItems.add(price);
                map.remove(price);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            payableItems.add(entry.getKey());
        }
        offers.setPayables(payableItems);
        offers.setDiscounted(discountedItems);
        offers.setAppliedOffer("rule2");
        return offers;
    }
}
