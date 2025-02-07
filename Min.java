import java.util.Scanner;

class Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        float[] numbers = new float[n];

        System.out.println("Enter the floating-point numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextFloat();
        }

        float min1 = Float.MAX_VALUE;
        float min2 = Float.MAX_VALUE;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < min1) {
                min2 = min1;
                min1 = numbers[index];
            } else if (numbers[index] < min2 && numbers[index] != min1) {
                min2 = numbers[index];
            }
        }

        System.out.println("First min value is: " + min1);
        System.out.println("Second min value is: " + min2);

        input.close(); // Close the scanner to release resources
    }
}
