package lms;

import lms.model.Staff;
import lms.model.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("M001", "Your Name");
        Staff t = new Staff("M002", "Your Name");

        System.out.println(s.getMaxBorrowLimit());  // expect 3
        System.out.println(t.getMaxBorrowLimit());  // expect 10
        System.out.println(s);

        new Student("", "Your Name");               // expect IllegalArgumentException
    }
}