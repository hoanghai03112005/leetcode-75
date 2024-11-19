package leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class _151 {
	public static String reverseWords(String s) {
        String[] words = s.split(" ");
        List<String> myList = new ArrayList<String>();
        
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
			if (words[i].equals("")) {
				continue;
			} 
			myList.add(words[i]);
		}
        int k = 0;
        for (String string : myList) {
        	if (k == myList.size() - 1) {
        		sb.append(string);
			} else {
				sb.append(string).append(" ");
			}
			
			k++;
		}
        return sb.toString();
    }
}
