//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {-1, 1, 3, 5, -5, -8};
        int maxValue = getMaxValue(numbers);
        int minValue = getMinValue(numbers);

        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);
    }

    public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
//            so sanh sai
//            if (numbers[i] < maxValue){
//                sua lai
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
//        loop sai
//        for (int i = 1; i < numbers.length - 1; i++) {
//            sua lai
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}