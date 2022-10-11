package e1;

import java.util.Locale;

public class StringCount {
    public static int countWords(String text) {
        if(text==null)
            return 0;
        int totalWords = 1;
        if (text.charAt(0) == ' ')
            totalWords--;
        for (int i = 0; i < text.length()-1; i++) {

            if ((text.charAt(i) == ' ') && (text.charAt(i + 1) != ' '))
                totalWords++;


        }
        return totalWords;
    }

    public static int countChar(String text , char c) {
        if(text==null)
            return 0;
        int totalCharacters=0;
        char temp;
        for (int i = 0; i < text.length(); i++) {
            temp = text.charAt(i);
            if (temp == c)
                totalCharacters++;
        }
        return totalCharacters;
    }

    public static int countCharIgnoringCase(String text , char c) {
        if(text==null)
            return 0;
        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < text.length(); i++) {
            temp = text.charAt(i);
            if (Character.isUpperCase(c)) {
                if (temp == c || temp == c + 32)
                    totalCharacters++;
            }
            if (Character.isLowerCase(c)) {
                if (temp == c || temp == c - 32)
                    totalCharacters++;
            }
        }
        return totalCharacters;
    }


    public static boolean isPasswordSafe(String password) {
        char temp;
        boolean Mayus=false,minus=false,digito=false,caracter=false,safe=false;

        for (int i = 0; i < password.length(); i++) {
            temp = password.charAt(i);
            if (Character.isUpperCase(temp))
                Mayus=true;
            if (Character.isLowerCase(temp))
                minus=true;
            if (Character.isDigit(temp))
                digito=true;
            if (temp == '?' || temp == '#' || temp == '@' || temp == '$' || temp == '.' || temp == ',')
                caracter=true;

        }
        if (Mayus && minus && digito && caracter && password.length()>=8)
            safe=true;
        return safe;

    }


}
