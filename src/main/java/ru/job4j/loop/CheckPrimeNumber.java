package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number >= 2;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
