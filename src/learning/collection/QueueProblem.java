package learning.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProblem {

    PriorityQueue<String> ticketQueue = new PriorityQueue<>();

    public void addTicket(String ticket) {
        ticketQueue.offer(ticket);
    }

    public String processTicket() {
        return ticketQueue.poll(); // FIFO
    }



}
