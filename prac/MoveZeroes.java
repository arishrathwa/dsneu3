package prac;

/*
 * Given an integer array nums,
 *  move all 0's to the end of it 
 *  while maintaining the relative order 
 *  of the non-zero elements.
 * */
import java.util.*;
public class MoveZeroes {

	
	private static int[] moveZeroes(int[] nums) {
		int n = nums.length;
		int ind = 0;
		
		for(int num:nums) {
			if(num!=0) nums[ind++] = num;
		}
		
		while(ind<n)nums[ind++] = 0;
		
		return nums;
		
	}

}
