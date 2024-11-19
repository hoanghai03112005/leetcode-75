package leetcode_75;

public class _392 {
	public boolean isSubsequence(String s, String t) {
		int index = 0;
		for (int i = 0; i < t.length(); i++) {
			if(index < s.length()) {
				if (t.charAt(i) == s.charAt(index)) {
					index++;
				}
			}
		}
		if (index != s.length()) {
			return false;
		}
        return true;
    }
}
