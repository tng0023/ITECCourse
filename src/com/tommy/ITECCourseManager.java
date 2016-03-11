package com.tommy;

import java.lang.reflect.Array;
import java.util.*;

public class ITECCourseManager {

    public static void main(String args[]) {

        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, "T5500", 4);

        //add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.addStudent("Tommy");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425,"T6600", 30);

        //add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse infotechconceptsCourse =
                new ITECCourse("Info Tech Concepts", 1100, "T3050", 30);

        infotechconceptsCourse.addStudent("Max");
        infotechconceptsCourse.addStudent("Nancy");
        infotechconceptsCourse.addStudent("Orson");

        infotechconceptsCourse.writeCourseInfo();


    }




    }

