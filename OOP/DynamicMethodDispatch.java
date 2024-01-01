class superDy{
    public void meth1(){
        System.out.println("Super Meth1");
        }

        public void meth2(){
        System.out.println("Super Meth2");
        }
}

class subDy extends superDy{
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meth3(){
        System.out.println("Sub meth3");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        superDy sd=new subDy();
        sd.meth2();
    }
}
