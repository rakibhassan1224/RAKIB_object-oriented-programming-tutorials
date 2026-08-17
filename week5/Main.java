public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentID("CU12345");
        s.setName("Ali");
        s.setCGPA(3.75);
        s.setProgramme("BIT");

        System.out.println("Student ID : " + s.getStudentID());
        System.out.println("Name       : " + s.getName());
        System.out.println("CGPA       : " + s.getCGPA());
        System.out.println("Programme  : " + s.getProgramme());
    }
}
