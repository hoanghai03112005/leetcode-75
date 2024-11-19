package leetcode_75;

public class _1768 {
	public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < w1.length && j < w2.length) {
			sb.append(w1[i]);
			i++;
			sb.append(w2[j]);
			j++;
		}
        if (i < w1.length) {
			while(i < w1.length) {
				sb.append(w1[i]);
				i++;
			}
		} else if (j < w2.length) {
			while(j < w2.length) {
				sb.append(w2[j]);
				j++;
			}
			
		}
        
        return sb.toString();
    }
}
