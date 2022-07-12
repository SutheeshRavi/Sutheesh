public class Smallest {
    public static void main(String[] args) {
        int array[] = {45, 76, 345, 21, 876, 994, 5, 763};
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < smallest; i++) {
            for (int j = i + 1; j < smallest; j++) {

                if (array[i] < smallest) {
                    smallest = array[i];

                }
            }
        }
        System.out.println("Smallest number is =" + smallest);
    }
}

