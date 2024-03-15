package ARRAY;
public class SortAnArrayOf_0s1s2s {
    int[] nums = {2,0,2,1,1,0};
    // Dutch National Flag Algorithm
    void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void print() {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
    }
    public static void main(String[] args) {
        SortAnArrayOf_0s1s2s sort = new SortAnArrayOf_0s1s2s();
        sort.sortColors(sort.nums);
        sort.print();
    }
}

//Time complexity:O(N)
//Space complexity:O(1)