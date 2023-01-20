//Write a program to check how many Shape objects created

public class ShapeObject {
	private static int count;

	public ShapeObject() {
		count++;
	}

	public static void main(String[] args) {
		ShapeObject square = new ShapeObject();
		ShapeObject pentagon = new ShapeObject();
		ShapeObject diamond = new ShapeObject();
		ShapeObject rectangle = new ShapeObject();
		ShapeObject triangle = new ShapeObject();
		ShapeObject circle = new ShapeObject();
		System.out.print("Number of Objects created: " + ShapeObject.count);
	}
}