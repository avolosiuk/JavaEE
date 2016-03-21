package goit.dz1;


import java.util.TreeSet;

public class EffectiveTreeSet {

    public long setPopulate(int value,TreeSet arr) {
        long start = 0;
        int repeat=100;
        start = -System.currentTimeMillis();
        for(int j=0;j<repeat;j++) {
            arr.clear();
            for (int i = 0; i < value; i++) {
                arr.add(i);
            }
        }
        start += System.currentTimeMillis();
        return start/100;
    }
    public long setAdd(TreeSet arr){
        int repeat=100;
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            arr.add(i);
        }
        start += System.currentTimeMillis();
        return start;
    }
    public long setRemove(TreeSet arr){
        int repeat=100;
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            arr.remove(i+100);
        }
        start += System.currentTimeMillis();
        return start;
    }
    public long setContaince(TreeSet arr,int index){
        int repeat=100;
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.contains(index)){
                break;
            }
        }
        start += System.currentTimeMillis();
        return start;
    }
}

