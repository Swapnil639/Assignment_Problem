package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<MenuItem> menuItems;

    public Restaurant(String name) {
        this.name = name;
        menuItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
    }

    public List<MenuItem> getMenu() {
        return menuItems;
    }

    public MenuItem searchMenu(String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}

