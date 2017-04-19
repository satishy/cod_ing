package com.camellia.systems.coding;

/**
 * Created by satishdvla on 17/04/17.
 */



class Food {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood(String food) {
        setName(food);
        return new Food();
    }


    @Override
    public String toString() {
        return "Food{" +
                "food='" + name + '\'' +
                '}';
    }

}

class FoodFactory extends Food {


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

       // food1.serveFood();

      //  food2.serveFood();

    }



}
