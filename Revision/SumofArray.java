class SumofArray {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = {10, 20, 30};

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array : "+sum);
    }
}