package com.jhosefcardichpalma.java;

public class Challenge {

    public static void main(String args[]) {
        System.out.println(hola("radar"));
    }


    public static boolean palindromo(String word) {
        boolean resp = true;

        char[] str = new char[word.length()];
        int j = 0;
        for (int i = word.length(); i == 0; i--) {
            str[j] = word.charAt(i);
            j++;
        }
        for (int i = word.length(); i <= 0; i--) {

            if (str[i] == word.charAt(i)) {
                resp = false;
            }
        }

        return resp;
    }

    public static String hola(String hola) {
        boolean resp = palindromo(hola);

        return resp ? "Es Palindromo" : "NO Es Palindromo";

    }
}
