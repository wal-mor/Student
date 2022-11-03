package org.example;





import java.util.ArrayList;
import java.util.List;

public class StudentDB {


  private ArrayList<Student>Students;


    public StudentDB ( ArrayList<Student>studentslist){


    this.Students=studentslist;
    }



    public ArrayList<Student> getAllstudents(){

        return Students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "Students=" + Students +
                '}';
    }

public  Student randomStudent(){

        int index= (int) (Math.random() * (this.Students.size()));
        return this.Students.get(index);
}


}

