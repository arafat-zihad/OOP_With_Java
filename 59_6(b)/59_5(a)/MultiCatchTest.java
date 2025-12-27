public class MultiCatchTest {
    public static void main(String[] args) {
        try {
            int[] nums = new int[5];
            nums[3] = 21 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Execution done");
        }
        System.out.println("End of program");
    }
}
