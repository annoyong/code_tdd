package com.cn.day1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProductTest{
    @Test
    public void testDailyCount() {
        Product product = new Product(10,10);
        product.dailyCount();
        assertEquals(9,product.getQuality());
        assertEquals(9,product.getSellIn());
    }

}