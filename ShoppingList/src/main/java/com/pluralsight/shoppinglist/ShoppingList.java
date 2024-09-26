package com.pluralsight.shoppinglist;

public class ShoppingList {
    public static void main(String[] args) {
        System.out.println("Shopping List");
        String [] itemList = {
                "Apples", "Soup", "crackers", "Cheese", "coke", "Watermelon", "Milk", "Steak", "Oreos", "Cookies"};
        for (String i : itemList) {
            System.out.println(i);
        }
        }
    }
