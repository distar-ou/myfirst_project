package ui;

import java.util.Random;

public class CodeUtil {

    public static String getcode() {

        String code = "";

        char[] arr = {
                'A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U',
                'V','W','X','Y','Z',
                'a','b','c','d','e','f','g',
                'h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u',
                'v','w','x','y','z',
                '0','1','2','3','4','5','6','7','8','9'
        };

        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(arr.length);
            code += arr[index];
        }

        return code;
    }
}