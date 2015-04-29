package ArrayUtils;

public class ArrayUtilsTest {
	public static void main(String[] args) {	
		/*int[] intArray = { 10, 20, 30, 40, 50 };

		double[] doubleArray = ArrayUtils.intToDouble(intArray);
		int length = doubleArray.length;
		for (int i = 0; i < length; i++) {
			System.out.println(doubleArray[i]);
		}*/

	/*	double[] doubleArray = { 10.0, 20.0, 30.0, 40.0, 50.0 };

		int[] intArray = ArrayUtils.doubleToInt(doubleArray);
		int length2 = doubleArray.length;
		for (int i = 0; i < length2; i++) {
			System.out.println(intArray[i]);
		}*/

		
	
		int[] s1 = { 10, 20, 30, 40, 50 };
		int[] s2 = {60, 70, 80, 90};
		
		int[] newintArray = ArrayUtils.concat(s1,s2);
		int length = newintArray.length;
		for (int i = 0; i < length; i++) {
			System.out.println(newintArray[i]);
		}
	}

}
