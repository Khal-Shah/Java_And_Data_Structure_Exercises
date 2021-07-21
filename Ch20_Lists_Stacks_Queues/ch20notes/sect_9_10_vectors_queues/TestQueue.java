package ch20notes.sect_9_10_vectors_queues;

import org.junit.Test;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

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
    public void testQueue2()
    {
        PriorityQueue<String> provinces = new PriorityQueue<>();
//        provinces.offer("Quebec");
        Collections.addAll(provinces, "Ontario", "New Brunswick", "Quebec", "BC", "Manitoba",
                           "PEI");

        System.out.println(provinces);
    }
}
