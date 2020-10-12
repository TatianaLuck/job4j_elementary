package ru.job4j.ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl1 = (height - 100) * 1.15;
        return rsl1;
    }

    public static double womanWeight(short height) {
        double rsl2 = (height - 100) * 1.15;
        return rsl2;
    }

    public static void main(String[] args) {
        short height1 = 187;
        short height2 = 160;
        double man = Fit.manWeight(height1);
        double woman = Fit.womanWeight(height2);
        System.out.println("Man 187 is " + man + ". Woman 160 is " + woman);
    }

}

