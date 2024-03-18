package Bai7;

import java.util.ArrayList;
import java.util.List;

public class DeleteEvenNum
{
    // Xoa so chan trong danh sach
    public static void main(String[] args)
    {
        List <Integer> listIn = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            listIn.add((int)(Math.random()*100));
        }
        System.out.println(listIn);
//        List <Integer> divisibleTow

        List <Integer> listNew = new ArrayList<>();
        int num = listNew.size();
        for (int i = 0; i < listIn.size(); i++)
        {
            if (listIn.get(i)%2!=0){

                listNew.add(num,listIn.get(i));
            }
        }
        for (int i: listNew)
        {
            System.out.println(i);
        }


    }
}
