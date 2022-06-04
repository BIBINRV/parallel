package org.parl;

import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void Testcase9() {
		System.out.println("TC9:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase10() {
		System.out.println("TC10:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase11() {
		System.out.println("TC11:"+Thread.currentThread().getId());
	}
	@Test
	public void Testcase12() {
		System.out.println("TC12:"+Thread.currentThread().getId());
	}
}
