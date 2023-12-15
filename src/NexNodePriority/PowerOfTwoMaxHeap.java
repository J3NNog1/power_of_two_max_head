package NexNodePriority;

import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
    private List<Integer> heap; //heap is my ArrayList
    // number of children per node (2^arity)
    // (2^arity) = (2^x) || my descriptive variable vvv
    private int arity;


    //constructor initializing `heap` as a new `ArrayList`
    //and `arity` as the passed in `arity` parameter
    public PowerOfTwoMaxHeap(int arity) {
        heap = new ArrayList<>();
        this.arity = arity;
    }

    //method for inserting a new element into the heap
    public void insert (int value) {
        heap.add(value);//adds value to the end of the heap
        heapifyUp(heap.size() - 1);//restores head property
    }

    private void heapifyUp(int index) {


    }
    public Integer popMax() {
        if(heap.isEmpty()) {//checks if heap is empty
            throw new IllegalStateException("Heap is empty");
        }
        Integer max = heap.get(0);//retrieves max value
        Integer last = heap.remove(heap.size() - 1);//removes last element

        //calls heapifyDown if heap is not empty
        if(!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return max;
    }

    private void heapifyDown(int index) {


    }

}
