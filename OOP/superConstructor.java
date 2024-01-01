class rectangleSuper{
    int length;
    int breadth;

    rectangleSuper(){
        length=1;
        breadth=1;
    }
    
    rectangleSuper(int l,int b){
        length=l;
        breadth=b;
    }
}

class cuboid extends rectangleSuper{
    int height;
    
    cuboid(){
        height=1;    
    }
    
    cuboid(int h){
        height=h;
    }

    cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }

    int volumn(){
        return length*breadth*height;
    }
    
}

public class superConstructor {

    public static void main(String[] args) {
        cuboid c=new cuboid(10,20,20);
        System.out.println("Volumn is "+c.volumn());

    }
}
