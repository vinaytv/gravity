package com.gravity.bogo.dto;

import java.util.List;

public class Offers {

    private String appliedOffer;
    private List<Integer> discounted;
    private List<Integer> payables;

    public String getAppliedOffer() {
        return appliedOffer;
    }

    public void setAppliedOffer(String appliedOffer) {
        this.appliedOffer = appliedOffer;
    }

    public List<Integer> getDiscounted() {
        return discounted;
    }

    public void setDiscounted(List<Integer> discounted) {
        this.discounted = discounted;
    }

    public List<Integer> getPayables() {
        return payables;
    }

    public void setPayables(List<Integer> payables) {
        this.payables = payables;
    }
}
