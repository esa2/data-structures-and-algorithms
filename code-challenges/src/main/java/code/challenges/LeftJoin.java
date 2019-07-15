package code.challenges;

import java.util.Iterator;
import java.util.Map;

public class LeftJoin {

    public String[][] leftJoin(Map map1, Map map2) {
        String[][] arrays = new String[map1.size()][];
        int i = 0;

        Iterator hmIterator = map1.entrySet().iterator();

        while (hmIterator.hasNext()) {

            Map.Entry mapElement = (Map.Entry)hmIterator.next();
                String[] strArr =  new String[3];
                strArr[0] = mapElement.getKey().toString();
                strArr[1] = mapElement.getValue().toString();

            if (map2.containsKey(mapElement.getKey())) {
                strArr[2] = map2.get(mapElement.getKey()).toString();
            } else {
                strArr[2] = null;
            }
            arrays[i] = strArr;
            i++;
        }
        return arrays;
    }
}
