class parent{
    public parent(){
        System.out.println("Parent Construdtor");
    }
}

class child extends parent{
    public child(){
        System.out.println("Child Constructor");
    }
}

public class constructorInheritance {
    public static void main(String[] args) {
        child c=new child();
    }
}
