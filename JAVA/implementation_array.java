package com.company;
import java.util.Scanner;
public class implementation_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];// method 1 for implementation
        int [] arr1= {1,2,3,4,5,6};//method 2 for implementation
        for(int i=0;i<arr.length;i++){
            System.out.println("enter element");
            arr[i]=sc.nextInt();
        }
        System.out.println("array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.println("element is : "+arr[i]);
        }
        System.out.println("array1 is : ");
        // using for each loop:
        for(int element: arr1){
            System.out.println("element is : "+ element);
        }
    }
}
