package order;

import java.util.Arrays;

public class Sort {
    public void sort(int l, int input[], boolean flag) {
        int k = 0, temp;
        if (flag == true) {
            for (int i = 0; i < l; i++) {
                for (int j = 1; j < (l - i); j++) {

                    if (input[j - 1] > input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                    }
                }

            }
            System.out.println("Ascending order:" + Arrays.toString(input));
        }
        else if (flag ==false) {
            for (int i = 0; i < l; i++) {
                for (int j = 1; j < (l - i); j++) {

                    if (input[j - 1] < input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                    }
                }

            }
            System.out.println("Descending order:" + Arrays.toString(input));
        }
    }
}


