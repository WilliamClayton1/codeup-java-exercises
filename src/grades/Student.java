package grades;

import java.util.ArrayList;

public class Student {

    //Properties
    private final String name;
    private ArrayList<Integer> grades;

    //Getter
    public String getName() {
        return this.name;
    }
    public ArrayList<Integer> getGrade() {
        return this.grades;
    }
    //Setter
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    //Constructor
    public Student(String studentName) {
        this.name = studentName;
        grades = new ArrayList<>();
    }

    //Methods
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        double sumOfGrades = 0;
        int numberOfGrade = grades.size();
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades / numberOfGrade;
    }

}
