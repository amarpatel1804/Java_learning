import java.util.Date;

public class studentRollNoAssign {

    private static int rollNo;


    public static void main(String[] args) {
        rolltest t=new rolltest();

        t.getRollNo();

    }
}

class rolltest{

    private static String rollNo;

    private static int count=1;

     rolltest() {
        rollNo=generateRollNo();
    }

    public void getRollNo(){
        System.out.println(rollNo);
    }

    private String generateRollNo() {

        Date d=new Date();
        String rn="univ-"+(d.getYear()+1900)+" "+count;
        count++;
        return rn;
    }

}
