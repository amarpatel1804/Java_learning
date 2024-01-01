public class staticBlocks {

    static
    {
        System.out.println("block1");
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    static
    {
        System.out.println("block2");
    }
}
