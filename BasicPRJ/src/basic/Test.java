package basic;

public class Test {
	public void sayNick(String nick) {
		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			}
			System.out.println("����� ������ " + nick + "�Դϴ�.");
		} catch (FoolException e) {
			System.err.println("FoolException�� �߻��߽��ϴ�.");
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.sayNick("fool");
		test.sayNick("robot");
	}

}
