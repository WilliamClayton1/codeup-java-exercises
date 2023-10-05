import java.util.Arrays;

public class ArraysExercises {

    public static void addPerson(Person[] personObj, Person newPerson) {

        int length = personObj.length+1;
        Person[] peopleArray = Arrays.copyOf(personObj, length);
        //add the person to the people array
        for (Person thisPerson : peopleArray) {
            System.out.println(thisPerson);
        }
    }

    public static void main (String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person person1 = new Person("Bob");
        Person person2 = new Person("Sam");
        Person person3 = new Person("Kevin");
        Person person4 = new Person("Steve");

        Person[] people = new Person[3];

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

//        int[] array = Arrays.copyOf(numbers, 6);
//
//        for (int number : array) {
//            System.out.println(number);
//        }

        addPerson(people, person4);

    }
}
