package leetcode_75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _443 {
	public static int compress(char[] chars) {
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		List<Character> myList = new ArrayList<Character>();
		int cnt = 0;
		for (int i = 0; i < chars.length; i++) {
			if (i > 0) {
				
				if (chars[i] == chars[i-1]) {
					cnt++;
				} else {
					if (cnt > 1) {
						String num = Integer.toString(cnt);
						for (Character character : num.toCharArray()) {
							myList.add(character);
						}
					}
					cnt = 1;
					myList.add(chars[i]);
				}
				
			} else {
				myList.add(chars[i]);
				cnt++;
			}
		}
		if(cnt > 1) {
            String num = Integer.toString(cnt);
				for (Character character : num.toCharArray()) {
					myList.add(character);
				}
        }
		for (int i = 0; i < myList.size(); i++) {
			chars[i] = myList.get(i);
		}
        return myList.size();
    }
}
