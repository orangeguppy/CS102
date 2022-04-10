import java.util.*;

public class ObjectArrays {
    public static void printArray(Person[] arr) {
        for (Person p : arr) {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Mary", 7);
        Person p2 = new Person("Melon", 9);
        Person p3 = new Person("Amy", 71);
        Person p5 = new Person("Collin", 27);
        Person p4 = new Person("Bob", 27);

        Person[] arr = new Person[] { p1, p2, p3, p4, p5 };
        printArray(arr);

        Arrays.sort(arr); // using comparable
        printArray(arr);
        Arrays.sort(arr, new PersonComparator()); // using comparator
        printArray(arr);
    }
}