package com.gravity.bogo.service;

import com.gravity.bogo.dto.Offers;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OffersServiceRule2  {
    
    Offers rule2(List<Integer> productPriceList);

}
