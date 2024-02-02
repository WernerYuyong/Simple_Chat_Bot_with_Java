package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);
    final static String assistantName = "Marvin"; // final name of the assistant, Marvin
    final static String birthYear = "2024"; // final year of birth of the assistant, 2024

    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        testItSkill();
        end();
    }

    static void greet() { // greet the user, ask name
        System.out.println("Hello! My name is " + SimpleBot.assistantName + ".");
        System.out.println("I was created in " + SimpleBot.birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() { // enter the name
        String name = scanner.next();
        name = name.substring(0, 1).toUpperCase().trim() + name.substring(1).toLowerCase().trim();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {  // guess the age of the user
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() { // count to the given number
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void testItSkill() { // test the user IT skills with a question
        System.out.println("""
                Let's test your programming knowledge.
                Why do we use methods?
                1. To repeat a statement multiple times.
                2. To decompose a program into several small subroutines.
                3. To determine the execution time of a program.
                4. To interrupt the execution of a program.""");
        int answer = 0;
        String ans = scanner.next().trim();
        try {
            answer = Integer.parseInt(ans);
        } catch (NumberFormatException ignored) {
        }

        while (answer != 2) {
            System.out.println("Please, try again.");
            ans = scanner.next().trim();
            try {
                answer = Integer.parseInt(ans);
            } catch (NumberFormatException ignored) {
            }
        }
    }

    static void end() { // final congrats, end greetings
        System.out.println("Congratulations, have a nice day!");
    }
}
