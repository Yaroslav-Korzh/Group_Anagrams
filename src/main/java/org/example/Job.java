package org.example;
import java.util.*;
public class Job {
    public List jobMethod(String[] strs) {
        if (strs.length == 0) return  new ArrayList();
        Map<String, List<String>> hashList = new HashMap<>();

        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if (!hashList.containsKey(key)) {
                hashList.put(key, new ArrayList<>());
            }

            hashList.get(key).add(s);
        }

        return new ArrayList(hashList.values());
    }
}
