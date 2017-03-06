package konstrukcjaSuper;

public class Apple extends Fruit {
	private String odmiana;

	public String getOdmiana() {
		return odmiana;
	}

	public void setOdmiana(String odmiana) {
		this.odmiana = odmiana;
	}

	public Apple(String odmiana) {
		super();
		setOdmiana(odmiana);

	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Apple "  + odmiana);

	}


 public static void main(String[] ars) {
	 
	 Apple apple = new Apple("Szampion");
	 apple.printInfo();
 }
}