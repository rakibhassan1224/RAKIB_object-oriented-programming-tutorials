class Student {
    String name;
    int age;
    double gpa;

    // Constructor to store values from users
    Student(String studentName, int studentAge, double studentGpa) {
        this.name = studentName;
        this.age = studentAge;
        this.gpa = studentGpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
    }

    public void study() {
        System.out.println(this.name + " is studying.");
    }

    public void takeExam() {
        System.out.println(this.name + " is taking an exam.");
    }
}
