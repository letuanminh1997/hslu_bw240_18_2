package de.hs_lu.o2s.ueb.ue2.cardgames;

import junit.framework.TestCase;

public class TestKartenstapel extends TestCase {
		
//	public void testStandardKonstruktor() {
//		Kartenstapel myStapel1 = new Kartenstapel();
//		assertTrue(myStapel1.empty());
//	}
//	
//	public void testKonstruktorCard() {
//		Kartenstapel myStapel1 = new Kartenstapel(new Spielkarte("herz", "as"));
//		assertFalse(myStapel1.empty());
//		assertEquals(1, myStapel1.getKartenAnzahl());
//	}
//	
//	public void testKonstruktorSpiel() {
//		Kartenstapel myStapel1 = new Kartenstapel(new Kartenspiel());
//		assertFalse(myStapel1.empty());
//		assertEquals(52, myStapel1.getKartenAnzahl());
//	}
//		
//	public void testAddKartenspiel(){
//		Kartenstapel myStapel1 = new Kartenstapel(new Kartenspiel());
//		myStapel1.addKartenspiel(new Kartenspiel());
//		assertEquals(104, myStapel1.getKartenAnzahl());		
//	}
//	
//	public void testAddKartenstapel(){
//		Kartenstapel myStapel1 = new Kartenstapel(new Kartenspiel());
//		myStapel1.addKartenspiel(new Kartenspiel());
//		assertEquals(104, myStapel1.getKartenAnzahl());
//		myStapel1.addKartenstapel(new Kartenstapel(new Kartenspiel()));
//		assertEquals(156, myStapel1.getKartenAnzahl());
//	}
//	
//	
//	public void testPush(){
//		Kartenstapel myStapel1 = new Kartenstapel();
//		assertTrue(myStapel1.empty());
//		Spielkarte myCard1 = new Spielkarte("herz", "as");
//		Spielkarte myCard2 = new Spielkarte("karo", "koenig");
//		myStapel1.push(myCard1);
//		assertEquals(1, myStapel1.getKartenAnzahl());
//		myStapel1.push(myCard2);
//		assertEquals(2, myStapel1.getKartenAnzahl());
//	}
//	
//	public void testTop(){
//		Kartenstapel myStapel1 = new Kartenstapel();
//		assertTrue(myStapel1.empty());
//		Spielkarte myCard1 = new Spielkarte("herz", "as");
//		Spielkarte myCard2 = new Spielkarte("karo", "koenig");
//		myStapel1.push(myCard1);
//		assertEquals(myCard1, myStapel1.top());
//		myStapel1.push(myCard2);
//		assertEquals(myCard2, myStapel1.top());
//	}
//	
//	public void testPop(){
//		Kartenstapel myStapel1 = new Kartenstapel();
//		assertTrue(myStapel1.empty());
//		Spielkarte myCard1 = new Spielkarte("herz", "as");
//		Spielkarte myCard2 = new Spielkarte("karo", "koenig");
//		myStapel1.push(myCard1);
//		myStapel1.push(myCard2);
//		assertEquals(2, myStapel1.getKartenAnzahl());
//		assertEquals(myCard2, myStapel1.pop());
//		assertEquals(1, myStapel1.getKartenAnzahl());
//		assertEquals(myCard1, myStapel1.pop());
//		assertEquals(0, myStapel1.getKartenAnzahl());
//	}
//	
//	public void testRandom() {
//		Kartenstapel myStapel1 = new Kartenstapel();
//		Spielkarte myCard1 = new Spielkarte("herz", "as");
//		Spielkarte myCard2 = new Spielkarte("karo", "koenig");
//		Spielkarte myCard3 = new Spielkarte("pik", "koenig");
//		myStapel1.push(myCard1);
//		myStapel1.push(myCard2);
//		myStapel1.push(myCard3);
//		Spielkarte randomCard = myStapel1.randomCard();
//		assertTrue(randomCard == myCard1 || randomCard == myCard2 || randomCard == myCard3);
//	}
//	
//	
//	public void testStapelmethoden(){
//		Kartenstapel myStapel1 = new Kartenstapel();
//		assertTrue(myStapel1.empty());
//		Spielkarte myCard1 = new Spielkarte("herz", "as");
//		Spielkarte myCard2 = new Spielkarte("karo", "koenig");
//		myStapel1.push(myCard1);
//		assertFalse(myStapel1.empty());
//		assertTrue(myStapel1.top() == myCard1);		
//		myStapel1.push(myCard2);
//		assertTrue(myStapel1.top() == myCard2);
//		assertTrue(myStapel1.pop() == myCard2);
//		assertFalse(myStapel1.empty());
//		assertTrue(myStapel1.pop() == myCard1);
//		assertTrue(myStapel1.empty());
//		myStapel1.push(myCard1);
//		myStapel1.push(myCard2);
//		assertTrue(myStapel1.last() == myCard1);
//	}
//	
//	public void testGetPunktwert(){
//		Kartenstapel myStapel1 = new Kartenstapel(new Kartenspiel());
//		assertEquals(296, myStapel1.getPunktwert());
//	}
//	
//	
//	public void testToString() {
//		Kartenstapel myStapel1 = new Kartenstapel();
//		assertTrue(myStapel1.empty());
//		Spielkarte myCard1 = new Spielkarte("herz", "as");
//		Spielkarte myCard2 = new Spielkarte("karo", "koenig");
//		myStapel1.push(myCard1);
//		myStapel1.push(myCard2);
//		System.out.println(myStapel1.toString());
//		String expectedStr = "Kartenstapel mit 2 Karten, Punktwert 15 und folgenden Karten:\n" + 
//							"herz as,\n" + 
//							"karo koenig";
//		assertEquals(expectedStr, myStapel1.toString());
//	}

}
