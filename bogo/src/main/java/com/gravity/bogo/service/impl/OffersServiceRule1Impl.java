package com.gravity.bogo.service.impl;

import com.gravity.bogo.dto.Offers;
import com.gravity.bogo.service.OffersServiceRule1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class OffersServiceRule1Impl implements OffersServiceRule1 {
    @Override
    public Offers rule1(List<Integer> productPriceList) {
        Offers offers=new Offers();
        Collections.sort(productPriceList);
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();

        int left = 0;
        int right = productPriceList.size() - 1;

        while (left < right) {
            discountedItems.add(productPriceList.get(right));
            discountedItems.add(productPriceList.get(left));
            left++;
            right--;
        }

        if (left == right) {
            payableItems.add(productPriceList.get(left));
        }

        offers.setAppliedOffer("rule1");
        offers.setDiscounted(discountedItems);
        offers.setPayables(payableItems);
        return offers;
    }
}
