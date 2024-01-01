class Rectangle{

    //Properties of rectangle class
    public double length;
    public double breadth;

    //Behaviour of Rectangel Class
    double area(){
        return length*breadth;
    }

    double parameter(){
        return 2*(length+breadth);
    }

    boolean isSqure(){
        if (length==breadth){
            return true;
        }
        else{
            return false;
        }
    }

}


public class rectangleTest {

    public static void main(String args[]){

        //make an object of rectangle class

        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=10;

        System.out.println("Area of rectangle is: "+r.area());
        System.out.println("Parameter of rectangle is: "+r.parameter());
        System.out.println("Given Rectange is sqare ?  "+r.isSqure());
    }

}
