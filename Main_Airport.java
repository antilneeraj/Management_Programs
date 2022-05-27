package com.company;
import java.util.Scanner;

public class Main_Airport {
    public static void main(String[] args) {
        Arrival arr[] = new Arrival[8];
        int i = 0, j, f = 0;
        String sname, ch;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 8; i++) {
            arr[i] = new Arrival();
        }
        i = 0;
        do {
            System.out.println("Enter the Details of Arrival Plane " + (i + 1));
            arr[i].get_arrival();
            System.out.println("Press Y to enter more Details");
            ch = sc.nextLine();
            i++;
        } while (ch.equalsIgnoreCase("Y"));
        for (j = 0; j < 8; j++) {
            System.out.println("Details of Arrival Plane " + (j + 1));
            arr[j].show_arrival();
        }
        System.out.println("Total number of arrivals: " + i);
        Departure dep[] = new Departure[8];
        i = 0;
        for (i = 0; i < 8; i++) {
            dep[i] = new Departure();
        }
        i = 0;
        do {
            System.out.println("Enter the Details of Departure Plane " + (i + 1));
            dep[i].get_departure();
            System.out.println("Press Y to enter more Details");
            ch = sc.nextLine();
            i++;
        } while (ch.equalsIgnoreCase("Y"));
        for (j = 0; j < 8; j++) {
            System.out.println("Details of Arrival Plane " + (j + 1));
            dep[j].show_arrival();
        }
        Passenger pas[] = new Passenger[8];
        i = 0;
        for (i = 0; i < 8; i++) {
            pas[i] = new Passenger();
        }
        i = 0;
        do {
            System.out.println("Enter the Details of Passenger " + (i + 1));
            pas[i].get_passenger();
            System.out.println("Press Y to enter more Details");
            ch = sc.nextLine();
        } while (ch.equalsIgnoreCase("Y"));
        for (j = 0; j < 8; j++) {
            System.out.println("Details of Arrival Plane " + (j + 1));
            pas[j].show_passenger();
        }
        System.out.println("Enter name of the Passenger to Search: ");
        sname = sc.nextLine();
        for (j = 0; j < 8; j++) {
            if (pas[j].get_psname().equalsIgnoreCase(sname)) {
                System.out.println("Passenger Found!!");
                pas[j].show_passenger();
                f = 1;
            }
        }
        if (f == 0) {
            System.out.println("Passenger not Found!!");
        }

    }
}
