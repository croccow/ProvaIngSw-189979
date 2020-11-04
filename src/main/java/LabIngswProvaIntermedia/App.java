package LabIngswProvaIntermedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.joda.time.DateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       MyListUtil ml = new MyListUtil();
       List <Integer> l = new ArrayList <Integer>() ;
      
       l.add(13);
       l.add(17);
       l.add(19);
       l.add(6);
       l.add(5);
       l.add(14);
       Scanner in = new Scanner(System.in);
       DateTime dt = new DateTime();
       System.out.println("Scegli come vuoi ordinare la lista: 0 per ordinarla in modo crescente 1 per ordinarla in modo decrescente");
       int scelta = in.nextInt();
       ml.scegliLista(l, scelta);
       System.out.println("Today is: " + dt.toString("yyyy-MM-dd") +". "+ ml.scegliLista(l, scelta));
       
    }
}
