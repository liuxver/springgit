package com.liuxv.twoshou.service.a;

public class Orders {
    private String name;

    private String seller;

    private String buyer;

    public Orders(String s1,String s2,String s3){
        this.name=s1;
        this.seller=s2;
        this.buyer=s3;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }
}