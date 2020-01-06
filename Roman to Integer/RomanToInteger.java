class Solution {
    public int romanToInt(String s) {
        int level = 1;
        int solution = 0;
        int current;

        for (int i = s.length() - 1; i >= 0; i--) {
	        switch (s.charAt(i)){
		        case 'I':
			        current = 1;
		        break;
		        case 'V':
			        current = 5;
		        break;
		        case 'X':
			        current = 10;
		        break;
		        case 'L':
			        current = 50;
		        break;
		        case 'C':
			        current = 100;
		        break;
		        case 'D':
			        current = 500;
		        break;
		        case 'M':
			        current = 1000;
		        break;
		        default:
			        current = 0;
		        break;
	        }
	
	        if (current == level) {
		        solution += current;
	        } else if (current > level) {
		        level = current;
		        solution += current;
	        } else {
		        solution -= current;
	        }	
        }
        
        return solution;
    }
}