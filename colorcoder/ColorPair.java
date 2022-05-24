package colorcoder;

public class ColorPair {

	final static String MajorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };

	final static String MinorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	final static int numberOfMajorColors = MajorColorNames.length;

	final static int numberOfMinorColors = MinorColorNames.length;

	private MajorColor majorColor;
	private MinorColor minorColor;

	public ColorPair(MajorColor major, MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}

	String ToString() {
		String colorPairStr = MajorColorNames[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += MinorColorNames[minorColor.getIndex()];
		return colorPairStr;
	}

	public ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	public int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}

}
