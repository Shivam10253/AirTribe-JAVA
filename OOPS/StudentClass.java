package OOPS;

public class StudentClass {
    // creating a new dataType with multiple attributes
    public static class Student {
        String name;
        int rollNo;
        double percent;
    }

    public static void main(String[] args) {
        // creating a new class for the object
        Student s1 = new Student();
        s1.name = "Shivam";
        s1.rollNo = 49;
        s1.percent = 59.9;

        System.out.println(s1.name);  
        System.out.println(s1.rollNo);  
        System.out.println(s1.percent + "%");  

    }
}
