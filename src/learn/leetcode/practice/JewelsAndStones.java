package learn.leetcode.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.datastructures.practice.PracticeInterface;

public class JewelsAndStones implements PracticeInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// J==aA
		// S=aaAAAbb
		
	PracticeInterface.methodThree();
	}

	private int usingHashSet(String J, String S) {
		// TODO Auto-generated method stub
		int count=0;
		Set<Character> set=new HashSet<>();
		for(int i=0;i<J.length();i++) {
			set.add(J.charAt(i));
		}
		
		for(int i=0;i<S.length();i++) {
			if(set.contains(S.charAt(i))) {
				count++;
			}
		}
		return count;

	}

	private int usingMap(String J, String S) {

		int count = 0;

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < S.length(); i++) {

			if (map.containsKey(S.charAt(i))) {
				map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
			} else
				map.put(S.charAt(i), 1);
		}

		for (int i = 0; i < J.length(); i++) {

			if (map.containsKey(J.charAt(i))) {
				count += map.get(J.charAt(i));
			}
		}
		return count;
	}

	public int numJewelsInStones(String J, String S) {
		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			char character = S.charAt(i);

			for (int j = 0; j < S.length(); j++) {
				if (J.charAt(j) == character) {
					count++;
				}
			}
		}
		return count;

	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		
	}

	
	

}
