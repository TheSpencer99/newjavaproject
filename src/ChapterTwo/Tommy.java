package ChapterTwo;


import java.util.Arrays;

public class Tommy {
    public static void main(String[] args) {
        // Arrays
        int [ ] numbers = {0, 1, 2, 5, 12, 100};
        String [ ] names = {"Alli",   "Maria"};
        int oneHundred = numbers[5];

        numbers[0] = 0;
        numbers[1]  = 1;
        numbers[2] = 2;
       System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

             
    }
}
