package com.Danielle;

public class Store {
    // instance fields
    String productType;


    public Store(String product) {
    // Constructor method
    /* Add the String parameter product to the Store() constructor.
       Inside of the constructor method, set the instance variable
       productType equal to the product parameter.
    */
        productType = product;
    }

    // main method
    public static void main(String[] args) {
       /* 1. Inside main(), create an instance of Store and assign it to the variable lemonadeStand.
             Use "lemonade" as the parameter value.
          2. Print the instance field productType from lemonadeStand.
       */

        Store lemonadeStand = new Store("lemonade");

        System.out.println(lemonadeStand.productType);
    }
}