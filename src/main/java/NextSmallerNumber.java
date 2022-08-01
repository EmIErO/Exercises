import java.util.Arrays;
import java.util.Collections;

public class NextSmallerNumber {

    public static long nextSmaller(long n)
    {
        if (n < 10) {
            return -1;
        }
        Long[] digits = getDigits(n);
        long smallestNextNumber = toNumber(shuffle(digits));
        return smallestNextNumber == n ? -1 : smallestNextNumber;
    }

    private static Long[] shuffle(Long[] digits) {
        boolean swapped = false;
        int current = digits.length - 1;
        while (current > 0) {
            if (digits[current - 1] > digits[current]) {  // and not zero swapped as first
                // swap, change flag, mark positon
                long temp = digits[current];
                digits[current] = digits[current - 1];
                digits[current - 1] = temp;
                swapped = true;
                break;
            }
            current--;
        }
        if (swapped) {
            Arrays.sort(digits, current, digits.length, Collections.reverseOrder());
        }
        return digits;
    }

    private static long toNumber(Long[] digits) {
        long number = 0;
        long multiply = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            number += digits[i] * multiply;
            multiply *= 10;
        }
        return number;
    }

    private static Long[] getDigits(long n) {
        Long[] digits = new Long[getSize(n)];
        int current = digits.length - 1;
        while (n > 0) {
            long digit = n % 10;
            // add digit to current
            digits[current] = Long.valueOf(digit);
            current--;
            n /= 10;
        }
        return digits;
    }

    private static int getSize(long n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return  count;
    }


    private static void sort(long arr[], int left, int right){
        if(left < right)
        {
            int q = partition(arr, left, right);
            sort(arr, left, q);
            sort(arr, q + 1, right);
        }
    }

    public static int partition(long arr[], int left, int right){
        long pivot = arr[left];
        int i = left;
        for(int j = left + 1; j <= right; j++){
            if (arr[j] > pivot){
                i = i + 1;
                long temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }

        long temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;

    }
}
