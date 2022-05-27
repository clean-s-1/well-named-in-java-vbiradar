package colorcoder;

public class ColorPair {

	final static String majorColorNames[] = { "White", "Red", "Black", "Yellow", "Violet" };

	final static String minorColorNames[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	final static int numberOfMajorColors = majorColorNames.length;

	final static int numberOfMinorColors = minorColorNames.length;

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

	public String toString() {
		String colorPairStr = majorColorNames[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += minorColorNames[minorColor.getIndex()];
		return colorPairStr;
	}
	
	public ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = ColorHelper.getIndexByEnum(MajorColor.class, zeroBasedPairNumber / numberOfMinorColors);
		MinorColor minorColor = ColorHelper.getIndexByEnum(MinorColor.class, zeroBasedPairNumber % numberOfMinorColors);;
		//MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
		//MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	public int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}

}
