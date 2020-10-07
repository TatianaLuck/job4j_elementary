package ru.job4j.calculator;
class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name, age);
        ArgMethod.String(age);
        ArgMethod.hello(name, age);
    }
    private static void String(int age) {
    }
}