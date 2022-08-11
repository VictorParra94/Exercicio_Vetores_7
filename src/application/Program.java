package application;

import entities.People;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you type? = ");
        int length = sc.nextInt();
        People[] people = new People[length];

        int olderAge = 0;
        String oldName = null;

        for (int i = 0; i < length; i++) {
            System.out.println("Data of " + (i + 1) + "º person:");
            System.out.print("Name = ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age = ");
            int age = sc.nextInt();
            people[i] = new People(name, age);
            if (people[i].getAge() > olderAge) {
                olderAge = people[i].getAge();
                oldName = people[i].getName();
            }
        }
        System.out.println("\nOlder person = " + oldName + ", Age = " + olderAge);
    }
}