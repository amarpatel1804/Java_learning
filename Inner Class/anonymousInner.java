abstract class sample{
    abstract void show();
}

class test{
    public void display(){
        sample s=new sample(){
            public void show(){
                System.out.println("This is a anonymous class");
            }
        };
        s.show();
    }
}

public class anonymousInner {
    public static void main(String[] args) {
        test t=new test();
        t.display();

    }
}
