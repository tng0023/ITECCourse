package com.tommy;

import java.util.*;

public class ITECCourse {

    //Data for ITECCourse object to store
    private String name;
    private int code;
    private String room;
    private ArrayList<String> students;
    private int maxStudents;

    public void addStudent(String studentName) {
        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
            students = new ArrayList<String>();
        }
        students.add(studentName);
    }

    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Room: " + this.room);
        System.out.println("Students enrolled: ");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberofStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + this.maxStudents);
        System.out.println("There are " + (this.maxStudents - getNumberofStudents()) + " spots left in the class.");
    }

    public int getNumberofStudents() {
        return this.students.size();
    }

    //Constructor
    public ITECCourse(String courseName, int courseCode, String courseRoom, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.room = courseRoom;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
        }

    public String getCourseName() {
        return this.name;
    }

    public void setCourseName(String newName) {
        this.name = newName;
    }
}
