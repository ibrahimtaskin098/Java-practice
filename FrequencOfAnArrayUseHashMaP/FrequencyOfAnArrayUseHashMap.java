package FrequencOfAnArrayUseHashMaP;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfAnArrayUseHashMap {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 1, 3, 4, 5, 4, 5, 3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " Values: " + entry.getValue());
        }
    }

}
