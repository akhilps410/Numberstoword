package com.nissan.training.NumberstoWords;

import static org.junit.Assert.*;

import org.junit.Test;




public class TestNumberWords {
	private NumberWords numberWords ;
	
	

	@Test
	public void testnumberOutOfRangeReturnsError() {
		assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void testnumberinbtw1to20() {
		assertEquals("Five", numberWords.toWords(5) ) ;
	}
	@Test
	public void testnumberinbtw21to100() {
		assertEquals("Fifty Four", numberWords.toWords(54) ) ;
	}
	@Test
	public void testnumberinbtw101to1000() {
		assertEquals("Eight Hundred Fifty Four", numberWords.toWords(854) ) ;
	}
	@Test
	public void testnumberinbtw1001to100000() {
		assertEquals("Thirty Five Thousand Eight Hundred Fifty Four", numberWords.toWords(35854) ) ;
	}
	@Test
	public void testnumberinbtw100001to10000000() {
		assertEquals("Thirty Five Lakh Thirty Five Thousand Eight Hundred Fifty Four", numberWords.toWords(3535854) ) ;
	}
	
}

