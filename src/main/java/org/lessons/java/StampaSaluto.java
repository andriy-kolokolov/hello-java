package main.java.org.lessons.java;

import java.util.stream.Stream;

public class StampaSaluto {
    public static void main(String[] args) {
        printGreetings("Hello World");
    }

    public static void printGreetings(String msg) {
        int height = 5;
        int width = msg.length() * 2;
        char symbol = '@';

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
                if (i == 2 && j == 3) {
                    System.out.print(' ');
                    for (int k = 0; k < msg.length(); k++) {
                        System.out.print(msg.charAt(k));
                    }
                    System.out.print(' ');
                    Stream.generate(() -> symbol)
                            .limit(j + 2)
                            .forEach(System.out::print);
                    break;
                }
            }
            System.out.println();
        }
    }
}
