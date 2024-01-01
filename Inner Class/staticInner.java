class check{
    static int x=10;
    int y=50;

    static class inner{
        public void display(){
            System.out.println(x);//x can print because x is static and inner class is also static
            //System.out.println(y);//y can not print because y is not static
        }
    }
}

public class staticInner {
    public static void main(String[] args) {
        check.inner ci=new check.inner();
        ci.display();
    }
}
