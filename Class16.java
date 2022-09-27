class CSphere {
	private int x, y, z, radius;
	String name;
	void setLocation(int x1,int y1,int z1) {
		x = x1;
		y = y1;
		z = z1;
	}
	void setRadius(int r) {
		radius = r;
		
	}
	double surfaceArea() {
		return 4 * 3.14 * radius * radius;
	}
	double volume() {
		return 4 / 3 * 3.14 * radius * radius * radius;
	}
	void showCenter() {
		System.out.print(x + ", " + y + ", " + z);
	}
}
public class Class16 {
	public static void main(String[] args) {
		CSphere a = new CSphere();
		a.setLocation(3, 4, 5);
		a.setRadius(1);
	}
}