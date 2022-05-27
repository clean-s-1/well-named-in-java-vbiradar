package colorcoder;

public class Main {

	public static void main(String[] args) {
		testNumberToPair(1, MajorColor.WHITE, MinorColor.BLUE);
		testNumberToPair(2, MajorColor.WHITE, MinorColor.ORANGE);

		testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
	}

	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = new ColorPair(expectedMajor, expectedMinor);
		colorPair = colorPair.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		ColorPair colorPair = new ColorPair(major, minor);
		int pairNumber = colorPair.getPairNumberFromColor();
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

}
