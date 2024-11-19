package leetcode_75;

public class _1456 {
	public int maxVowels(String s, int k) {
        int cnt = 0;
        if (s.length() < k) {
			throw new IllegalArgumentException("invalid");
		}
        for (int i = 0; i < k; i++) {
			char c = s.charAt(i);
			if (checkVowel(c) == true) {
				cnt++;
			}
		}
        
        int window_cnt = cnt;
        
        for (int i = k; i < s.length(); i++) {
        	char currentChar = s.charAt(i);
            if (checkVowel(s.charAt(i - k)) == true) {
					window_cnt--;
				}
			if (checkVowel(currentChar) == true) {
				
				window_cnt++;
			}
			cnt = Math.max(cnt, window_cnt);
		}
        
        return cnt;
    }
	
	private boolean checkVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
    }
}
