package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

     //declaring the input scanner
	 Scanner key= new Scanner(System.in);

	 //declaring and initializing an array-list inside another array-list for string storage

        ArrayList<ArrayList<String> > aList = new ArrayList<ArrayList<String> >();

     //Asking for shopping items inputs

        System.out.println("Enter your Shopping items ");
        for (String str = key.nextLine(); !str.isEmpty(); str =key.nextLine()) {

            //instance of process class and call the proc method to split string and store in arraylist

            new Process().proc(aList,str);
        }

        //instance of TotalCost class and call total method to perform the print out
        new TotalCost().total(aList);


    }


}
