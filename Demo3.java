enum Status{
    Running, Failed, Pending, Success;
}


public class Demo3{
    public static void main(String[] args){

        Status s = Status.Pending;

        if(s == Status.Pending){
            System.out.println("wait");
        }
    }
}