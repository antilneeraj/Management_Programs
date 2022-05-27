package com.company;
import java.util.*;
class Airport{
    String name;
    int id;
    String address;
    void get1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Airport name: ");
        name = sc.nextLine();
        System.out.println("Enter Airport ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Address/City");
        address= sc.nextLine();
    }
    void show(){
        System.out.println("Airport Name: "+name);
        System.out.println("Airport ID: "+id);
        System.out.println("Address/City: "+address);
    }
}
class Arrival extends Airport{
    String pname;
    int pid;
    String arrival_time;
    void get_arrival(){
        get1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plane Name: ");
        pname = sc.nextLine();
        System.out.println("Enter Plane ID: ");
        pid = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Arrival Time: ");
        arrival_time = sc.next();
    }
    void show_arrival(){
        System.out.println("Plane Name: "+ pname);
        System.out.println("Plane ID: "+ pid);
        System.out.println("Arrival Time: "+ arrival_time);
    }
}
class Passenger extends Airport{
    String psname;
    String padd;
    void get_passenger(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Passenger name: ");
        psname  = sc.nextLine();
        System.out.println("Enter passenger Address: ");
        padd= sc.nextLine();
    }
    void show_passenger(){
        System.out.println("Passenger Name: "+ psname);
        System.out.println("Passenger Address: "+ padd);
    }
    String get_psname(){
        return psname;
    }
}
class Departure extends Airport{
    String pname;
    int pid;
    String dept_time;
    void get_departure(){
        get1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plane Name to Departure: ");
        pname = sc.nextLine();
        System.out.println("Enter Plane ID to Departure: ");
        pid = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Departure Time: ");
        dept_time = sc.next();
    }
    void show_arrival(){
        System.out.println("Plane Name: "+ pname);
        System.out.println("Plane ID: "+ pid);
        System.out.println("Departure Time: "+ dept_time);
    }
}
