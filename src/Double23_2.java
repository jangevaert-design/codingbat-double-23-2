public class Double23_2 {
  public boolean double23(int[] nums) {
    if (nums.length <= 1) {
      return false;
    } else {
      return ((nums[0] ==2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }
  }
}
