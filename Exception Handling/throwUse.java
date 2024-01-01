public class throwUse {
    static class NegetiveDimentionException extends Exception{
        public String toString(){
            return "Dimention are negative";
        }
    }
    static int area(int l,int b) throws NegetiveDimentionException
    {
        if(l<0 || b<0)
            throw new NegetiveDimentionException();
        return l*b;
    }
    static void meth1() throws NegetiveDimentionException{
        System.out.println("Area is "+area(-10,2));
    }

    public static void main(String[] args) {
        try {
            meth1();
        }catch (NegetiveDimentionException e){
            System.out.println(e);
        }
    }
}