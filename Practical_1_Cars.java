package com.company;

public class Practical_1_Cars {
    //Variable Declaration
    String Model;
    int year_mfg;
    String color;
    int top_speed;
    int qty_sold;

    //Assigning values to the variables
    void Create(String m1, int y_mfg, String c, int t_s) {
        Model = m1;
        year_mfg = y_mfg;
        color = c;
        top_speed = t_s;
    }

    void Sold(int q_s) {
        qty_sold = q_s;
    }

    //Printing out the final result
    void Display() {
        System.out.println("\nModel : " + Model);
        System.out.println("\nYear of Manufacturing : " + year_mfg);
        System.out.println("\nColor of Car is : " + color);
        System.out.println("\nTop Speed of Car is : " + top_speed);
        System.out.println("\nTotal Sold Quantities are : " + qty_sold);
        System.out.println("____________________________________________");
    }
}