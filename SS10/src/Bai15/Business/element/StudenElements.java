package Bai15.Business.element;

import Bai15.Business.Cofig.InputMethods;
import Bai15.Business.Design.CRUDSTUDENTS;
import Bai15.Business.entity.student;

import java.util.ArrayList;
import java.util.List;

public class StudenElements implements CRUDSTUDENTS
{
    private  static List<student> studenElements = new ArrayList<>();

    @Override
    public void showAll()
    {
//        for (StudenElements studenElement : studenElements)
//        {
//            studenElement.toString();
//        }
        studenElements.forEach(System.out::println);
    }

    @Override
    public void addStudent()
    {
        System.out.println("Nhap vao so luong hoc sinh can them");
        byte count = InputMethods.getByte();
        for (int i = 0; i < count; i++)
        {
            System.out.println("Nhap thong tin hoc sinh thu " + ( i + 1)+ " can them");
            student student= new student();
            student.inputData();
            studenElements.add(student);
        }
    }

    @Override
    public void removeStudent()
    {
        findStudentById();



    }

    @Override
    public student findStudentById(int id)
    {
//        for (int i = 0; i < studenElements.size(); i++)
//        { if (id ==studenElements.get(i).getStudentId())
//        {
//            return studenElements.get(i);
//        }
//        }
       studenElements.stream().filter(student-> id ==student.getStudentId());
                //return null;



    }

    @Override
    public void getAverageScore()
    {

    }

    @Override
    public void sortByScore()
    {

    }


}
