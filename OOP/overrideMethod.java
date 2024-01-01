
class Super{
    public void display(){
        System.out.println("Super Class Method Overriding");
    }

}
class sub extends Super{
    public void display(){
        System.out.println("Sub class Method Overriding");
    }
}

public class overrideMethod {

    public static void main(String[] args) {

        //Reference of super class and object of sub class...so result is depend on object so result is sub class is display
        Super sp=new sub();
        sp.display();

    }
}
