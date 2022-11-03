package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    void getAllStudents() {

        ArrayList<Student> studentlist = new ArrayList<>();
        studentlist.add(new Student(1,"ben"));
        // Given
        StudentDB studendb1 = new StudentDB(studentlist);


        // When
        ArrayList<Student> result = studendb1.getAllstudents();



        ArrayList<Student>expected = new ArrayList<>();
        // Than
        expected.add(new Student(1,"ben"));
        assertEquals(expected,result);
    }
    @Test
    void testtoString(){
        // Given

        ArrayList<Student>testStudentList = new ArrayList<>();
        testStudentList.add(new Student(1,"sami"));
        testStudentList.add(new Student(2,"ben"));
        testStudentList.add(new Student(3,"lila"));
        StudentDB testDB = new StudentDB(testStudentList);

        String expectedResult = "StudentDB{Students=[Student{id=1, name='sami'}, Student{id=2, name='ben'}, Student{id=3, name='lila'}]}";
        // When
        String result = testDB.toString();


        // Than

        assertEquals(expectedResult,result);
    }
}
