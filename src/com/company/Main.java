package com.company;

public class Main {

    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static int greaterValue(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static double greaterValue(double num1, double num2){
        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Sum of two numbers 12 and 14: " + computeSum(12, 14));
        System.out.println("Sum of three numbers 12, 14, 2: " + computeSum(12, 14, 2));

        System.out.println("============");

        System.out.println("The greater value between 45 and 100 is " + greaterValue(45, 100));
        System.out.println("The greater value between 3.14 and 9.8 is  " + greaterValue(3.14, 9.8));
    }
}
