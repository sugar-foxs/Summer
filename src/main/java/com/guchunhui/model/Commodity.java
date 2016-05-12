package com.guchunhui.model;

/**
 * Created by gch on 16-5-9.
 */
public class Commodity {
    public int commodityId;
    public int price;
    public String name;

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
