package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

//This class do the price and tax calculations

class TotalCost {

    // declaring and intializing price before tax, tax and price after tax
    double totalAft=0;
    double totalBef=0;
    double tax=0;


    public void total(ArrayList<ArrayList<String>> arr){

        for (int i = 0; i < arr.size(); i++) {

            //converting the price from string to double then sum it to the total cost
                double price=Double.parseDouble(arr.get(i).get(1));
                totalBef+=price;

             //using if condition to calculate tax according to the item type and add it to the total tax

                if(arr.get(i).get(0).contains("Book")||arr.get(i).get(0).contains("Chocolate bar")||arr.get(i).get(0).contains("pills")){
                   tax+=0;
                }else if (arr.get(i).get(0).contains("imported")){
                    tax+= (price*0.05);
                }else{
                    tax+=price*0.1;
                }

                // print each item with the price tag

            System.out.println(arr.get(i).get(0)+ " : " + price);

        }

        // calculate the tax to the closest 50 cent and print it

        tax=roundToHalf(tax);
        System.out.println("Sales Tax :" + tax);

        // calculate tax after tax, round to the closest decimal and print it

        totalAft=totalBef+tax;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Total :" + df.format( totalAft));

    }

    // method that round the tax to the closest 50 cent

    public double roundToHalf(double d) {
        return Math.round(d * 2) / 2.0;
    }
}
