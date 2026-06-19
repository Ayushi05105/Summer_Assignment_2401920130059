package WEEK3.DAY5;

import java.util.LinkedList;
import java.util.Queue;

public class NoRecentCall {
    Queue<Integer> q;

    public NoRecentCall() {

        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);
        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }

    public static void main(String[] args) {
        NoRecentCall recentCounter = new NoRecentCall();

        System.out.print(recentCounter.ping(1)+" "); 
        System.out.print(recentCounter.ping(100)+" "); 
        System.out.print(recentCounter.ping(3001)+" "); 
        System.out.print(recentCounter.ping(3002)+" "); 
    }

}
