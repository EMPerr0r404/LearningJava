import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {4, 643, 112, 9999, 69};
        boolean isSorted;
        int i;
        for (i = 0; i < numbers.length - 1; i++) {
            isSorted = true;
            for (var j = 1; j < numbers.length - i; j++)
                if (numbers[j] < numbers[j - 1]) {
                    var temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    isSorted = false;
                }
            if (isSorted)
                break;

        }


        System.out.println(Arrays.toString(numbers));
    }
}



