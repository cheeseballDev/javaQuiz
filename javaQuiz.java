package javaActivities;

import java.util.*;

public class javaQuiz {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to to the Final Fantasy XIV quiz trivia!");
        System.out.println("You have three attempts!");
        System.out.println("Press any key to continue ");
        userInput.nextLine();
        System.out.println("==========");
        firstQuestion(3);
    }

    public static int firstQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println("Q1: What is the name of the first expansion for FFXIV?");
        System.out.println("A.) Heavensward");
        System.out.println("B.) A Realm Reborn");
        System.out.println("C.) Stormbringers");
        System.out.print("Choose your answer: ");
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("A")) {
                    System.out.println("Answer is correct! Proceeding to the next question.");
                    secondQuestion(maxAttempts);
                    return 0;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return firstQuestion(maxAttempts);
                        } else {
                            System.out.println("You have used too many attempts. Try again.");
                            return firstQuestion(3);
                        }
                }
    }

    public static int secondQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println("Q2: Who was the final boss in the A Realm Reborn expansion?");
        System.out.println("A.) Nero Tol Scaeva");
        System.out.println("B.) Ultima Weapon");
        System.out.println("C.) Gaius Van Baelsar");
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
                            return secondQuestion(maxAttempts);
                        } else {
                            System.out.println("You have used too many attempts. Try again.");
                            return firstQuestion(3);
                        }
                }
    }
    
    public static int thirdQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println("Q3: Who is the leader of the Scions of the Seventh Dawn?");
        System.out.println("A.) Y'shtola Rhul");
        System.out.println("B.) Thancred Waters");
        System.out.println("C.) Minfilia Warde");
        System.out.print("Choose your answer: ");
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("C")) {
                    System.out.println("Answer is correct! Proceeding to the next question.");
                    fourthQuestion(maxAttempts);
                    return 0;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return thirdQuestion(maxAttempts);
                        } else {
                            System.out.println("You have used too many attempts. Try again.");
                            return firstQuestion(3);
                        }
                }
    }

    public static int fourthQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println("Q4: What is the name of the first dungeon that the player encounters?");
        System.out.println("A.) Copperbell Mines");
        System.out.println("B.) Sastasha");
        System.out.println("C.) The Tam-Tara Deepcroft");
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
                            return fourthQuestion(maxAttempts);
                        } else {
                            System.out.println("You have used too many attempts. Try again.");
                            return firstQuestion(3);
                        }
                }
    }
    
    public static int fifthQuestion(int maxAttempts) {
        String ans, ansUpper;
        System.out.println("Q5: Who is the leader of the city-state, Gridania?");
        System.out.println("A.) Kann-E Senna");
        System.out.println("B.) Nanamo Ul Namo");
        System.out.println("C.) Thordan VII");
        System.out.print("Choose your answer: ");
        ans = userInput.nextLine();
        ansUpper = ans.toUpperCase();
                if (ansUpper.equals("A")) {
                    System.out.println("Answer is correct!");
                    System.out.println("Congratulations, you have completed the quiz!");
                    return 1;
                } else {
                    System.out.println("Answer is incorrect, try again.");
                    maxAttempts -= 1;
                    System.out.println((maxAttempts == 1) ? maxAttempts + " Last attempt!" : maxAttempts + " Attempts remaining!");
                        if(maxAttempts > 0) {
                            return fifthQuestion(maxAttempts);
                        } else {
                            System.out.println("You have used too many attempts. Try again from the start.");
                            return firstQuestion(3);
                        }
                }
    }
}
