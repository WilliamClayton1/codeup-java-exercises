import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] personObj, Person newPerson) {
        int length = personObj.length+1;
        Person[] peopleArray = Arrays.copyOf(personObj, length);
        peopleArray[length - 1] = newPerson;
        return peopleArray;
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

        Person[] people2 = addPerson(people, person4);
        for (Person person : people2) {
            System.out.println(person.getName());
        }
    }
}
