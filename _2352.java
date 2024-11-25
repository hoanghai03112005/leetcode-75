package leetcode_75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2352 {

	public int equalPairs(int[][] grid) {
        Map<Integer, List<Integer>> row = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> column = new HashMap<Integer, List<Integer>>();
		
		for (int i = 0; i < grid.length; i++) {
			List<Integer> myList = new ArrayList<Integer>();
			
			for (int j = 0; j < grid.length; j++) {
				myList.add(grid[i][j]);
			}
			row.put(i, myList);
		}
		
		for (int i = 0; i < grid.length; i++) {
			List<Integer> myList = new ArrayList<Integer>();
			
			for (int j = 0; j < grid.length; j++) {
				myList.add(grid[j][i]);
			}
			column.put(i, myList);
		}
		
		int cnt = 0;
		
		for (Integer key : row.keySet()) { 
		    for (Integer key2 : column.keySet()) {
				if (row.get(key).equals(column.get(key2))) {
					cnt++;
				}
			}
		}

		return cnt;
    }

}
