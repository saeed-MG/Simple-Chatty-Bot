package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        // ...
        //end();
        test();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        int x=5;
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("What is (System.in) in Java?");
        System.out.println("1. It is a command that starts reading data from a file.");
        System.out.println("2. It is an object representing the standard input.");
        System.out.println("3. It is an input integer value");
        System.out.println("4. It is a standard keyword.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean b = true;
        while (b) {
            if (input == 2) {
                System.out.println("Congratulations, have a nice day!");
                b = false;
            } else {
                System.out.println("Please, try again.");
                input = scanner.nextInt();
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }//

}
