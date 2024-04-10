package Exception_Handling;

public class MyException extends Exception {
    MyException(String msg){
        super(msg);
    }
}
class GraceMarks {
    static void GraceMarkss(int marks) throws MyException{
        if(marks <= 15){
        throw new MyException("fail exam");
    }}

    
}