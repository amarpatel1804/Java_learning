abstract class superAbstract{

    superAbstract(){
        System.out.println("Constructor of super class");
    }

    public void meth1(){
        System.out.println("Meth1 superAbstract");
    }

    abstract public void meth2();

}

 class subAbstract extends superAbstract{

    public void meth2(){
        System.out.println("meth2 from sub class");
    }

    public void meth3(){
        System.out.println("Meth3 is called");
    }

}


public class abstractClassDemo {

    public static void main(String[] args) {

        //We cna not make objec of abstract class but we can make reference
        //superAbstract s=new superAbstract();
        superAbstract sp;

        superAbstract s=new subAbstract();
        s.meth2();
        s.meth1();

    }
}
