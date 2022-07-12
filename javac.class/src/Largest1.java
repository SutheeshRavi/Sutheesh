public class Largest1 {
    public static void main(String[] args){
        int temp,size;
        int array[] ={45, 76, 987, 345, 21, 876, 994, 5,763};
        size = array.length;

        for(int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
            System.out.println("the largest number is ="+array[size-1]);
    }
}