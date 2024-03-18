package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DaoNguocList
{
    public static void main(String[] args)
    {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            listNumber.add((int)(Math.random()*100));
        }
        for (Integer i : listNumber)
        {
            System.out.println(i + "");
        }
        System.out.println("Gia tri lon nhat trong mang la" + Collections.max(listNumber));
        System.out.println(listNumber);
        List<Integer> reveserList = new ArrayList<>();
        for (int i = listNumber.size()-1; i>=0; i--)
        {
            reveserList.add(listNumber.get(i));
        }
        System.out.println(reveserList);
        // List da dao nguoc

        // Sort
        Collections.sort(listNumber, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o2-o1;
            }
        });
        Collections.sort(listNumber);// SS tawng dan
        Collections.reverse(listNumber); // Dao nguoc
    }
}
