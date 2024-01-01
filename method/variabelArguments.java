public class variabelArguments {
    public static void main(String args[])
    {
        show(5,"amar","om","kaju","kaju","bhim","Tom");

    }
    static void show(int start,String ...s){

        for(int i=0;i<s.length;i++){
            System.out.println(start+" . "+s[i]);
            start++;
        }
    }
}
