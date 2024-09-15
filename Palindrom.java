package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectToMapExample {
	public static void main(String[] args) {
		String palindromWords = "madama";
		CollectToMapExample cm = new CollectToMapExample();
		cm.palindromMatchers(palindromWords);
	}

	public List<String> palindromMatchers(String input) {
		String[] data = input.split("");
		List<String> result = null;

		if (findPalindrom(input)) {
			return Arrays.asList(input);
		} else {
			int exist = data.length;
			int checkChar = data.length - exist;
			while (exist != 0) {
				for (int i = 0; i <= data.length; i++) {
					if (i + checkChar <= data.length) {
						if (findPalindrom(input.substring(i, checkChar + i))) {
							result.add(input);
						}

					}
				}
				
				exist--;
			}

		}

		return result;
	}

	public Boolean findPalindrom(String input) {
		String[] data = input.split("");
		System.out.println(input);

		Boolean palindrom = false;
		for (int v = 0; v <= data.length - 1; v++) {
			if (data[data.length - v - 1].equals(data[v])) {
				palindrom = true;
			} else {
				palindrom = false;
				break;
			}
		}

		System.out.println(palindrom);

		return palindrom;
	}
}
