package com.gravity.bogo.controller;


import com.gravity.bogo.dto.Offers;
import com.gravity.bogo.dto.OffersResponse;
import com.gravity.bogo.dto.Request;
import com.gravity.bogo.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bogo/api/v1")
public class OffersController {


    @Autowired
    private OffersService offersService;

    @GetMapping("/offers")
    public OffersResponse offerDetails(@RequestBody Request request){

        return offersService.getOfferDetails(request.getProductPriceList());

    }

}
