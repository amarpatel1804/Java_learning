class student{

    //Students Properties
    public int rollNo;
    public String name;
    public String couurse;
    int m1,m2,m3;


    //Behaviour of student class
    int total(){
        return m1+m2+m3;
    }

    int average(){
        return total()/3;
    }

    String grade(){
        if(average()>60)
            return "Grade A";
        else
            return "Grade B";
    }

}


public class studentTest {

    public static void main(String args[])
    {
        student s=new student();
        s.name="Vruja";
        s.couurse="BCA";
        s.rollNo=11;
        s.m1=50;
        s.m2=70;
        s.m3=80;

        System.out.println(s.name+" has total marks "+ s.total());
        System.out.println(s.name+" has average marks "+s.average());
        System.out.println(s.name+" has get grade "+s.grade());
    }
}


