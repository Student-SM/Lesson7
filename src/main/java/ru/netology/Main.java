package ru.netology;

public class Main {

    public static void main(String[] args) {

        String name = "Petya";

//        System.out.println(name.replace('P','@'));// этой командой можно заменять символы,например P на @

//        if (name.equals("Petya")) { //командой name.equals сравниваются переменные типа String
//            System.out.println("Равно");

        int x = name.length(); //показать длинну имени "Petya"
        System.out.println(name.charAt(0)); //всего в "Petya" пять ячеек,от 0 до 5,в нулевой лежит символ 'P'

    }
}
