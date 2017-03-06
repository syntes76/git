package typyGeneryczne;

public class TestPair {
	
	public static void main(String[] args) {
		
		Pair<Integer, String> pair1 = new Pair<Integer, String>(0,"Para1");
		Pair<String, String> pair2 = new Pair<String, String>("String","Para2");
		Pair<Double, String> pair3 = new Pair<Double, String>(0.1,"Para3");
		
		pair1.printPair(pair1);
		pair2.printPair(pair2);
		pair3.printPair(pair3);
		
		
	}

}
