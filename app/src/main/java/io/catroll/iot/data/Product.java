package io.catroll.iot.data;

import android.graphics.drawable.Drawable;

import java.util.List;

public class Product {
    private final String name;
    private final Drawable imageSrc;
    private final String dishes;
    private final boolean avail;
    private final String w;
    private final String c;

    public String getName() {
        return name;
    }

    public Drawable getImageSrc() {
        return imageSrc;
    }

    public String getDishes() {
        return dishes;
    }

    public boolean isAvail() {
        return avail;
    }
    public String getW() {
        return this.w;
    }
    public String getC(){return c;}

    public Product(String name, Drawable imageSrc, String dishes, boolean avail, String w,String c) {
        this.name = name;
        this.imageSrc = imageSrc;
        this.dishes = dishes;
        this.avail = avail;
        this.w = w
                ;
        this.c=c;
    }
}
