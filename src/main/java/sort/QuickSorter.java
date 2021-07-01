package sort;

/**
 * @author pi
 * @date 2021/06/29 23:16:52
 **/
public class QuickSorter {

    public Integer[] quickSort(Integer[] originArray) {
        int arraySize = originArray.length;
        int mid = arraySize / 2;
        if(mid < 2){
            return originArray;
        }else{
            int pivot = originArray[mid];
            Integer[] lessArray = new Integer[mid + 1];
            Integer[] greaterArray = new Integer[mid + 1];
            for(int i : originArray){
                if(i <= pivot){
//                    lessArray
                }
            }
        }


        return originArray;
    }
}
