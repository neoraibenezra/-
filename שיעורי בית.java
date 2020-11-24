package com.company;

public class Main {

    public static void main(String[] args) {
       // System.out.println(newFunc(3));
       // System.out.println(primeF(5));
        System.out.println(prime(10));
    }
//שאלה 1
    public static int newFunc(int num) {

        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        return res;
    }
    //שאלה 2
    public static int prime(int num) {

        int i, j;
        int count = 0;
        for (i = 2; i <= 1000000; i++) {
            boolean IsPrime = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime) {
                if (IsPrime = true) {
                    count++;
                }
                if (count >= num) {
                    break;
                }
                System.out.println(i + ",");

            }

        }


        return i;
    }







//שאלה 3
    public static boolean primeF(int num){
        for(int i = 2; i < Math.floor(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }




}

