package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(2);

        myQueue.enqueue(1);

        //Returns Node with 2.
        System.out.println(myQueue.dequeue().value);

        //Returns Node with 1
        System.out.println(myQueue.dequeue().value);

        //Returns null
        System.out.println(myQueue.dequeue());
    }
}
