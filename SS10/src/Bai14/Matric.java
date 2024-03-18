package Bai14;

import java.util.ArrayList;

public class Matric
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        for(int i=0;i<10;i++) {
            ArrayList<Integer> intList = new ArrayList<>();
            for(int k=0;k<5;k++) {
                intList.add(k);
            }
            mainList.add(intList);
        }
        for(int row=0;row<mainList.size();row++) {
            for(int col=0;col<mainList.get(0).size();col++) {
                System.out.print(mainList.get(row).get(col)+",");
            }
            System.out.println("");
        }
    }
}
