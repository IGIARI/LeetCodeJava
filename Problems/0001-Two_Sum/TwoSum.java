package problems;

import java.util.Arrays;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		// Copy the array
		int n = nums.length;
		int[] copied = new int[n];
		for (int i = 0; i < n; i++) {
			copied[i] = nums[i];
		}
		Arrays.sort(copied);
		int[] result = new int[2];
		for (int i = 0, j = n - 1; i < j;) {
			if (copied[i] + copied[j] == target) {
				result[0] = getIndex(nums, copied[i]);
				result[1] = getIndexBackward(nums, copied[j]);
				break;
			} else if (copied[i] + copied[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return result;
	}

	private int getIndex(int[] nums, int n) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == n) {
				return i;
			}
		}
		return -1;
	}

	private int getIndexBackward(int[] nums, int n) {
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == n) {
				return i;
			}
		}
		return -1;
	}
}
