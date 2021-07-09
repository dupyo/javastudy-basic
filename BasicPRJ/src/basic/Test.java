package basic;

public class Test {
	public void sayNick(String nick) {
		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			}
			System.out.println("당신의 별명은 " + nick + "입니다.");
		} catch (FoolException e) {
			System.err.println("FoolException이 발생했습니다.");
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.sayNick("fool");
		test.sayNick("robot");
	}

}
