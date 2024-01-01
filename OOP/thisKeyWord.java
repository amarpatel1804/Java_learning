
class rectange{
    int length;
    int breadth;

    rectange(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void display(){
        System.out.println("Lenghth is "+this.length);
        System.out.println("Breadth is "+this.breadth);
    }

}


class cuboidetails extends rectange{

    int height;
    cuboidetails(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;
    }

    void display(){
        super.display();
        System.out.println("Height is "+this.height);
    }

}


public class thisKeyWord {
    public static void main(String[] args) {
        rectange r1=new rectange(5,10);
        r1.display();

        cuboidetails c1=new cuboidetails(10,12,3);
        c1.display();
    }
}
