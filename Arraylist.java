/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    void intersect(ArrayList<Integer> list1,ArrayList<Integer> list2)
    {
        list1.retainAll(list2);
        System.out.println("Repeated elements are:"+list1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int s1,s2;
        int i=0;
        int a;
        int b;
        System.out.println("program to find repeated elements in an array:");
        System.out.println("Enter the size of list1:");
        ArrayList<Integer> list1=new ArrayList();
        Scanner obj=new Scanner(System.in);
        s1=obj.nextInt();
        for(i=0;i<s1;i++)
        {
            System.out.println("Enter the number:"+(i+1));
            a=obj.nextInt();
            list1.add(a);
            
        }
         
        System.out.println("The elements of list1 are :"+list1);
        System.out.println("Enter the size of list2:");
        ArrayList<Integer> list2=new ArrayList();
        s2=obj.nextInt();
         for(i=0;i<s2;i++)
        {
            System.out.println("Enter the number:"+(i+1));
            a=obj.nextInt();
            list2.add(a);
            
        }
         System.out.println("The elements of list2 are :"+list2);
         
         Arraylist obj2=new Arraylist();
         obj2.intersect(list1,list2);
         
}
}
