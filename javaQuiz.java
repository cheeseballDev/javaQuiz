package javaActivities;

import java.util.*;

public class javaQuiz {
    public static Scanner userInput = new Scanner(System.in);

    public static String[] ARRAY_OF_QUESTIONS = {
        "Q1: What is the name of the first expansion for FFXIV?",
        "Q2: Who was the final boss in the A Realm Reborn expansion?",
        "Q3: Who is the leader of the Scions of the Seventh Dawn?",
        "Q4: What is the name of the first dungeon that the player encounters?",
        "Q5: Who is the leader of the city-state, Gridania?"
    };
    public static String[] ARRAY_OF_CHOICES = {
        "A.) Heavensward, B.) A Realm Reborn, C.) Stormbringers",
        "A.) Nero Tol Scaeva, B.) Ultima Weapon, C.) Gaius Van Baelsar",
        "A.) Y'shtola Rhul, B.) Thancred Waters, C.) Minfilia Warde",
        "A.) Copperbell Mines, B.) Sastasha, C.) The Tam-Tara Deepcroft",
        "A.) Kann-E Senna, B.) Nanamo Ul Namo, C.) Thordan VII"
    };
    public static void main(String[] args) {
        System.out.println("Welcome to to the Final Fantasy XIV quiz trivia!");
        System.out.println("You have three attempts!");
        System.out.println("Press any key to continue ");
        userInput.nextLine();
        System.out.println("==========");
        firstQuestion(3);
    }

    public static int FirstQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println(ARRAY_OF_QUESTIONS[0]);
        System.out.println(ARRAY_OF_CHOICES[0]);
        System.out.print("Choose your answer: ");
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("A")) {
                    System.out.println("Answer is correct! Proceeding to the next question.");
                    SecondQuestion(maxAttempts);
                    return 0;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return firstQuestion(maxAttempts);
                        } else {
                            System.out.println("Hear. Feel. Think.");
                            return FirstQuestion(3);
                        }
                }
    }

    public static int SecondQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println(ARRAY_OF_QUESTIONS[1]);
        System.out.println(ARRAY_OF_CHOICES[1]);
        System.out.print("Choose your answer: ");
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("B")) {
                    System.out.println("Answer is correct! Proceeding to the next question.");
                    thirdQuestion(maxAttempts);
                    return 0;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return SecondQuestion(maxAttempts);
                        } else {
                            System.out.println("Hear. Feel. Think.");
                            return SecondQuestion(3);
                        }
                }
    }
    
    public static int ThirdQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println(ARRAY_OF_QUESTIONS[2]);
        System.out.println(ARRAY_OF_CHOICES[2]);
        System.out.print("Choose your answer: ");
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("C")) {
                    System.out.println("Answer is correct! Proceeding to the next question.");
                    FourthQuestion(maxAttempts);
                    return 0;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return ThirdQuestion(maxAttempts);
                        } else {
                            System.out.println("Hear. Feel. Think.");
                            return ThirdQuestion(3);
                        }
                }
    }

    public static int FourthQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println(ARRAY_OF_QUESTIONS[3]);
        System.out.println(ARRAY_OF_CHOICES[3]);
        System.out.print("Choose your answer: ");
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("B")) {
                    System.out.println("Answer is correct! Proceeding to the next question.");
                    fifthQuestion(maxAttempts);
                    return 0;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return FourthQuestion(maxAttempts);
                        } else {
                            System.out.println("Hear. Feel. Think.");
                            return FourthQuestion(3);
                        }
                }
    }
    
    public static int FifthQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println(ARRAY_OF_QUESTIONS[4]);
        System.out.println(ARRAY_OF_CHOICES[4]);
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("A")) {
                    System.out.println("Answer is correct!");
                    System.out.println("Congratulations, you have completed the quiz! Your score is 5/5!");
                    return 1;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return FifthQuestion(maxAttempts);
                        } else {
                            System.out.println("Hear. Feel. Think.");
                            return FifthQuestion(3);
                        }
                }
    }
}
