package learn.leetcode.practice;

public class DominantIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0};

		System.out.println(findDominantIdex(nums));
	}

	private static int findDominantIdex(int[] nums) {
		// TODO Auto-generated method stub
		int temp=0;
		if(nums.length>1) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j+1];
				}
				else if(nums[j]<nums[j+1]) {
					temp=nums[j];
				}
				if((nums[j]==0)) {
					return findMaxOfArray(nums);
				}
				else if(nums[j]==(2*temp)) {
				return j;	
				}
				
				
			}
		}
		}
		else {
			return 0;
		}
		return -1;
	}

	private static int findMaxOfArray(int[] nums) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=j;
				}
				else if(nums[j]<nums[j+1]) {
					temp=j+1;
				}
	}

		}
		return temp;
	}
}