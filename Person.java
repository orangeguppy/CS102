public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person p) {
        return age - p.age;
    }

    public String toString() {
        return name;
    }

    protected void play() {
        System.out.println("FUN");
    }
}