package org.example;
import java.util.Scanner;
import java.util.Date;
/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is your current age? " );
        String age= sc.nextLine();
        System.out.println( "What age do you want to retire?" );
        String retire= sc.nextLine();
        int i=Integer.parseInt(age);
        int y=Integer.parseInt(retire);
        Date d=new Date();
        int year= d.getYear();
        int currentYear=year+1900;
        System.out.println("You have" + (y-i) +  "years left until you can retire.\n" +
                "It's " + currentYear +", so you can retire in "+(currentYear+(y-i)) +".");
    }
}
