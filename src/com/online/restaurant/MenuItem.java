package com.online.restaurant;

public class MenuItem {
    private Long menuItemid;
    private String menuItem;
    private double price;
    private String category;

    public Long getMenuItemid() {
        return menuItemid;
    }

    public void setMenuItemid(Long menuItemid) {
        this.menuItemid = menuItemid;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    private boolean isVeg;

}
