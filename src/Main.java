public class Main {
    public static void main(String[] args) {
        //1. Написать метод, возвращающий количество чётных элементов массива
        int[] array = new int[]{1,2,3,4,5,6,7};
        System.out.println("Количество чётных элементов массива: " + countEvenElements(array));

        //2. Написать функцию, возвращающую разницу между самым большим и самым
        // маленьким элементами переданного не пустого массива.
        System.out.println("Разница между самым большим и самым маленьким элементами массива: " + diffMaxAndMin(array));

        //3. Написать функцию, возвращающую истину, если в переданном
        // массиве есть два соседних элемента, с нулевым значением
        System.out.println("Присутствуют ли соседние элементы с нулевым значением: " +
                ((returnIfNeighborsIsNull(array)) ? "Да" : "Нет"));
    }
    //region метод, возвращающий количество чётных элементов массива
    private static int countEvenElements(int[] array){
        int count = 0;
        for (int j : array) {
            if (j % 2 == 0) count++;
        }
        return count;
    }
    //endregion
    //region метод, возвращающий разницу между самым большим и самым маленьким элементами массива
    private static int diffMaxAndMin(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]) max=array[i];
            if(min > array[i]) min=array[i];
        }
        return max - min;
    }
    //endregion
    //region метод, возвращающую истину, если в массиве есть два соседних элемента с нулевым значением
    private static boolean returnIfNeighborsIsNull(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i+1] == 0) return true;
        }
        return false;
    }
    //endregion
}