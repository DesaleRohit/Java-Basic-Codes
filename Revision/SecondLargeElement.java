import java.util.Arrays;

class SecondLargeElement {
    public static void main(String[] args) {
        int [] arr = {10 , 54 , 1 , 29 , 12 };
        Arrays.sort(arr);
        System.out.println("Second large element in Array : "+arr[arr.length - 2]);
    }
}