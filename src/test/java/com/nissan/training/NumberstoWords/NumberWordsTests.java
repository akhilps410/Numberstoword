package com.nissan.training.NumberstoWords;

import org.junit.*;



public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void numberinbtw1to20() {
		Assert.assertEquals("Five", numberWords.toWords(5) ) ;
	}
	@Test
	public void numberinbtw21to100() {
		Assert.assertEquals("Fifty Four", numberWords.toWords(54) ) ;
	}
	@Test
	public void numberinbtw101to1000() {
		Assert.assertEquals("Eight Hundred Fifty Four", numberWords.toWords(854) ) ;
	}
	@Test
	public void numberinbtw1001to100000() {
		Assert.assertEquals("Thirty Five Thousand Eight Hundred Fifty Four", numberWords.toWords(35854) ) ;
	}
	@Test
	public void numberinbtw100001to10000000() {
		Assert.assertEquals("Thirty Five Lakh Thirty Five Thousand Eight Hundred Fifty Four", numberWords.toWords(3535854) ) ;
	}
	
}

