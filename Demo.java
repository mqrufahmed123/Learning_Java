interface A{
    // final and static
    int age = 44; 
    String area = "delhi";
    void show();
    void config();
}

interface X {
    void run();
}

class B implements A, X {
    public void show(){
        System.out.println("i   n show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running...");
    }
}

public class Demo {
    public static void main(String[] args){
        
        A obj;
        obj  = new B();
        obj.show(); 
        obj.config();    

    }
}
