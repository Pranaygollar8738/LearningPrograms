package ex_Looping_Statement_ForAndIfElse;

public class CountVowelsConsonant {
    ///count vowels and consonant in PranayNagpur by using for loop and without using array
    public static void main(String[] args) {
        String name = "PranayNagpur";//
        name = name.toLowerCase(); // convert to lowercase

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                vowelCount++;
            } else if (c >= 'a' && c <= 'z') {

                consonantCount++;
            }
        }

        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }
}
