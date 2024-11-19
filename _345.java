package leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class _345 {
	public String reverseVowels(String s) {
        
        List<Character> myList = new ArrayList<Character>();
        char[] c = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
			int current = s.charAt(i);
			if (current == 65 || current == 69 || current == 73 || current == 79 || current == 85 || current == 97 || current == 101 || current == 105 || current == 111 || current == 117) {
				myList.add(s.charAt(i));

			}
		}
        Collections.reverse(myList);
        Character[] ch = myList.toArray(new Character[0]);
        int k = 0;
        for (int i = 0; i < c.length; i++) {
			int current = c[i];
        	if (current == 65 || current == 69 || current == 73 || current == 79 || current == 85 || current == 97 || current == 101 || current == 105 || current == 111 || current == 117) {
        			if (k < ch.length) {
						c[i] = ch[k];
                        k++;
					}
			}
		}
        StringBuilder sb = new StringBuilder();
        for (Character character : c) {
			sb.append(character);
		}
        return sb.toString();
    }
}
