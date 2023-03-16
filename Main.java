import java.util.ArrayList;

public class Main {

    public static int findSmallest(ArrayList<Integer> arr){
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for(int i=1; i < arr.size()-1; i++){
            System.out.println(arr.get(i));
            if(arr.get(i) < smallest){
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=0; i <= arr.size()-1; i++){
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));
            arr.remove(smallest);
        }
        return newArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(10);
        //5 elementow
        //0, 1, 2, 3, 4
        ArrayList<Integer> newArrayList = selectionSort(arrayList);
        /*for (int el : newArrayList){
            System.out.println(el);
        }*/
    }
}