package learn.leetcode.practice;

public class PivotIndex {
	static int leftSum;
	static int rightSum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-1,0,1,1,0};
		System.out.println(findPivot(nums));

	}

	public static int findPivot(int[] nums) {
		for (int i = 0; i < nums.length; i++) {

			
				rightSum = 0;

				for (int k = i + 1; k < nums.length; k++) {
					
					rightSum += nums[k];

					leftSum = 0;
					for (int j = 0; j < i; j++)
						leftSum += nums[j];

				}

				if (leftSum == rightSum)
					return i;
			

		}
		return -1;
	}
}
