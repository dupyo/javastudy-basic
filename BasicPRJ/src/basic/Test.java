package basic;

public class Test {
	public void sayName(String name) throws FoolException {
		if("fool".equals(name)) {
			throw new FoolException();
		}
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
	}
	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.sayName("robot");
			test.sayName("fool");
		} catch (FoolException e) {
			System.err.println("FoolException�� �߻��߽��ϴ�.");
		}
	}

}
