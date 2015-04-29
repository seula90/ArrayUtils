package ArrayUtils;

public class ArrayUtils {

	// int 배열을 double 배열로 변환

	public static double[] intToDouble(int[] src) {
		int length = src.length;

		double[] doubleArray = new double[length];

		for (int i = 0; i < length; i++) {
			doubleArray[i] = src[i];
		}

		return doubleArray;
	}

	// double 배열을 int 배열로 변환
	public static int[] doubleToInt(double[] source) {
		int length2 = source.length;
		int[] intArray = new int[length2];

		for (int j = 0; j < length2; j++) {
			intArray[j] = (int) source[j];
		}

		return intArray;
	}

	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int[] concat(int[] s1, int[] s2) {
		
		int length3 = s1.length+s2.length;
		int[] newintArray = new int[length3];
		for (int k = 0; k < s1.length; k++) {
			newintArray[k] = s1[k];
		}
		for (int s = s1.length; s < length3; s++){
			newintArray[s] = s2[s-s1.length];
		}
		return newintArray;
	}
}
