package com.company;

import java.util.ArrayList;

//This class perform the input string split process and storing in arraylist

public class Process {



    public void proc(ArrayList<ArrayList<String>> arr, String str){
        ArrayList<String> a = new ArrayList<String>();

        // split the string using substring in two parts and adding them to the array

        String first=str.substring(2,str.indexOf(" at "));
        a.add(first);

        String second=str.substring(str.indexOf(" at ")+4);
        a.add(second);

        arr.add(a);
    }
}
