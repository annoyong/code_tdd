package com.cn.day1;

/**
 * @author yongruli
 */
public class Product {
    /** 销售期 */
    private int sellIn;
    /** 品质值 */
    private int quality;

    public Product(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }
    /** 每天结束时商品属性减1 */
    public void dailyCount(){
        this.sellIn--;
        this.quality--;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
