package basic;

public class Test {
	public void sayName(String name) throws FoolException {
		if("fool".equals(name)) {
			throw new FoolException();
		}
		System.out.println("당신의 이름은 " + name + "입니다.");
	}
	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.sayName("robot");
			test.sayName("fool");
		} catch (FoolException e) {
			System.err.println("FoolException이 발생했습니다.");
		}
	}

}
