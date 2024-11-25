package leetcode_75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1657 {

	public boolean closeStrings(String word1, String word2) {
        Set<Character> s1 = new HashSet<Character>();
        Set<Character> s2 = new HashSet<Character>();
        
        for (Character character : word1.toCharArray()) {
			s1.add(character);
		}
        
        for (Character character : word2.toCharArray()) {
			s2.add(character);
		}
        
        if (!s1.equals(s2)) {
			return false;
		}
        
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        Map<Character, Integer> m2 = new HashMap<Character, Integer>();
        
        for (Character character : word1.toCharArray()) {
			m1.put(character, m1.getOrDefault(character, 0) + 1);
		}
        
        for (Character character : word2.toCharArray()) {
			m2.put(character, m2.getOrDefault(character, 0) + 1);
		}
        
        Map<Integer, Integer> freq1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> freq2 = new HashMap<Integer, Integer>();
        
        for (Map.Entry<Character, Integer> m : m1.entrySet()) {
			freq1.put(m.getValue(), freq1.getOrDefault(m.getValue(), 0) + 1);
		}
        
        for (Map.Entry<Character, Integer> m : m2.entrySet()) {
			freq2.put(m.getValue(), freq2.getOrDefault(m.getValue(), 0) + 1);
		}
        
        return freq1.equals(freq2);
    }

}
