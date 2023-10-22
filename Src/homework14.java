import java.util.Arrays;
import java.util.Random;

public class homework14 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100_000) + 11;
        int lengthArray = 0;
        int temp = number;
        for (; temp > 10; lengthArray++) {
            temp /= 10;
        }
        lengthArray++;
        temp = number;
        int[] array = new int[lengthArray];
        int sum = 0;
        for (int i = 0; ; i++) {
            if (temp > 10) {
                array[i] = temp % 10;
                temp /= 10;
            } else {
                array[i] = temp % 10;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Число: "+ number + ", складається з цифр: "+ Arrays.toString(array)+ ", сумма яких: " + sum);
    }
}
