/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personlist;
import java.util.Scanner;
/**
 *
 * @author offret
 */
public class PersonList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Person[] p=new Person[3];
        for(int i=0; i>p.length;i++)
        {
            System.out.println("insert person name: ");
            p[i].setP_name(input.nextLine());
            System.out.println("insert person address: ");
            p[i].setP_address(input.nextLine());
                        
        }
         for(int i=0; i>p.length;i++)
        {
            System.out.println("person name: "+p[i].getP_name());
            System.out.println("person address: "+ p[i].getP_address());
                        
        }
    }

}
