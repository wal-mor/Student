package org.example;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Student>students = new ArrayList<>();
//        students.add(new Student(1, "sami"));
//        students.add(new Student(2, "ben"));
//        students.add(new Student(3, "lila"));
//        StudentDB studentdb1 = new StudentDB(students);

//        System.out.println("random student:   "+studentdb1.randomStudent());
//        System.out.println(studentdb1);
        ComputerScienceStudent student= new ComputerScienceStudent(1,"sami",true,100);
        System.out.println(student);
        ComputerScienceStudent student2= new ComputerScienceStudent(2,"ali",false,120);
        student2.getGrade();
    }
}
