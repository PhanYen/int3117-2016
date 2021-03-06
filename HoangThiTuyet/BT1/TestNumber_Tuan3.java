package Test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumbers {
// Bien lon nhat
	@Test
	public void test1() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,3,4,2,3,2147483647};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("2147483647 4", result);
	}
// ngoai bien max--> lỗi
	@Test
	public void test2() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,3,5,2,3,2147483648};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("2147483648 5", result);
	}
// biên min	
	@Test
	public void test3() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,-3,-4,-1,-4,-2147483648};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("1 -1", result);
	}
// day so chua cac so bang nhau
	@Test
	public void test4() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,1,1,1,1,1};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("1 1", result);
	}
// ngoài biên min
	@Test
	public void test5() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,-3,-4,-1,-4,-2147483649};
		String result= testnumbers.TwoMax(a,6);
		assertEquals("1 -1", result);
	}
}
