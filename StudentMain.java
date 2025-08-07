public class StudentMain {

    static class Student {
        private String name;
        private int id;

        private static String schoolName = "GCELT";

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Student ID: " + id);
            System.out.println("School Name: " + schoolName);
        }

        public static void changeSchool(String newSchoolName) {
            schoolName = newSchoolName;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Suman", 101);
        Student s2 = new Student("Raj", 102);
        s1.display();
        s2.display();

        Student.changeSchool("GCECT");

        s1.display();
        s2.display();
    }
}
