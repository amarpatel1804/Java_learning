 class circleDetails{

    public int radius;

    public double arae(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

}

class cyclinder extends circleDetails{

    public int height;
    public double volumn(){
        return arae()*height;
    }

}

public class inheritanceCircle {

    public static void main(String[] args) {

        cyclinder c=new cyclinder();
        c.radius=10;
        c.height=10;

        System.out.println("Area of Cyclider is "+c.arae());
        System.out.println("Volumn of Cyclender is "+c.volumn());
    }


}
