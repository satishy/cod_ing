package com.camellia.systems.coding;

/**
 * Created by satishdvla on 17/04/17.
 */

class Food { public void serveFood() { System.out.println("Some food");}}

class Fruit extends Food { public void serveFood() {
        System.out.println("Fruit");
    }}

class FastFood extends Food { public void serveFood() { System.out.println("FastFood"); } }

class FoodFactory extends Food {

    public Food getFood(String objName) {

        Food food = null;
        if(objName.equalsIgnoreCase("FastFood")) {
            food =  new FastFood();
        } else if(objName.equalsIgnoreCase("Fruit")) {
            food = new Fruit();
        }
        return food;
    }
}

public class FoodMain {

    public static void main(String[] args) {

        FoodFactory myFoods = new FoodFactory();

        Food food1 = myFoods.getFood("FastFood");

        Food food2 = myFoods.getFood("Fruit");

        System.out.println("My name is: " + food1.getClass().getName());

        System.out.println("My name is: " + food2.getClass().getName());

        System.out.println("Our superclass is: "

                        + food1.getClass().getSuperclass().getName());

        food1.serveFood();

        food2.serveFood();

    }

}
