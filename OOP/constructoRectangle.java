class rectangleOne{

    private int length;
    private int breadth;

    public rectangleOne()
    {
        length=1;
        breadth=1;
    }

    public rectangleOne(int l,int b){
        length=l;
        breadth=b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {

        if(length>0){
            this.length = length;
        }
        else {
            this.length=0;
        }
    }

    public void setBreadth(int breadth){
        if(breadth>0){
            this.breadth = length;
        }
        else {
            this.breadth=0;
        }
    }

    public int area(){
        return length*breadth;
    }
}


public class constructoRectangle {

    public static void main(String args[])
    {
        rectangleOne r=new rectangleOne(10,5);
        System.out.println("Area is "+r.area());
    }
}
