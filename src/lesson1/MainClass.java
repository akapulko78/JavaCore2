package lesson1;

import java.util.ArrayList;

public class MainClass {
    //Task_1

    private String[] changeElements(String[] list, int element1, int element2) {
        //Task_1
        String k = list[element1];
        list[element1] = list[element2];
        list[element2] = k;
        return list;
    }
    //Task_2

    private ArrayList<String> listToArray(String[] list, ArrayList<String> array) {
        for (int i = 0; i < list.length; i++) {
            array.add(list[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        //Task_1

        MainClass example = new MainClass();
        String list[] = {"1", "2", "3", "4"};
        example.changeElements(list, 0, 2);
        for (String c : list) {
            System.out.println(c);
        }

        //Task_2

        ArrayList<String> arr = new ArrayList<>();
        example.listToArray(list, arr);
        System.out.println(arr);
    }
}
