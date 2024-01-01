public class extraChar {


    public static void main(String[] args) {
        String send="abcde";
        String receive="abcd";
        System.out.println(findExtraCha(send,receive));
    }

    public static char findExtraCha(String send, String receive) {

        char answer=' ';
        char sendArr[]=new char[50];
        char receiveArr[]=new char[50];

        sendArr=send.toCharArray();
        receiveArr=receive.toCharArray();
        int i;
        for (i=0;i<receive.length();i++){
            if(sendArr[i]!=receiveArr[i]){
                break;
            }
        }
        return sendArr[i];
    }

    int xyz(int a){
        return a-1;
    }
}
