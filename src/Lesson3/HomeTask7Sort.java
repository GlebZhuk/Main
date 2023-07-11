package Lesson3;

import java.util.Arrays;

public class HomeTask7Sort {

    public static void quickSort(int[] array, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (array.length == 0 || low >= high) return;
        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = array[middle];
        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < border) i++;
            while (array[j] > border) j--;
            if (i <= j) {
                int swap = array[i];
                array[i] =array[j];
                array[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(array, low, j);
        else if (high > i) quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int [] array={1,21,642,7,23,10,9,};

        int hight=array.length-1;
        int low=array[0];
        quickSort(array,low,hight);
        System.out.println(Arrays.toString(array));
    }
}

