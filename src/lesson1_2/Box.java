package lesson1_2;

import java.util.ArrayList;

public class Box<A extends F,O extends F,F> {

    private ArrayList<A> boxOfApples;
    private ArrayList<O> boxOfOranges;

    public Box(F typeOfFruit, double fruitWeight, int amountOfFruits) {
        this.fruitWeight = fruitWeight;
        this.amountOfFruits = amountOfFruits;
    }
    double fruitWeight;
    int amountOfFruits;


    double getWeight(double fruitWeight, int amountOfFruits){
        return fruitWeight*amountOfFruits;
    }
   boolean compare(Box<A, O, F>){

   }
}
