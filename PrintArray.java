public class PrintArray {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop through the array and print each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        int max=0;
        for(int i=0;i<numbers.length;i++){
            max=Math.max(max,numbers[i]);
        }
        System.out.println(max);
    }
}
