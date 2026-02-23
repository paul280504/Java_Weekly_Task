package com.kovanlabsintern.javaweektask.RegularExpression;

import java.util.Locale;
import java.util.regex.Pattern;

public class RegularExpression {
        public static void emailValid(String[] email) {
            String pattern = "^[A-Za-z0-9_+%-]+(?:\\.[A-Za-z0-9_+%-]+)*@[A-Za-z0-9-]+(?:\\.[A-Za-z0-9-]+)*\\.[A-Za-z]{2,}$";
            for (String check : email) {
                boolean isValid = Pattern.matches(pattern, check);
                System.out.println(check + " - "+ isValid);
            }
        }
            public static void main(String[] args)
            {
                String[] email = {"user@gmail.com",
                        "john.doe@yahoo.com",
                        "dev123@company.in",
                        "alpha_beta@my-domain.org",
                        "test+mail@service.co",
                        "first.last@sub.domain.com",
                        "a@b.co",
                        "user-name@server123.net",
                        "example.user@tech-world.io",
                        "sample123@domain.co.in",
                        ".user@gmail.com",
                        "user.@gmail.com",
                        "user..name@gmail.com",
                        "usergmail.com",
                        "@gmail.com",
                        "user@.com",
                        "user@gmail",
                        "user@gmail.c",
                        "user#123@gmail.com",
                        "user@gmail..com"};
                emailValid(email);
            }

}
