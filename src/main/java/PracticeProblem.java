import java.util.ArrayList;

public class PracticeProblem {

	public static void swap(ArrayList<String> list, int index1, int index2) {
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

	public static ArrayList<Double> createArrayList(double[] arr) {
        ArrayList<Double> list = new ArrayList<>();
        for (double value : arr) {
            list.add(value);
        }
        return list;
    }
	public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> together = new ArrayList<>();
        for (int num : list1) {
            together.add(num);
        }
        for (int num : list2) {
            together.add(num);
        }
        return together;
    }



}
