package GenericUtilities;

import java.util.Arrays;

public class DateSplitter {
	public static void dateSplit() {
		String date = "28-05-1980";
		String[] split = date.split("-");
		if (split[1].contains("0")) {
			split[1] = split[1].replaceFirst("^0+", "");
		}
		System.out.println(Arrays.toString(split));
	}

	public static void main(String[] args) {
		dateSplit();
	}
}
