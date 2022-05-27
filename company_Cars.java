package com.company;

public class company_Cars {
    //Main Function
    public static void main(String[] args) {
        //Creation of objects
        Practical_1_Cars Santro_Xing = new Practical_1_Cars();
        Practical_1_Cars Alto = new Practical_1_Cars();
        Practical_1_Cars Wagon_R = new Practical_1_Cars();
        //Passing values to methods
        Santro_Xing.Create("Santro Xing", 2018, "Red", 100);
        Santro_Xing.Sold(400);
        // Calling of Display method
        Santro_Xing.Display();
        Alto.Create("Alto 800", 2019, "White", 100);
        Alto.Sold(750);
        Alto.Display();
        Wagon_R.Create("Wagoner", 2019, "Gray", 90);
        Wagon_R.Sold(600);
        Wagon_R.Display();
    }
}

