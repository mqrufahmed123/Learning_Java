@FunctionalInterface
interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
}

public class TypesOfInterfaces  {
    public static void main(String[] args){
        A obj = () ->{
            System.out.println("in show");
        };
        obj.show();
    }
}