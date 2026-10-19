package Arrays;

// BRUTE FORCE :Time Complexity O(n^3)

// public class MaxSubArray {
//     public static void MaxSubArray(int numbers[]) {
//         int currentSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 currentSum = 0;
//                 for (int k = start; k <= end; k++) {
//                     currentSum += numbers[k];

//                 }
//                 System.out.println(currentSum);
//                 if (maxSum < currentSum) {
//                     maxSum = currentSum;
//                 }
//             }

//         }
//         System.out.println("Max sum is :" + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, -2, 6, -1, 3 };

//         MaxSubArray(numbers);
//     }

// }

// Prefix Sum Technique :Time Complexity O(n^2)

public class MaxSubArray {
    public static void MaxSubArray(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }

        }
        System.out.println("Max sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };

        MaxSubArray(numbers);
    }

}
