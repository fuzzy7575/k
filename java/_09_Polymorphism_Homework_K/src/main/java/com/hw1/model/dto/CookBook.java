package com.hw1.model.dto;

public class CookBook extends Book {

    private boolean coupon;

    public CookBook() {}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public String toString() {
        return  super.toString()
                + "CookBook [coupon=" + this.coupon
                + "]";
    }

}
