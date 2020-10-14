public class Lab0Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ricardo");
        Person person2 = new Person(2, "Oliveira");

        Group group1 = new Group(person1);
        group1.addMember(person2);

        System.out.println(group1.toString());

    }
}
