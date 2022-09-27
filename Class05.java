class CBox {
	int length, width, height;
	int volume() {
		return length * width * height;
	}
	int surfaceArea() {
		return (length * width  + width * height + length * height) * 2;
	}
	void showData() {
		System.out.println(length + " " +  width + " " + height);
	}
	void showAll() {
		System.out.println(length + " " + width + " " + height + " " + surfaceArea() + " " + volume());
	}
}
public class Class05 {
	public static void main(String[] args) {
		CBox box = new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showData();
		box.showAll();
	}
}