import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        // We use LinkedList as our Queue implementation
        this.requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        // 1. Add the new request to the back of the line
        requests.add(t);
        
        // 2. Remove any request from the front that is older than (t - 3000)
        // FIFO: The oldest request is always the first one we check
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        
        // 3. The remaining size is our answer!
        return requests.size();
    }
}