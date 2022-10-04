package Classes.Exampels;

class Student {
    public int rollNumber, m1, m2, m3;
    public String name, course;



    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public String grade() {
//        return (m1 > m2 && m1 > m3) ? m1 : (m3 > m2 ? m3 : m2);
        return (average() >= 60) ? "A" : "B";
    }

    public String showInfo(){
        return "Roll Number: " + rollNumber + "\nName Student: " + name + "\nCourse: "+ course;
    }

}


public class StudentClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNumber = 100;
        student.m1 = 100;
        student.m2 = 200;
        student.m3 = 300;
        student.name = "Arafat";
        student.course = "Java";

        Student student2 = new Student();
        student2.rollNumber = 10;
        student2.m1 = 10;
        student2.m2 = 20;
        student2.m3 = 30;
        student2.name = "Mustafa";
        student2.course = "Java";


        System.out.println(student.showInfo());
        System.out.println("total: " + student.total());
        System.out.println("average: " + student.average());
        System.out.println("grade: " + student.grade() + "\n");

        System.out.println(student2.showInfo());
        System.out.println("total: " + student2.total());
        System.out.println("average: " + student2.average());
        System.out.println("grade: " + student2.grade());


    }
}
