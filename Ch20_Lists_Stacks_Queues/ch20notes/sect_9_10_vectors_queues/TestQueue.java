package ch20notes.sect_9_10_vectors_queues;

import org.junit.Test;

import java.util.*;

public class TestQueue
{
    @Test
    public void testQueue()
    {
        //Queue with four strings:
        Deque<String> queue = new LinkedList<>();
        queue.offer("Arizona");
        Collections.addAll(queue, "California", "Michigan", "New Mexico");
        System.out.println(queue);

        //removes first
        System.out.println(queue.remove() + " <-- remove operation\n" + queue);
    }

    @Test
    public void testPriorityQueue()
    {
        PriorityQueue<String> provinces = new PriorityQueue<>(6);
        Collections.addAll(provinces, "Ontario", "New Brunswick", "Quebec", "BC", "Manitoba",
                           "PEI");
        System.out.println(provinces);
    }
}
