package ru.netology;

public class StringService {

    public String longestString(String s1, String s2) { // сервис выявления более длинного имени
        if (s1.length() <= s2.length()) { // сравниваем ,какое длиннее
            return s2;
        } else {
            return s1;
        }
    }
}

