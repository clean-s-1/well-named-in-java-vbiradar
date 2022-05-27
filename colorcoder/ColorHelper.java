package colorcoder;

public class ColorHelper {

	public static <E extends Enum<E> & Color> E getIndexByEnum(Class<E> type, int value) {
		for (E constant : type.getEnumConstants()) {
			if (value == constant.getIndex()) {
				return constant;
			}
		}
		return null;
	}

}
