class rectangle{

    //Private Data members
    private int length;
    private int breadth;

    //Public method to access (set and get methods) private data members
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setLength(int l){
        length=l;
    }
    public void setBreadth(int b){
        breadth=b;
    }


    //Method performing area calculation,parameter calculations
    public int area(){
        return length*breadth;
    }
    public int parameter(){
        return 2*(length+breadth);
    }
}

public class rectangelTestDataHide {

    public static void main(String args[]){
        rectangle r=new rectangle();
        r.setLength(10);
        r.setBreadth(10);

        System.out.println("Length of rectage is "+r.getLength());
        System.out.println("Breadth of rectage is "+r.getBreadth());
        System.out.println("Area of rectangle is: "+r.area());
        System.out.println("Parameter of rectange is: "+r.parameter());


    }
}
