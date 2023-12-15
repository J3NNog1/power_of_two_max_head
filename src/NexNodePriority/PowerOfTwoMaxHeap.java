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
        while (index > 0) {
            int parent = (index -1) / arity;
            if(heap.get(index) > heap.get(parent)){
                swap(index, parent);
                index = parent;
            } else {
                break;
            }

        }

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
        while (true) {
            int maxChild = getMaxChild(index);
            if (maxChild == -1 || heap.get(index) >=
            heap.get(maxChild)) {
                break;
            }
            swap(index, maxChild);
            index = maxChild;
        }

    }

    private int findMaxChild(int index) {
        int start = index * arity + 1;
        int end = Math.min(heap.size() - 1, start + arity - 1);
        if (start > end) {
            return -1;
        }
        int maxChild = start;
        for (int i = start + 1; i <= end; i++) {
            if (heap.get(i) > heap.get(maxChild)) {
                maxChild = i;
            }
        } return maxChild;
    }

    private void swap (int i, int j) {

    }




}
