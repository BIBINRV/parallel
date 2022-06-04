package org.parl;

import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void Testcase5() {
		System.out.println("TC5:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase6() {
		System.out.println("TC6:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase7() {
		System.out.println("TC7:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase8() {
		System.out.println("TC8:"+Thread.currentThread().getId());
	}
}
