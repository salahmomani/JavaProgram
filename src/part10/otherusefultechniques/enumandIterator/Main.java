package part10.otherusefultechniques.enumandIterator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /// /////////part1/////////////
//        Person anna = new Person("Anna", Education.PHD);
//        System.out.println(anna);

///// //////////part2///////////////
//        Employees employees = new Employees();
//        Person anna = new Person("Anna", Education.PHD);
//        Person bob = new Person("Bob", Education.MA);
//        Person charlie = new Person("Charlie", Education.BA);
//        Person diana = new Person("Diana", Education.HS);
//
//        employees.add(anna);
//        employees.add(bob);
//
//        employees.add(Arrays.asList(charlie, diana));
//
//        System.out.println("All employees:");
//        employees.print();
//
//        System.out.println("\nEmployees with a Master's degree:");
//        employees.print(Education.MA);

        /// ////part3////////
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));
        university.print();
        university.fire(Education.HS);
        university.print();

    }

    }
