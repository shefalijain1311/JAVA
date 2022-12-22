package com.company;
import java.util.Scanner;

public class If_else2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>=60){
            System.out.println("you are a senior citizen");
        }
        else if (age>=45) {
            System.out.println("you are a semisenior citizen");

        }
        else if(age>=18){
            System.out.println("you are an adult");
        }
        else {
            System.out.println("you are a child");
        }
    }
}
