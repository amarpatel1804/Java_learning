
class smartTV extends TV{


    public void ChangeChannel(){
        System.out.println("Smart TV channel chnaged");
    }

    public void browseApp(){
        System.out.println("Smart TV browse application");
    }
}

class TV{

    public void switchOn(){
        System.out.println("TV is switch On");
    }
    public void ChangeChannel(){
        System.out.println("TV chanel is changed");
    }
}


public class TVexampleMethodOverring {

    public static void main(String[] args) {
        smartTV st=new smartTV();
        st.ChangeChannel();

        TV tv=new TV();
        tv.ChangeChannel();;


        //Super class reference and smartTV object...a]end of result smartTV object method is called
        TV mt=new smartTV();
        mt.ChangeChannel();
    }
}
