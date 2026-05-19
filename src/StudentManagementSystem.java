public class StudentManagementSystem {

    static class Student {

        String name;
        int age;
        double marks;

        Student(String name, int age, double marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        void displayStudentInfo() {
            System.out.println("------------------------------");
            System.out.println("Name  : " + name);
            System.out.println("Age   : " + age);
            System.out.println("Marks : " + marks);
            System.out.println("------------------------------");
        }

        String calculateGrade() {
            if (marks >= 80) {
                return "A";
            } else if (marks >= 70) {
                return "B";
            } else if (marks >= 60) {
                return "C";
            } else if (marks >= 50) {
                return "D";
            } else {
                return "F";
            }
        }

        boolean isPassed() {
            return marks >= 50;
        }

        static void schoolMotto() {
            System.out.println("Education For Everyone");
        }

        String compareMarks(Student otherStudent) {
            if (this.marks > otherStudent.marks) {
                return this.name;
            } else if (otherStudent.marks > this.marks) {
                return otherStudent.name;
            } else {
                return "It's a tie! Both students have " + this.marks + " marks.";
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== School Motto ===");
        Student.schoolMotto();
        System.out.println();

        Student student1 = new Student("Alice Uwimana", 20, 75.0);
        Student student2 = new Student("Bob Nkurunziza", 22, 45.0);

        System.out.println("=== Student Information ===");
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        System.out.println("=== Grades & Pass Status ===");
        System.out.println(student1.name + "'s Grade : " + student1.calculateGrade());
        System.out.println(student1.name + " Passed  : " + student1.isPassed());
        System.out.println();
        System.out.println(student2.name + "'s Grade : " + student2.calculateGrade());
        System.out.println(student2.name + " Passed  : " + student2.isPassed());
        System.out.println();

        int bonusMarks = 10;

        System.out.println("=== Applying Bonus Marks (" + bonusMarks + " points) ===");
        System.out.println(student2.name + "'s marks before bonus: " + student2.marks);
        student2.marks += bonusMarks;
        System.out.println(student2.name + "'s marks after  bonus: " + student2.marks);
        System.out.println(student2.name + "'s new Grade          : " + student2.calculateGrade());
        System.out.println(student2.name + " now Passed           : " + student2.isPassed());
        System.out.println();

        System.out.println("=== Comparing Marks ===");
        String topStudent = student1.compareMarks(student2);
        System.out.println("Student with higher marks: " + topStudent);
        System.out.println();

        System.out.println("=== Program Complete ===");
    }
}