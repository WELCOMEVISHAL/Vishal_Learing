package OPPS;

public class Student{

    //data: data members : instance variables
    int studentId;
    String studentName;
    String studentCity;

    //Behaviour: member methods : methods : (Functions)

    public void study(){
        System.out.println(studentName+"is studying");
    }

    public void showFullDetails(){
        System.out.println("My name is" + studentName);
        System.out.println("My id is" + studentId);
        System.out.println("My city is" + studentCity);
    }

}