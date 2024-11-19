package leetcode_75;

public class _605 {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int cnt = 0;
		
		for (int i = 0; i < flowerbed.length; i++) {
			if (i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0) {
				cnt++;
				flowerbed[i] = 1;
			} else if (i == 0 && flowerbed.length >= 2 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
				cnt++;
				flowerbed[i] = 1;
			} else if (i == flowerbed.length - 1 && flowerbed.length >= 2 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
				cnt++;
				flowerbed[i] = 1;
			} else if (flowerbed.length == 1) {
				if (flowerbed[i] == 0) {
					cnt++;
					flowerbed[i] = 1;
				} 
			}
		}
		if (cnt >= n) {
			return true;
		}
		return false;
    }
}
