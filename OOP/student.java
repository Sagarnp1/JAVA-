//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
//the value of roll_no as '2' and that of name as "John" by creating an object of the class Student
public class student {
    String name;
    int rollno;
}
 class student1{
     public static void main(String[] args) {
         student oop = new student();
         oop.name = "John";
         oop.rollno = 2;
         System.out.printf("Name :" +   oop.name  );
         System.out.println("Roll No:" + oop.rollno);
     }
 }
