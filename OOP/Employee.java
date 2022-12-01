//5. Write a program that would print the information (name, year of joining, salary, address) of three
//employees by creating a class named 'Employee'. The output should be as follows:
// (Easy)
// (Easy)
//Name
//Robert 1994
//2000
//1999
//Sam
//John
//Year of joining Address
//64C- WallsStreet
//68D- WallsStreet
//26B- WallsStreet
public class Employee {
    String name;
    int year;
    String address;
}
 class emp{
     public static void main(String[] args) {
         Employee obj = new Employee();
         obj.name = "Robert";
         obj.year = 1994;
         obj.address = "64C-wallstreet";
         Employee obj1 = new Employee();
         obj1.name = "Sam";
         obj1.year = 2000;
         obj1.address = "68D-wallstreet";
         Employee obj2 = new Employee();
         obj2.name = "John";
         obj2.year = 1999;
         obj2.address = "26B-wallstreet";

         System.out.println("Name:" + "\t" + "Year of Joining" +    "\t"    +   "Address" );
         System.out.println(obj.name + "\t" + obj.year +    "\t"    +   obj.address);
         System.out.println(obj1.name + "\t" + obj1.year +    "\t"    +   obj1.address);
         System.out.println(obj2.name + "\t" + obj2.year +    "\t"    +   obj2.address);

     }
 }
