import java.util.PriorityQueue;

public class LC_295_Find_median_from_data_stream {

    /** initialize your data structure here. */
    PriorityQueue<Integer> maxHeap = null;
    PriorityQueue<Integer> minHeap = null;
    public LC_295_Find_median_from_data_stream() {
        // maxHeap=new PriorityQueue<>(new Comparator<Integer>(){
        //     @Override
        //     public int compare(Integer o1,Integer o2){
        //         int x = (int) o1;
        //         int y = (int) o2;
        //         if(x>y) return 1;
        //         else return -1;
        //     }
        // });
        maxHeap = new PriorityQueue<>((a,b)->(b-a));
        minHeap = new PriorityQueue<>((a,b)->(a-b));
        
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0 || maxHeap.peek()>=num){
            maxHeap.offer(num);
        }else{
            minHeap.offer(num);
        }
        // Now balancing the both heap
        if(maxHeap.size()-minHeap.size()>1){
            minHeap.offer(maxHeap.poll());
        }
        else if(minHeap.size()-maxHeap.size()>1){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()){
            return maxHeap.peek();
        }else if(maxHeap.size()<minHeap.size()){
            return minHeap.peek();
        }else{
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */