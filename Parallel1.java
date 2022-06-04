package org.parl;

import org.testng.annotations.Test;

public class Parallel1 {


	@Test
	public void Testcase1() {
		System.out.println("TC1:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase5() {
		System.out.println("TC5:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase3() {
		System.out.println("TC3:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase4() {
		System.out.println("TC4:"+Thread.currentThread().getId());
	}
}
