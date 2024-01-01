public class nestedInner {
    int x=10;

    class inner{
        int y=20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }

        public void outerDisplay(){
            inner i=new inner();
            i.innerDisplay();
        }
    }

    public static void main(String[] args) {
        nestedInner.inner oi=new nestedInner().new inner();
        oi.innerDisplay();
    }
}
