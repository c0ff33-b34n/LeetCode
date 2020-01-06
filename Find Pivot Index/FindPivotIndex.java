public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int solution = -1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum[0] = 0;
            } else {
                leftSum[i] = leftSum[i - 1] + nums[i - 1];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightSum[0] = 0;
            } else {
                rightSum[i] = rightSum[i + 1] + nums[i + 1];
            }
        }


        for (int i = 0; i < nums.length; i++){
            if (leftSum[i] == rightSum[i]){
                solution = i;
                break;
            }
        }

        return solution;
    }
    
}