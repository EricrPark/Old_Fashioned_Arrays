package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		// TODO Auto-generated method stub
		int[] testArray1 = new int[testArray.length + 1];
		for (int k = 0; k < testArray.length; k++) {
			if (k < i) {
				testArray1[k] = testArray[k];
			} else if (k >= i) {
				testArray1[k + 1] = testArray[k];
			}
		}
		testArray1[i] = j;
		return testArray1;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		String[] orderedArray1 = new String[orderedArray.length + 1];
		for (int i = 0; i < orderedArray.length; i++) {
			orderedArray1[i] = orderedArray[i];
		}
		orderedArray1[orderedArray.length] = string;
		Sorting.sort(orderedArray1);
		return orderedArray1;
	}
	
}
