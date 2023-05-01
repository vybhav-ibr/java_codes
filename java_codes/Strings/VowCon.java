public class Main
{
    public static void main (String[]args)
    {
        char c = 'f';

        // show error message if c is not an alphabet
        // if (!isalpha (c))
        //   System.out.println  ("Non alphabet");

        if (isLowercaseVowel (c) || isUppercaseVowel (c))
            System.out.println (c + " is a vowel ");

        else
            System.out.println (c + " is a consonant ");

    }

    static boolean isLowercaseVowel (char c)
    {
        // returns 1 if char matches any of below
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    static boolean isUppercaseVowel (char c)
    {
        // returns 1 if char matches any of below
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

}