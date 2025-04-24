package excersice;

import java.util.Scanner;

public class StringMinMax {
    public static void main (String[] args) {
        Scanner input_string = new Scanner(System.in);
        System.out.println("Please enter the string : ");
        String[] get_strings = new String[5];
        for (int i = 0; i < 5; i++) {
            get_strings[i] = input_string.nextLine();
            System.out.println("Length is : " + get_strings[i].length());
            System.out.println("Please enter the string : ");

            String largest = get_strings[0];
            String smallest = get_strings[0];

            for (int l = 0; l < 5; l++){
                if (get_strings[i].compareTo(smallest) < 0 ){
                    smallest = get_strings[i];
                }
                if (get_strings[i].compareTo(largest) > 0){
                    largest = get_strings[i];
                }
            }
            System.out.println("The Smallest string is : " + smallest);
            System.out.println("The Largest string is : " + largest);
        }
    }
}


