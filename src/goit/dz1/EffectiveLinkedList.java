package goit.dz1;

import java.util.LinkedList;
import java.util.Iterator;

public class EffectiveLinkedList {



    public long arrayListPopulate(int value,LinkedList arr) {
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
    public long arrayListAdd(LinkedList arr){
        int repeat=100;
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            arr.add(i);
        }
        start += System.currentTimeMillis();
        return start;
    }
    public long arrayListGet(LinkedList arr){
        int repeat=100;
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i = 0; i <repeat; i++) {
            arr.get(1000);
        }
        start += System.currentTimeMillis();
        return start;
    }
    public long arrayListRemove(LinkedList arr){
        int repeat=100;
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i = 0; i < repeat; i++) {
            arr.remove(i+100);
        }
        start += System.currentTimeMillis();
        return start;
    }
    public long arrayListContaince(LinkedList arr,int index){
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
    public long arrayListIteratorAdd(LinkedList arr,int index){
        Iterator<Integer> iterator=arr.iterator();
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i=0;i<index-1;i++){
            iterator.next();
        }
        arr.add(iterator.next(),10);
        start += System.currentTimeMillis();
        return start;
    }
    public long arrayListIteratorRemove(LinkedList arr,int index){
        Iterator<Integer> iterator=arr.iterator();
        long start = 0;
        start = -System.currentTimeMillis();
        for (int i=0;i<index-1;i++){
            iterator.next();
        }
        arr.remove(iterator.next());
        start += System.currentTimeMillis();
        return start;
    }
}
