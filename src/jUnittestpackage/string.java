package jUnittestpackage;
import static org.junit.Assert.*;
//DeepanshuGarg_E21CSEU0272
import org.junit.Test;


import static org.junit.Assert.*;

import org.junit.Test;

public class string {

	@Test
	public void test1() {
		jUnittesting obj = new jUnittesting();
	        String first = "deepanshu";
	        String second = "garg";
	        assertEquals("deepanshugarg",obj.add_str(first,second));
	        
	}
	@Test
	public void test2() {
		jUnittesting obj = new jUnittesting();
	        String first = "hello";
	        String second = "world";
	       
	        assertEquals("byeworld",obj.add_str(first,second));
	}

}
