interface Computer{
    public void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run but faster");
    }
}
class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class Demo2{
    public static void main(String args[]){
        Developer maruf = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        maruf.devApp(desk);
    }
}