class test{
    static int x=10;
    int y=20;

    public void show(){
        System.out.println(x+" "+y);
    }

    public static void display(){
        System.out.println(x);
    }
}

public class staticExample {
    public static void main(String[] args) {
        test t=new test();
        test t1=new test();

        t.x=50;

        t.show();
        t.display();
        t1.show();
        t1.display();
    }
}
