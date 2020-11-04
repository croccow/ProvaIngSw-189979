package LabIngswProvaIntermedia;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest 
{
    private static MyListUtil ml;
    
    @BeforeClass
    public static void initialize() {
    	ml = new MyListUtil();
    }
	
	@Test
    public void MyListUtilTest()
    {
		List<Integer> l = new ArrayList<Integer>();
		
        assertEquals("La lista è vuota",ml.scegliLista(l,0));
 
        
    }
	@Test
	public void MyListUtilTest2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
        l.add(3);
        l.add(7);
        l.add(14);
        l.add(32);
        l.add(2);
        assertEquals("La lista è stata ordinata in modo crescente ",ml.scegliLista(l, 0));
        assertEquals("La lista è stata ordinata in modo decrescente ",ml.scegliLista(l, 1));
	}
}
