import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-11-10
 * Time: 10:03
 */
public class TestDemo {

    public static void main(String[] args) {
        int[] array = { 27,15,19,18,28,34,65,49,25,37};

        TestHeap testHeap = new TestHeap();
        testHeap.initHeap(array);
        System.out.println("==============");
        testHeap.pop();
        System.out.println("==============");
    }



    public static void main1(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(13);
        priorityQueue.offer(3);
        priorityQueue.offer(8);
        priorityQueue.offer(49);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());

    }
}
