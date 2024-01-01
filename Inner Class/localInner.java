 class outer {

    public void display(){
        class inner{

            public void show(){
                System.out.println("Hello this is local inner class");
            }
        }

        inner i=new inner();
        i.show();
    }

}
public class localInner{
    public static void main(String[] args) {
        outer o=new outer();
        o.display();
    }
}
