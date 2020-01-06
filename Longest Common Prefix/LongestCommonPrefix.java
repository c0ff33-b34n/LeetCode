class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        char charToCompare = 'a';
        int shortestString = 0;
        
        if (strs.length == 1){    
            return strs[0];
        }
        
        for (int i = 0; i < strs.length; i++) {
	
	        if (i == 0) {
		        shortestString = strs[0].length();
	        } else if (strs[i].length() < shortestString) {
		        shortestString = strs[i].length();	
	        }
	
        }

        outerloop:
        for (int i = 0; i < shortestString; i++) {
	
	        for (int j = 0; j < strs.length; j++) {
	
		        if (j == 0) {
			        charToCompare = strs[0].charAt(i);                
        		} else if (j == (strs.length - 1) && strs[j].charAt(i) == charToCompare){		
		        	commonPrefix += charToCompare;			
		        } else if (strs[j].charAt(i) != charToCompare) {
			        break outerloop;
		        }
	        }
        }

        return commonPrefix;
    }
}