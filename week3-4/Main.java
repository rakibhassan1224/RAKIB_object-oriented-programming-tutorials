public class Main {
    public static void main(String[] args) {
        Person p1 = new Student("Ali", "S101");
        Person p2 = new Lecturer("Dr. Ahmad", "L202");

        p1.introduce();
        p2.introduce();
    }
}
