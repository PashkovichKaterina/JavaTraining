package by.epam.javatraining.pashkovich.lesson05.task02.model;

public class CheckChar {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static boolean isVowelTwo(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isVowelThree(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".contains(Character.toString(c));
    }

    public static boolean isVowelFour(char c) {
        c = Character.toLowerCase(c);
        String vowel = "aeiou";
        if (vowel.indexOf(c) == -1) {
            return false;
        }
        return true;
    }

    public static boolean isVowelFife(char c) {
        c = Character.toLowerCase(c);
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowel.length; ++i) {
            if (vowel[i] == c) {
                return true;
            }
        }
        return false;
    }
}
