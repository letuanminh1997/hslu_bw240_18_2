package de.hs_lu.o2s.v1.repetition;

public class Repetition1 {
	
	public static int scalarProduct(int[] vector1, int[] vector2) {
		int retVal = 0;
		
		if (vector1.length!=vector2.length) {
			throw new RuntimeException("Die Vektoren sind nicht gleich lang!");
		}
		
		for (int i=0; i<vector1.length; i++) {
			retVal += vector1[i] * vector2[i];
		}
		
		return retVal;
	}

	public static void main(String[] args) {
		
		int counter = 0;
		String concat = "";
		
		int[] simpleNumberA = {0, 2, 4, 6, 8, 10};
		int[] numberA = new int[6];
		
		if (counter==0) {
			System.out.println("Counter ist gleich null");
		}
		else {
			System.out.println("Counter ist ungleich null");
		}
		
		if ((counter==0) || (simpleNumberA[1]==2) && concat=="") {
			System.out.println("Fall 1");
		}
		else if (counter == 0) {
			System.out.println("Fall 2");
		}
		else {
			System.out.println("Fall 3");
		}
		
		System.out.println("Länge von simpleNumberA" + simpleNumberA.length);
		
		if (simpleNumberA.length == numberA.length) {
			System.arraycopy(simpleNumberA, 0, numberA, 0, simpleNumberA.length);
		}
		
		
		boolean allEqual = true;
		
		for(int i=0; i<numberA.length; i++) {
			System.out.println(numberA[i]);
			if(numberA[i]!=simpleNumberA[i]) allEqual = false;
		}
		
		if(allEqual) System.out.println("Alle Elemente von numberA und simpleNumberA sind identisch");
		
		int[] thirdNumberA = new int[simpleNumberA.length];
		
		for(int i=0; i<simpleNumberA.length;i++) {
			thirdNumberA[i] = simpleNumberA[i] * 2;
			System.out.println(thirdNumberA[i]);
		}
		
		
		int[][] vectorAA = new int[4][2];
		
		int currentX = 0;
		int currentY = 3;
		for(int i=0;i<4;i++) {
			vectorAA[i][0] = currentX;
			vectorAA[i][1] = currentY;
			currentX += 1;
			currentY -= 1;
		}
		
		String vectorString = "";
		for(int i=0;i<vectorAA.length; i++) {
			vectorString += "Vektor " + (i + 1) + ": (";
			for(int j=0;j<vectorAA[i].length; j++) {
				vectorString += vectorAA[i][j];
				if (j == vectorAA[i].length-1) vectorString += ")";
				else vectorString += ",";
			}
			vectorString += "\n";
		}
		
		System.out.println(vectorString);
		
		
		System.out.println(scalarProduct(vectorAA[0], vectorAA[1]));
		
		int[][] bsp1AA = {{1,2,3},{3,2,1}};
		System.out.println(scalarProduct(bsp1AA[0], bsp1AA[1]));
		
		int[] v1A = {1,2,3,4};
		int[] v2A = {1,2,3,4,5};
		System.out.println(scalarProduct(v1A, v2A));
		
	}

}
