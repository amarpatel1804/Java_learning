abstract class shape{
    abstract public double area();
    abstract public double perimeter();
}

class rectangel extends shape{
    double length;
    double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return length + breadth+length+breadth;
    }

}

class circleShape extends shape{
    double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

public class shapeAbstract {

    public static void main(String[] args) {
        rectangel r=new rectangel();
        r.length=10;
        r.breadth=20;
        System.out.println(r.area());


        shape s=new rectangel();
        System.out.println(s.area());
        System.out.println(s.perimeter());


    }

}
