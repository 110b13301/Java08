class CTest {
	int n;
	void test() {
		if (n == 0) {
			System.out.println("此數為0");
		}
		else if (n % 2 == 0) {
			System.out.println("此數為偶數");
		}
		else {
			System.out.println("此數為奇數");
		}
	}
}
public class Class07 {
	public static void main(String[] args) {
		CTest a = new CTest();
		a.n = 3;
		a.test();
		a.n = 8;
		a.test();
		a.n = 0;
		a.test();
	}
}