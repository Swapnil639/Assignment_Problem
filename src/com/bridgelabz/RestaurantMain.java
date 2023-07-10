package com.bridgelabz;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant mcDonalds = new Restaurant("McDonald's");
        Restaurant burgerKing = new Restaurant("Burger King");

        mcDonalds.addMenuItem(new MenuItem("Big Mac", 5.99));
        mcDonalds.addMenuItem(new MenuItem("French Fries", 2.99));
        burgerKing.addMenuItem(new MenuItem("Whopper", 6.99));
        burgerKing.addMenuItem(new MenuItem("Onion Rings", 3.99));

        System.out.println("Menus of " + mcDonalds.getName() + ":");
        for (MenuItem item : mcDonalds.getMenu()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Menus of " + burgerKing.getName() + ":");
        for (MenuItem item : burgerKing.getMenu()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        MenuItem item = mcDonalds.searchMenu("Big Mac");
        if (item != null) {
            System.out.println("Found " + item.getName() + " in " + mcDonalds.getName() + " for " + item.getPrice());
        } else {
            System.out.println("Menu item not found in " + mcDonalds.getName());
        }

        MenuItem onionRings = burgerKing.searchMenu("Onion Rings");
        if (onionRings != null) {
            burgerKing.removeMenuItem(onionRings);
            System.out.println("Removed " + onionRings.getName() + " from " + burgerKing.getName());
        }

        System.out.println("Menus of " + burgerKing.getName() + " after removing Onion Rings:");
        for (MenuItem m : burgerKing.getMenu()) {
            System.out.println(m.getName() + " - " + m.getPrice());
        }
    }
}
