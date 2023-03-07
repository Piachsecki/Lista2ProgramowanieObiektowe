package Zad2_1;

import java.util.Objects;

public class Fib {
    public static void main(String[] args) {
        try {
            int i = fibbR(1);
            System.out.println(i);
            int j = fibbI(5);
            System.out.println(j);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static int fibbI(int n){
        if(n <= 0 ){
            throw new RuntimeException("Given number is wrong!");
        }
        int firstValue = 1;
        int secondValue = 1;
        for (int i = 0; i < n-2; i++) {
            int temp = secondValue;
            secondValue+=firstValue;
            firstValue = temp;
        }
        return secondValue;
    }

    public static int fibbR(int n){
        if(n <= 0 ){
            throw new RuntimeException("Given number is wrong!");
        }
        if(n == 2){
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return fibbR(n-1) + fibbR(n-2);
    }
}
