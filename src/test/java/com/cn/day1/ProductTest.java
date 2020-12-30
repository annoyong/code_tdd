package com.cn.day1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProductTest{
    @Test
    public void when_testDailyCount_is_normal_product() {
        Product product = new Product(10,10);
        product.dailyCount();
        assertEquals(9,product.getQuality());
        assertEquals(9,product.getSellIn());
    }
    @Test
    public void when_testDailyCount_given_sallin_is_negative() {
        Product product = new Product(-1,10);
        product.dailyCount();
        assertEquals(8,product.getQuality());
        assertEquals(-2,product.getSellIn());
    }
    @Test
    public void when_testDailyCount_given_quality_is_zero() {
        Product product = new Product(-1,0);
        product.dailyCount();
        assertEquals(0,product.getQuality());
        assertEquals(-2,product.getSellIn());
    }
}