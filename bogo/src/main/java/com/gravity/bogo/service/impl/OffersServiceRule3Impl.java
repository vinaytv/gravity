package com.gravity.bogo.service.impl;

import com.gravity.bogo.dto.Offers;
import com.gravity.bogo.service.OffersServiceRule3;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
public class OffersServiceRule3Impl implements OffersServiceRule3 {
    @Override
    public Offers rule3(List<Integer> productPriceList) {
        Offers offers = new Offers();

        Collections.sort(productPriceList);
        List<Integer> discountedItems = new ArrayList<>();
        List<Integer> payableItems = new ArrayList<>();

        int i = productPriceList.size() - 1;
        while (i >= 3) {
            discountedItems.add(productPriceList.get(i));
            discountedItems.add(productPriceList.get(i - 1));
            discountedItems.add(productPriceList.get(i - 2));
            discountedItems.add(productPriceList.get(i - 3));
            i -= 4;
        }

        for (int j = i; j >= 0; j--) {
            payableItems.add(productPriceList.get(j));
        }
        offers.setAppliedOffer("rule3");
        offers.setDiscounted(discountedItems);
        offers.setPayables(payableItems);
        return offers;    }
}
