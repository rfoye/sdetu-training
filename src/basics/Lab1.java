package basics;

public class Lab1 {

	public static void main(String[] args) {

		System.out.println(sumToN(6));
		System.out.println(fac(5));
		
		int[] labArray = new int[5];
		labArray[0] = 34;
		labArray[1] = 20;
		labArray[2] = 123;
		labArray[3] = 5;
		labArray[4] = 75;
		
		System.out.println(arrayMin(labArray));
		System.out.println(arrayMax(labArray));
		System.out.println(arrayAvg(labArray));
		
	}

	public static int sumToN(int n) {
		if (n<1) {
			return 0;
		}
		return (sumToN(n-1) + n);
	}
	
	public static int fac(int n) {
		if (n==0) {
			return 1;
		}
		else if (n==1) {
			return 1;
		}
		return (n * fac(n-1));
	}


	public static int arrayMin (int inArray[]) {
		int minValue = 0;
		for (int i = 0; i<inArray.length; i++) {
			if (i==0) {
				minValue = inArray[i];
			}
			else if (inArray[i] < minValue) {
				minValue = inArray[i];
			}
		}
		return minValue;
	}
	
	public static int arrayMax (int inArray[]) {
		int maxValue = 0;
		for (int i = 0; i<inArray.length; i++) {
			if (i==0) {
				maxValue = inArray[i];
			}
			else if (inArray[i] > maxValue) {
				maxValue = inArray[i];
			}
		}
		return maxValue;
	}
	
	public static double arrayAvg (int inArray[])  {
		int arrayLength = inArray.length;
		int arraySum = 0;
		for (int i = 0; i<inArray.length; i++) {
			arraySum += inArray[i];
		}
		return (double) arraySum / arrayLength;
	}
}
