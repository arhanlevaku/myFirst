package com.company.singletonclass;
import java.lang.*;
import java.util.*;

class Student
{

    private String rollNo;

    private static int count=1;

    private String assignRollNo()
    {

        Calendar d = Calendar.getInstance();
        System.out.println("The Current Date is:" + d.getTime());


        String rno="Univ-"+(d.get(Calendar.YEAR) +1900)+"-"+count;
        count++;
        return rno;
    }
    Student()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }

}

public class studentclass {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());

    }
}
