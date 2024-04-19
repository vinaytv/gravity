package com.gravity.bogo.service;

import com.gravity.bogo.dto.Offers;
import com.gravity.bogo.dto.OffersResponse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OffersService {

     OffersResponse getOfferDetails(List<Integer> productsPriceList);

}
