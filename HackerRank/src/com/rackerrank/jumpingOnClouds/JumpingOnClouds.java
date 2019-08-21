package com.rackerrank.jumpingOnClouds;

public class JumpingOnClouds {
	public static void main(String[] args) {
		int c[] = new int[] { 0, 0, 0, 1, 0, 0};
		System.out.println(jumpingOnClouds(c));
	}
	
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		if(null != c) {
			for(int i = 0; i < c.length;) {
				if(i+2 < c.length && validateJump(c[i+2])) {
					jumps++;
					i = i+2;
				}else {
					if(i+1 < c.length && validateJump(c[i+1])) {
						jumps++;
						i++;
					}else {
						i++;
					}
				}
			}
		}
		return jumps;

    }

	private static boolean validateJump(int i) {
		boolean result = false;
		if(i == 0) {
			result = true;
		}
		return result;
		
	}

}
