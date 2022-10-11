import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "90146852";
        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length() ; i++) {
            nums[i] = Character.getNumericValue(s.charAt(i));
        }
        System.out.println(Arrays.stream(nums).sum());

    }
}
