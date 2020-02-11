public class StarWarsArray {

	private int[] innerArray;
	private int length;

	public StarWarsArray(int size) {
		innerArray = new int[size];
		length = size;
	}

	public StarWarsArray(int size, int initialValue) {
		innerArray = new int[size];
		length = size;
		for (int i = 0; i < size; i++) {
			innerArray[i] = initialValue;
		}
	}

	public void addElement(int index, int value) {
		int innerIndex = convertIndex(index);
		innerArray[innerIndex] = value;
	}

	public int getElement(int index) {
		return innerArray[convertIndex(index)];
	}

	public void printValues() {
		for (int i = 4; i <= 6; i++) {
			System.out.println(getElement(i));
		}
		for (int i = 1; i <= 3; i++) {
			System.out.println(getElement(i));
		}
		for (int i = 7; i <= length; i++) {
			System.out.println(getElement(i));
		}
		System.out.println();
	}

	public int getSize() {
		return length;
	}

	private int convertIndex(int index) {
		if (index >= 4 && index <= 6) {
			return index - 4;
		} else if (index >= 1 && index <= 3) {
			return index + 2;
		} else if (index >= 7 && index <= length) {
			return index - 1;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
