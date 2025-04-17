package vti.be.assignmentday08.exercise01;

public class Question03
{
    public static void MyMath_Max(int... nums) {
        // Tim Max
        int max = nums[0];
        for( int i = 0; i < nums.length; i++ ) {
            if (nums[i] > max) {
                max = nums[i];
            }

        } System.out.print(max + " ");

    }
    public static void MyMath_Min(int... nums) {
        // Tim Max
        int min = nums[0];
        for( int i = 0; i < nums.length; i++ ) {
            if (nums[i] < min) {
                min = nums[i];
            }

        } System.out.print(min + " ");

    }
    public static void MyMath_Sum(int... nums) {
        // Tim Max
        int sum = 0;
        for( int i = 0; i < nums.length; i++ ) {



            sum += nums[i];


        } System.out.print(sum + " ");

    }

    public static void main(String[] args) {
        MyMath_Max(1,2,3,4);
        MyMath_Min(1,2,3,4);
        MyMath_Sum(1,2,3,4);
    }



}
