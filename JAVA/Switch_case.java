package com.company;
import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        switch (name){
            case "Nandkishor Asati":
                System.out.println("Mr. Nandkishor Asati is the head of the family");
                break;
            case "Sandhya Asati":
                System.out.println("she is the wife of nandkishor");
                break;
            case "Nandni Asati":
                System.out.println("she is the daughter of nandkishor");
                break;
            case "Shrinath Asati and Grish":
                System.out.println("he is the son of nandkishor");
                break;
            default:
                System.out.println("....");
        }
    }
}

