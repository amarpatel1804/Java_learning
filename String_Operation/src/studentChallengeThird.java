public class studentChallengeThird {
    public static void main(String args[]){

        String str="a@b$c%1&2!2";
        String str1=" akckac knac jac apjc papc ";

        System.out.println(str.replaceAll("[^A-Za-z0-9]*",""));

        System.out.println(str1.replaceAll("\\s"," ").trim());

        String word[]=str1.split("\\s");
    }
}
