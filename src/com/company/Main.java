package com.company;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin = ");
        int number = input.nextInt();

        int total = 0;

        for (int i=1; i<number; i++){
            if (number%i == 0){
                total+=i;
            }
        }

        if (total != number)
            System.out.println("Sayı mükemmel sayı değildir.");
        else
            System.out.println("Sayı mükemmel sayıdır.");
    }
}
