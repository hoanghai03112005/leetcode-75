package leetcode_75;

public class _394 {
	
	private int stringtoInt(String s) { // chuyen 1 chuoi so nguyen thanh int
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			ans *= 10;
			ans += s.charAt(i) - '0';
		}
		return ans;
	}
	
	
	public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int prev = 0;
        int depth = 0;
        int repetitions = 0;
        
        for (int i = 0; i < s.length(); i++) {
			if (depth == 0 && 'a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				sb.append(s.charAt(i));
				prev = i + 1;
			}
			
			if (s.charAt(i) == '[') {
				depth++;
				if (depth == 1) {
					repetitions = stringtoInt(s.substring(prev, i));
					prev = i + 1;
				}
			} else if (s.charAt(i) == ']') {
				depth--;
				if (depth == 0) {
					while (repetitions > 0) {
						sb.append(decodeString(s.substring(prev, i)));
						repetitions--;
					}
					prev = i + 1;
				}
			}
		}
        
        return sb.toString();
    }

}
