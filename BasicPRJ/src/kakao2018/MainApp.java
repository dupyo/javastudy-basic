package kakao2018;

public class MainApp {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] str = new String[n];

		// ³»°¡ Ç¬ ¹æ½Ä
		for (int i = 0; i < n; i++) {
			String res = "";
			str[i] = Integer.toBinaryString((arr1[i] | arr2[i]));
			for (char chr : str[i].toCharArray()) {
				res += (chr == '1') ? '#' : ' ';
			}
			str[i] = res;
			System.out.println(str[i]);
		}
		System.out.println("------");

		// »§±Á´Â °³¹ßÀÚ »§ÇüÀÌ Ç¬ ¹æ½Ä
		for (int i = 0; i < n; i++) {
			String res = "";
			int arr = arr1[i] | arr2[i];
			for (int j = 0; j < n; j++) {
				res = ((arr & (1 << j)) > 0 ? '#' : ' ') + res;
			}
			str[i] = res;
			System.out.println(str[i]);
		}
	}

}
