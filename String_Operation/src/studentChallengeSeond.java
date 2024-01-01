public class studentChallengeSeond {

    public static void main(String args[])
    {
        int b=101011100;
        String str=b+"";
        System.out.println(str.matches("[01]*"));

        int h=0x123A;

        String hexaCheck=String.valueOf(h);
        System.out.println(hexaCheck.matches("[A-F0-9]*"));

        String date="05/04/2007";
        System.out.println(date.matches("[0-3][1-9]/[01][1-9]/[0-9]{4}"));

    }
}
