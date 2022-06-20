package HomeWork_L7;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int myArray[] = {23,567,8865,445,677,544,6778,654,2,3,556};
        int size = myArray.length;

        for (int i = 0; i < size / 2; i++){
            int temp = myArray[i];
            myArray[i] = myArray[size -1 -i];
            myArray[size -1 -i] = temp;
        }
        System.out.println("myArray after reverse: ");
        System.out.println(Arrays.toString(myArray));

    }

}
