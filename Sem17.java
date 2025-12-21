class FailException extends Exception{
    public FailException(String message){
        super(message);
    }
}

class ExamChecker{
    public void checkMarks(int marks) throws FailException{
        if(marks<33){
            throw new FailException("FAILED---");
        }
        System.out.println("PASSED---");
    }
}

public class Sem17 {
    public static void main(String[] args){
        ExamChecker ex = new ExamChecker();
        try{
            ex.checkMarks(20);
        }
        catch(FailException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
