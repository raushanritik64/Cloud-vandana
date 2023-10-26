// C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z) 

import java.util.HashSet;
import java.util.*;
public class PangramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isPangram = isPangram(str);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }


    public static boolean isPangram(String input) {
               input = input.replaceAll(" ", "").toLowerCase();

               HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

             if (ch >= 'a' && ch <= 'z') {
                characters.add(ch);
            }
        }

         return characters.size() == 26;
    }

    
}
