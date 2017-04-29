# Count of all palindrome substrings in a string 
# Brute force solution

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(palindrome("aabaa"));
	}
	
	// Count the palindrome substrings
    static int palindrome(String s) { 
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        String stemp = s.toLowerCase();
        Set<String> set = new HashSet<>();
        Set<String> setNot = new HashSet<>();
        for(int i=0;i<stemp.length();i++){
            for(int j=i;j<stemp.length();j++){
                String sub = stemp.substring(i,j+1);
                //Avoiding repetition
                if(!setNot.contains(sub)){
                    if(!set.contains(sub)){
                        boolean val = isPalindrome(sub);
                        if(val == true){
                            set.add(sub);
                        }
                    else{
                        setNot.add(sub);
                        }
                    }
                }
            }
        }
        return set.size();
    }

	// Function to check substring is a palindrome
    static boolean isPalindrome(String s1){
        int l = s1.length();
        if(l == 1){
            return true;
        }
        int i=0;
        int j=l-1;
        while(i<j){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
