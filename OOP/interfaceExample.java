class phone{
    void call(){
        System.out.println("Call is dialed");
    }
    void sms(){
        System.out.println("SMS servise is open");
    }
}

interface camera{
    void click();
    void record();
}

interface musicPlayer{
    void play();
    void pause();
    void stop();
}

class smartphone extends phone implements camera,musicPlayer{
    void videoCall(){
        System.out.println("Video Call Service is provided");
    }

    public void click(){
        System.out.println("Clicking Picture services");
    }
    public void record(){
        System.out.println("Record video Service");
    }
    public void play(){
        System.out.println("Play music is allowed");
    }
    public void pause(){
        System.out.println("Pause Music is allowed");
    }
    public void stop(){
        System.out.println("Stop Functionality is work");
    }
}

public class interfaceExample {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.click();
        s.pause();

        phone p=s;
        p.call();
        p.sms();

        musicPlayer m=s;
        m.pause();
        m.play();
        m.stop();

    }
}
