package jUnittestpackage;

import static org.junit.Assert.*;

import org.junit.Test;
//DeepanshuGarg_E21CSEU0272
public class integer {

	@Test
	public void test1() {
		jUnittesting obj = new jUnittesting();
	        int a = 69;
	        int b = 31;
	        assertEquals(100,obj.add_num(a,b));

}
	@Test
	public void test2() {
		jUnittesting obj = new jUnittesting();
	        int a = 31;
	        int b = 99;
	        assertEquals(69,obj.add_num(a, b));

}
}
