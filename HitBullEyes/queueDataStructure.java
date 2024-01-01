import java.util.LinkedList;
import java.util.Queue;

public class queueDataStructure {
    public static void main(String[] args) {

        Queue<String> queue=new LinkedList<>();

        queue.add("JP");
        queue.add("Ansh");
        queue.add("karmur");
        queue.add("mosam");

        System.out.println("Queue is : "+queue);

        String head=queue.poll();

        //Remove first element
        System.out.println("Head: "+head);
        System.out.println("Updated Queue: " + queue);

        String peek=queue.peek();
        System.out.println("Peek: "+peek);

        boolean contain=queue.contains("JP");
        System.out.println("contains: "+contain);

    }
}
