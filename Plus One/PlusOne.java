public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        int[] solution = new int[digits.length];

        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + carry;
            solution[i] = val % 10;
            carry = val / 10;
        }

        if (carry == 1) {
            solution = new int[digits.length + 1];
            solution[0] = 1;
        }

        return solution;

    }
    
}