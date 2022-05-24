package colorcoder;

public class Main {

	public static void main(String[] args) {
		testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
	}

	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = new ColorPair(expectedMajor, expectedMinor);
		colorPair = colorPair.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.ToString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		ColorPair colorPair = new ColorPair(major, minor);
		int pairNumber = colorPair.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

}
