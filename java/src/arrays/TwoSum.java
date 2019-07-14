package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){

        int array[] = {1,3,4,6,7,9};
        int target = 10;
        int [] pair = getTwoSum(array,target);
        System.out.println(pair[0]+"-"+pair[1]);
    }

    private static int[] getTwoSum(int[] array, int target) {
        int[] pair = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        if (array.length > 0){
            for (int i=0;i<array.length;i++){
                if (map.containsKey(target-array[i])){
                    pair[0]=array[i];
                    pair[1]=target-array[i];
                }else{
                    map.put(array[i],i);
                }

            }
        }else {
            System.out.println("array is empty");
        }
        return pair;
    }

}
