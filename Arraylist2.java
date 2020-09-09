/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.lang.*;
class employee
{
    String name;
    double salary;
    public employee(String name,double salary)
            {
                this.name=name;
                this.salary=salary;
             }
    @Override
    public String toString()
    {
        return name+""+salary+ "";
    }
 
}
class Sortbyname implements  Comparator<employee>
{
    public int compare(employee a,employee b)
    {
        return a.name.compareTo(b.name);
    }
}
public class Arraylist2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <employee>  emp=new ArrayList <employee>();
        int i=3;
        String s;
        double sa;
        Scanner obj=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            System.out.println("Enter name of employee"+(i+1));
             System.out.println("Enter salary of employee"+(i+1));
            s=obj.next();
            sa=obj.nextDouble();
            emp.add(new employee(s,sa));
        }
         System.out.println("Unsorted!");
        System.out.println(emp);
        Collections.sort(emp, new Sortbyname());
        System.out.println("Employee's name in sorted format");
        System.out.println(emp);
    }
    
}
