package excersice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner enter_numbers = new Scanner(System.in);
        System.out.println("Please enter the number to find out the largest : ");
        int[] get_numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            get_numbers[i] = enter_numbers.nextInt();
            System.out.println("Please enter the number to find out the largest : ");
        }
        int lar_num = get_numbers[0];

        for (int l = 0; l < 3; l++) {
            if (get_numbers[l] > lar_num) {
                lar_num = get_numbers[l];
            }
        }

        System.out.println("The largest number is : " + lar_num);
    }

}
