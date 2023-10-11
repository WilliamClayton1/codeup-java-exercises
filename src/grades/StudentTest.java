package grades;

public class StudentTest {

    public static void main (String[] args) {

        Student student1 = new Student("mike");

        student1.addGrade(98);
        student1.addGrade(98);
        student1.addGrade(98);

        System.out.println(student1.getGradeAverage());

    }

}
