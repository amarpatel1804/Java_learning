import javax.annotation.processing.SupportedSourceVersion;

public class objectParameterArray {
    public static void main(String args[])
    {
        int  A[]={1,2,3,4,5,6};
        int index=1;
        int element=25;
        System.out.println("Array from calling method: ");
        for(int x:A)
        {
            System.out.println(x+" ");
        }
        change(A,index,element);
        System.out.println("Array after update element value: ");
        for(int x:A){
            System.out.println(x+" ");
        }
        System.out.println("\n");
        int p=10;
        int q=change2(p,20);
        System.out.println("Primitive actual parameter value does not change when change in formal parameter "+p);
        System.out.println("Formal Prameter changes "+q);
    }

    static int change2(int q,int value)
    {
        q=value;
        return q;
    }
    static void change(int B[],int index,int element)
    {
        B[index]=element;
    }
}
