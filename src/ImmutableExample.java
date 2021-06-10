class Demo {
	private int x, y;
	public Demo(int a, int b) {
		x=a; y=b;
	}
	public void show() {
		System.out.println("X : "+x+" , Y : "+y);
	}
}



public class ImmutableExample {

	public static void main(String[] args) {
		Demo d=new Demo(10,20);
		d.show();
	}

}
