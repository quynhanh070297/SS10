package Bai15.Business.entity;

import Bai15.Business.Cofig.InputMethods;

public class student
{
    private int studentId ;
    private String name;
    private double averageScore;

    public student()
    {
    }

    public student(int studentId, String name, double averageScore)
    {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getAverageScore()
    {
        return averageScore;
    }

    public void setAverageScore(double averageScore)
    {
        this.averageScore = averageScore;
    }

    @Override
    public String toString()
    {
        return "student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
    public void inputData()
    {
        studentId = (int) ((Math.random()*9999)*Math.random());
        System.out.println("Moi ban nhap ten");
        name = InputMethods.getString();
        System.out.println("Moi ban nhap Diem trung binh");
        averageScore = InputMethods.getDouble();
    }
}
