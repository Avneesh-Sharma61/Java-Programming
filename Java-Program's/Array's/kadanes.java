public class kadanes{
    public static int maxSubArraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int x = 0,y = 0;
        int tempStart = 0;
        for(int i = 0; i < arr.length;i++){
            currSum += arr[i];
            if(currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
            if(maxSum < currSum){
                maxSum = currSum;
                x = tempStart;
                y = i;
            }
        }
        System.out.println(x + " to " + y);
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-30,4,-3,-2,1,5,-3};
        System.out.println("Max Sub Array Sum : "+ maxSubArraySum(arr));
        
    }
}