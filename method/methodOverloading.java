public class methodOverloading {
    public static void main(String args[])
    {
        System.out.println(max(10.5f,10));
    }
//    static int max(int x,int y)
//    {
//        return x>y?x:y;
//    }

    static float max(float x,float y){
        return x>y?x:y;
    }
    static float max(int x,int y){
        return x>y?x:y;
    }
    static int max(int x,int y,int z)
    {
        return x>y && x>z?x:(y>z?y:z);
    }
}
