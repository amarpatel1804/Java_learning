public class studentChallange {

    public static void main(String args[]){

        String email="programmer@gmail.com";

        String username,domain_name;
        int index=email.indexOf("@");
        int dot_index=email.indexOf(".");


        username=email.substring(0,index);
        System.out.println(username);

        domain_name=email.substring(index+1);
        System.out.println(domain_name);

        Boolean gmailCheck=(email.substring(index+1,dot_index)).equals("gmail");
        System.out.println("Gmail checking: "+gmailCheck);
    }
}
