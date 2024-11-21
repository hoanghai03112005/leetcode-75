package leetcode_75;

public class _1732 {
	public int largestAltitude(int[] gain) {
		int[] altitude = new int[gain.length + 1];
		altitude[0] = 0;

		for (int i = 0; i < gain.length; i++) {
			altitude[i + 1] = altitude[i] + gain[i];
		}
		int max = 0;
		for (int i : altitude) {
			max = Math.max(max, i);
		}
		return max;

	}
}
