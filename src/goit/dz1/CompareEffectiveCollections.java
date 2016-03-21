package goit.dz1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CompareEffectiveCollections {
    public static void main (String[] args) throws IOException{
        EffectiveArrayList effectiveArrayList = new EffectiveArrayList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        EffectiveLinkedList effectiveLinkedList = new EffectiveLinkedList();
        LinkedList<Integer> linkedList = new LinkedList<>();
        EffectiveHashSet effectiveHashSet = new EffectiveHashSet();
        HashSet<Integer> hashSet = new HashSet<>();
        EffectiveTreeSet effectiveTreeSet = new EffectiveTreeSet();
        TreeSet<Integer> treeSet = new TreeSet<>();

            int[] value = {10000, 100000,1000000};
        FileWriter writer = null;
        try{
            writer= new FileWriter("c:\\TableCollection.txt");
        for (int i = 0; i < value.length; i++) {
            int n = value[i];
            int indexForCheck = n / 10;


            long timePopulateArrayList = effectiveArrayList.arrayListPopulate(n, arrayList);
            long timeAddArrayList = effectiveArrayList.arrayListAdd(arrayList);
            long timeeGetArrayList = effectiveArrayList.arrayListGet(arrayList);
            long timeRemoveArrayList = effectiveArrayList.arrayListRemove(arrayList);
            long timeContainsArrayList = effectiveArrayList.arrayListContaince(arrayList, indexForCheck);
            long timeIteratorAddArrayList = effectiveArrayList.arrayListIteratorAdd(arrayList, indexForCheck);
            long timeiteratorRemoveArrayList = effectiveArrayList.arrayListIteratorRemove(arrayList, indexForCheck);

            long timePopulateLinkedList = effectiveLinkedList.arrayListPopulate(n, linkedList);
            long timeAddLinkedList = effectiveLinkedList.arrayListAdd(linkedList);
            long timeeGetLinkedList = effectiveLinkedList.arrayListGet(linkedList);
            long timeRemoveLinkedList = effectiveLinkedList.arrayListRemove(linkedList);
            long timeContainsLinkedList = effectiveLinkedList.arrayListContaince(linkedList, indexForCheck);
            long timeIteratorAddLinkedList = effectiveLinkedList.arrayListIteratorAdd(linkedList, indexForCheck);
            long timeiteratorRemoveLinkedList = effectiveLinkedList.arrayListIteratorRemove(linkedList, indexForCheck);

            long timePopulateHashSet = effectiveHashSet.setPopulate(n, hashSet);
            long timeAddHashSet = effectiveHashSet.setAdd(hashSet);
            long timeRemoveHashSet = effectiveHashSet.setRemove(hashSet);
            long timeContainsHashSet = effectiveHashSet.setContaince(hashSet, indexForCheck);

            long timePopulateTreeSet = effectiveTreeSet.setPopulate(n, treeSet);
            long timeAddTreeSet = effectiveTreeSet.setAdd(treeSet);
            long timeRemoveTreeSet = effectiveTreeSet.setRemove(treeSet);
            long timeContainsTreeSet = effectiveTreeSet.setContaince(treeSet, indexForCheck);
            String line1= String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", " ", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove");
            String line2=String.format("%n","--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            String line3= String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "ArrayList", timeAddArrayList, timeeGetArrayList, timeRemoveArrayList, timeContainsArrayList, timePopulateArrayList, timeIteratorAddArrayList, timeiteratorRemoveArrayList);
            String line4= String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "LinkedList", timeAddLinkedList, timeeGetLinkedList, timeRemoveLinkedList, timeContainsLinkedList, timePopulateLinkedList, timeIteratorAddLinkedList, timeiteratorRemoveLinkedList);
            String line5= String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "HashSet", timeAddHashSet, "-", timeRemoveHashSet, timeContainsHashSet, timePopulateHashSet, "-", "-");
            String line6= String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "TreeSet", timeAddTreeSet, "-", timeRemoveTreeSet, timeContainsTreeSet, timePopulateTreeSet, "-", "-");
             writer.write(line1);
             writer.write(line2);
             writer.write(line3);
             writer.write(line4);
             writer.write(line5);
             writer.write(line6);

        }
        }
     finally {
            if(writer != null){
                writer.close();
            }
        }
    }
}
