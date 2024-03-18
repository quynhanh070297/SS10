package Bai9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DelDuplicate
{
    public static void main(String[] args)
    {
        List <Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(3);
        listInteger.add(13);
        listInteger.add(1);
        listInteger.add(6);
        listInteger.add(6);
        listInteger.add(19);

        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (Integer i : listInteger) {
            if (set.contains(i)) {
                duplicates.add(i);
            } else {
                set.add(i);
            }
        }
        System.out.println(duplicates);
        System.out.println(set);
    }
}
