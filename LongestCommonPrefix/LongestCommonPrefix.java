

class LongestCommonPrefix
{
	public static String prefix(String[] strs)
	{
		String longestCommonPrefix=strs[0];
	
		for(int i=0;i<strs.length;i++){
		   int k=0;
		    for(int j=0;j<strs[i].length();j++){
		        if(strs[i].charAt(j) == longestCommonPrefix.charAt(k)){
		           k++;
		        }else{
		            break;
		        }
		        }
		     longestCommonPrefix=strs[i].substring(0,k);
		     System.out.println("longestCommonPrefix:"+longestCommonPrefix);
		}
      return longestCommonPrefix;
	}
   //efficient version of "Horizontal scanning"
	public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    
    String prefix = strs[0];
    
    for (int i = 1; i < strs.length; i++) {
        int k = 0;
        // Key Fix: Ensure k doesn't go out of bounds of the prefix 
        // AND j doesn't go out of bounds of the current string
        while (k < prefix.length() && k < strs[i].length() && 
               prefix.charAt(k) == strs[i].charAt(k)) {
            k++;
        }
        
        prefix = prefix.substring(0, k);
        
        // Optimization: If prefix becomes empty, no need to check other strings
        if (prefix.isEmpty()) return "";
    }
    
    return prefix;
}
//vertical scanning 
public String longestCommonPrefixVertical(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length(); i++) {
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j++) {
            // Stop if string is too short OR characters don't match
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);
        }
    }
    return strs[0];
}
//array sorting method
public String longestCommonPrefixArray(String[] strs) {
    Arrays.sort(strs);
    String s1 = strs[0];
    String s2 = strs[strs.length - 1];
    int idx = 0;
    while (idx < s1.length() && idx < s2.length()) {
        if (s1.charAt(idx) == s2.charAt(idx)) idx++;
        else break;
    }
    return s1.substring(0, idx);
}
}
