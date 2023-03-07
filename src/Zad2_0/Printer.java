package Zad2_0;

public class Printer {
    public static void main(String[] args) {
        print_even(5);
    }


    public static void print_even(int N){
        System.out.printf("Numbers that are fitting the condition given: ");
        for (int i = 0; i <= N; i++) {
            if(i % 2 == 0){
                System.out.printf("%d ", i);
            }
        }
    }

}