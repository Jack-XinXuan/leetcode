package contest.wc311;

public class L6181 {
	public static void main(String[] args) {
		new L6181();
	}

	L6181() {

	}

	public int longestContinuousSubstring(String s) {
		char[] c = s.toCharArray();
		int max = 0;
		int curMax = 0;
		char cnt = (char) (c[0] - 'a');
		for (int i = 0; i < c.length; i++) {
			if (c[i] == cnt + 'a') {
				cnt++;
				curMax++;
				max = Math.max(curMax, max);
			} else {
				cnt = (char) (c[i] - 'a' + 1);
				curMax = 1;
			}
		}
		return max;
	}
}
