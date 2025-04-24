package excersice;

import java.util.Scanner;

public class CountVowel {
    public static void main (String[] args){
        Scanner ent_str = new Scanner(System.in);
        System.out.println(" Please enter the string to count the Vowels : ");
        String get_str = ent_str.nextLine();

            int count = 0;
            String get_Str = get_str.toLowerCase();

            for (int i = 0; i < get_Str.length(); i++){
                char c = Character.valueOf(get_Str.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u'){
                    count++;
                }
            }
        System.out.println(" The total numbers of vowels in the string  are : " + count);
    }
}
