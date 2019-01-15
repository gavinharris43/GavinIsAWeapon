

import org.junit.Test;
import static org.junit.Assert.*;



public class AppTest 
{
	ReverseString rString;
 @Test
 public void test1() {
	rString = new ReverseString();
	String test1Restlt= rString.reverseString("hello");
	 
	 assertEquals("olleh",test1Restlt);
 }
}
