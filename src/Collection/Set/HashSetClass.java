package Collection.Set;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


//HashSet not order
public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Blue");
        hashSet.add("Grean");
        hashSet.add("Red");
        hashSet.add("red");
        System.out.println(hashSet);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        Arrays.asList(new Integer[]{1, 2, 3});

        List<Integer> list = Arrays.asList(new Integer[]{1, 4, 3, 7, 8});
        List<Integer> list1 = Arrays.asList(new Integer[]{1, 2, 3, 5, 6});
        System.out.println("list: " + list);
        arrayList.addAll(list);
        System.out.println(arrayList);

        Integer[] integers = {4, 5, 6};
        Integer[] integers1 = new Integer[]{7, 8, 9};

        arrayList.addAll(List.of(integers));
        System.out.println(arrayList);

        arrayList.addAll(List.of(integers1));
        System.out.println(arrayList);

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.addAll(list1);
        hashSet1.removeAll(list);
        System.out.println("hashSet1: " + hashSet1);


        HashSet<Integer> intersection = new HashSet<>();
        intersection.addAll(list1);
        intersection.retainAll(list);
        System.out.println("intersection: " + intersection);


    }

}
