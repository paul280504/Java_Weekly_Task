package com.kovanlabsintern.javaweektask;

public class TextScrubber {
    public static void main(String[] args) {

        String input = "H3ll0 W0rld! Th1s is J4v4.";
        String s1 = input.replaceAll("\\d", "*");
        String res = s1.replaceAll("[^a-zA-Z*\\s]", "");

        System.out.println(res);
    }
}
