package TextAndRegularExpressions;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {


            if (Character.isDigit(input.charAt(i))) {
                digits.append(input.charAt(i));
            } else if (Character.isAlphabetic(input.charAt(i))) {
                letters.append(input.charAt(i));
            } else {
                other.append(input.charAt(i));
            }
        }

        System.out.println(String.format("%s%n%s%n%s", digits, letters, other));

    }

}
