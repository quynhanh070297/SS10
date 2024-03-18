package Bai8;

import java.util.ArrayList;
import java.util.List;

public class AddAll
{
    //Sao chep phan tu cua mot mang sang mot mang khac

    public static void main(String[] args)
    {
        List<Integer> listNumber1 = new ArrayList<>();

        listNumber1.add(1);
        listNumber1.add(1);
        listNumber1.add(1);

        List<Integer> list2 = new ArrayList<>();

        listNumber1.add(2);
        listNumber1.add(2);
        listNumber1.add(2);
        listNumber1.addAll(list2);
        System.out.println(listNumber1);
    }

}
