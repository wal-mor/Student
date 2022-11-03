package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private int id;
    private String name;


    public int getId(){

        return id;
    }
    public void setId(int your_id){
        this.id=your_id;
    }
    public String getName(){
        return name;
    }
    public void setName(String your_name){
        this.name=your_name;
    }

    public Student() {

    }

    public Student(int id, String name){
        this.id=id;
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
