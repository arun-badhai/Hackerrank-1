# Count all palindrome substrings in a string
# Dynamic Programming

static int palindrome(String s) { 
	int l = s.length();
	boolean[][] flag = new boolean[l][l];
	int[][] ans = new int[l][l];
	for(int i=0;i<l;i++){
		for(int j=0;j<l;j++){
			flag[i][j] = false;
		}
	}
	for(int i=0;i<l;i++){
		flag[i][i] = true;
	}
	for(int i=0;i<l-1;i++){
		if(s.charAt(i) == s.charAt(i+1)){
			flag[i][i+1] = true;
			ans[i][i+1] = 1;
		}
	}
	for(int i=2;i<l;i++){
		for(int j=0;j<l-i;j++){
			int k = i+j;
			if(s.charAt(j) == s.charAt(k) && flag[j+1][k-1] == true){
				flag[j][k] = true;
			}
			if(flag[j][k] == true){
				ans[j][k] = ans[j][k-1] + ans[j+1][k] - ans[j+1][k-1] + 1;
			}
			else{
				ans[j][k] = ans[j][k-1] + ans[j+1][k] - ans[j+1][k-1];
			}
		}
	}
	return ans[0][l-1];
}