package Exception_Handling;

import java.util.Scanner;

public class Grace_marks_system {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
            int marks = sc.nextInt();

            if(marks >= 20){
                System.out.println("Pass exam");
            } if(marks >= 15 && marks <= 20){
                int Gmarks = 20 - marks ;
                marks = marks + Gmarks;
                System.out.println("pass exam with grace makrs :- " + marks);

            GraceMarks.GraceMarkss(marks);

      /*   try {
          if(marks >= 15 && marks <= 20){
            int Gmarks = 20 - marks ;
            marks = marks + Gmarks;
            System.out.println("pass exam with grace makrs :- " + marks);
          }else {
            System.out.println("fail exam");
          }

        } catch (Exception e) {
            System.out.println("Invalid number");
            // TODO: handle exception
        }*/
    }
    }}

  
