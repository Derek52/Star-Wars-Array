public class Demo {
	public static void main(String[] args) {
		StarWarsArray starWarsArray = new StarWarsArray(10, 2);
		starWarsArray.printValues();
		starWarsArray.addElement(4, 1);
		starWarsArray.addElement(5, 2);
		starWarsArray.addElement(6, 3);
		starWarsArray.addElement(1, 4);
		starWarsArray.addElement(2, 5);
		starWarsArray.addElement(3, 6);
		starWarsArray.addElement(7, 7);
		starWarsArray.addElement(8, 8);
		starWarsArray.addElement(9, 9);
		starWarsArray.addElement(10, 1267);
		starWarsArray.printValues();
	}
}
