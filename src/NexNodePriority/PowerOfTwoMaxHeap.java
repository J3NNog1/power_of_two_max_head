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

}