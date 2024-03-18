package Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        List <Integer> listSum = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            listSum.add((int)(Math.random()*100));

        }
        System.out.println(listSum);
        System.out.println("Moi ban nhap mot khoang so nguyen");
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = 0 ;
        for (int i = 0; i < listSum.size(); i++)
        {
            if (listSum.get(i)>=firstNum &&listSum.get(i)<=secondNum)
            {
                System.out.println(listSum.get(i));
                sum+= listSum.get(i);
            }
        }
        System.out.println(sum);

    }
}
