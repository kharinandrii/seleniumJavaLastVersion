package us.abstracta.opencard.params;

import java.util.HashMap;


public  class HashData {
    public static HashMap<String, String> hashMap = new HashMap<String, String>();

    public HashData clearData() {
        hashMap.clear();
        return this;
    }

    public HashData putValue(String key, String value) {
        hashMap.put(key, value);
        return this;
    }

    public String  getValue(String key) {
       return hashMap.get(key);
    }

}
