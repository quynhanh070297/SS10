package Bai15.Run;


import Bai15.Business.Cofig.InputMethods;
import Bai15.Business.Design.CRUDSTUDENTS;
import Bai15.Business.element.StudenElements;

public class StudentManagement
{
    public static CRUDSTUDENTS crudstudents = new StudenElements();


    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("***************MENU***************");
            System.out.println("1.Thêm mới hoc sinh");
            System.out.println("2.Hiển thị danh sách hoc sinh");
            System.out.println("3.Xoa hoc sinh theo ID");
            System.out.println("5.Tìm kiếm hoc sinh theo ten ID");
            System.out.println("6.Sắp xếp và hiển thị danh sách hoc sinh");
            System.out.println("7.Thoát");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    crudstudents.addStudent();
                    break;
                case 2:
                    crudstudents.showAll();
                    break;
                case 3:
                    crudstudents.removeStudent();
                    break;
                case 4:
                    crudstudents.findStudentById();
                    break;
                case 5:
                    crudstudents.sortByScore();
                    break;
                case 6:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("Nhap sai moi nhap lai");


            }
        }
    }
}
