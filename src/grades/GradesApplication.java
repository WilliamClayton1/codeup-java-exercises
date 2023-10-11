package grades;

import java.util.HashMap;

import java.util.Scanner;

public class GradesApplication {

    public static void main (String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jim");
        Student student2 = new Student("Maria");
        Student student3 = new Student("Scott");
        Student student4 = new Student("Ashley");

        student1.addGrade(67);
        student1.addGrade(100);
        student1.addGrade(84);

        student2.addGrade(89);
        student2.addGrade(87);
        student2.addGrade(80);

        student3.addGrade(70);
        student3.addGrade(64);
        student3.addGrade(89);

        student4.addGrade(100);
        student4.addGrade(99);
        student4.addGrade(50);

        students.put("Jim32", student1);
        students.put("Maria_521", student2);
        students.put("Scott-95", student3);
        students.put("Ash3ly5", student4);

        boolean studentInfo = true;
        System.out.println("Welcome!");
        System.out.printf("%n");
        System.out.println("Here are the GitHub usernames of our students: ");



        do {

            System.out.printf("%n");

            for (String username : students.keySet()) {
                System.out.printf("| %s | ", username);
            }

            System.out.printf("%n%n");

            System.out.println("What student would you like to see more information on?");

            System.out.printf("%n");

            Scanner scanner = new Scanner(System.in);

            String userInput = scanner.nextLine();

            if (students.containsKey(userInput)) {

                for (String username : students.keySet()) {

                    if (userInput.equalsIgnoreCase(username)) {

                        System.out.println("Name: " + students.get(username).getName() + " - " + "GitHub Username: " + username);
                        System.out.println("Grades: " + students.get(username).getGrade());
                        System.out.printf("Current Grade Average: %.0f %n", students.get(username).getGradeAverage());

                    }
                }

                System.out.printf("%n");
                System.out.println("Would you like to continue? (Yes or No)");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("No")) {

                    studentInfo = false;
                    System.out.println("Goodbye, and have a wonderful day!");

                }

            } else {

                System.out.printf("%n");
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n%n", userInput);
                System.out.println("Would you like to continue? (Yes or No)");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("No")) {

                    studentInfo = false;
                    System.out.println("Goodbye, and have a wonderful day!");

                }

            }

        } while(studentInfo);

    }



}
