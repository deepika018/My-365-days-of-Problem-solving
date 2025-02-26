public class PivotIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Taking user input for array elements
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Step 1: Calculate the total sum (rightSum)
        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        // Step 2: Iterate through the array to find the pivot index
        int pivotIndex = -1;
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i]; // Remove current element from right sum
            if (leftSum == rightSum) { // Check if leftSum equals rightSum
                pivotIndex = i;
                break; // Stop once we find the pivot index
            }
            leftSum += nums[i]; // Add current element to left sum
        }

        // Step 3: Print the result
        System.out.println("Pivot Index: " + pivotIndex);

        scanner.close();
    }
}