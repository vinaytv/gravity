package com.gravity.bogo.service.impl;

import com.gravity.bogo.dto.Offers;
import com.gravity.bogo.dto.OffersResponse;
import com.gravity.bogo.service.OffersService;
import com.gravity.bogo.service.OffersServiceRule1;
import com.gravity.bogo.service.OffersServiceRule2;
import com.gravity.bogo.service.OffersServiceRule3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OffersServiceImpl implements OffersService {

    @Autowired
    private OffersServiceRule2 offersServiceRule2;

    @Autowired
    private OffersServiceRule1 offersServiceRule1;

    @Autowired
    private OffersServiceRule3 offersServiceRule3;
    @Override
    public OffersResponse getOfferDetails(List<Integer> productsPriceList) {
        OffersResponse offers=  new OffersResponse();
        List<Offers> offersList=new ArrayList<>();
        offersList.add(offersServiceRule1.rule1(productsPriceList));
        offersList.add(offersServiceRule2.rule2(productsPriceList));
        offersList.add(offersServiceRule3.rule3(productsPriceList));

        offers.setOffers(offersList);
        return offers;
    }
}
