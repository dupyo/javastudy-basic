package basic;

public class BitOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int[] e = { 5, 7, 7 };
		int bit = 15;
		System.out.println(a | b);
		for (int num : e) {
			bit &= num;
		}
		System.out.println(bit+", "+Integer.toBinaryString(bit));
	}

}
