package com.muyer.hash;

import java.util.HashMap;
import java.util.Map;

/**
 *@描述
 *@创建人 yejiang
 *      设计一种结构，包含以下三个功能
 *      1.insert(key):将某个key加入结构，要做到不重复加入
 *      2.delete(key):将原本在结构中的某个key移出
 *      3.getRandom(key):等概率随机返回结构中的任何一个key
 *      要求三个方法时间复杂度都为O(1)
 *@创建时间 2022/8/15 18:20
 */
public class RandomPool {
    public static void main(String[] args) {
        RandomPool randomPool = new RandomPool();
        randomPool.insert("ye");
        randomPool.insert("jiang");
        randomPool.insert("sun");
        randomPool.insert("xu");
        for (int i = 0; i < 100; i++) {
            System.out.println(randomPool.getRandom());
        }
        randomPool.delete("ye");
        randomPool.delete("sun");
        System.out.println(1);
    }

    //key->index ; index->key
    public static Map<String, Integer> keyIndexMap = new HashMap<String, Integer>();
    public static Map<Integer, String> indexKeyMap = new HashMap<Integer, String>();
    public static int size = 0;

    private void insert(String key) {
        if (keyIndexMap.containsKey(key)) {
            throw new RuntimeException("存在当前key:" + key);
        }
        size++;
        keyIndexMap.put(key, size);
        indexKeyMap.put(size, key);
    }

    private void delete(String key) {
        //删除map中的key，然后讲index最后一位换到删除的位置，size--
        if (!keyIndexMap.containsKey(key)) {
            throw new RuntimeException("不存在当前key:" + key);
        }
        //最后一位删除
        if (keyIndexMap.get(key) == size) {
            keyIndexMap.remove(key);
            indexKeyMap.remove(size);
        } else {
            //删除的非最后一位
            int index = keyIndexMap.get(key);
            keyIndexMap.put(indexKeyMap.get(size), index);
            indexKeyMap.put(index, indexKeyMap.get(size));
            keyIndexMap.remove(key);
            indexKeyMap.remove(size);

        }
        size--;
    }

    private String getRandom() {
        if(size == 0){
            return null;
        }
        int index = (int) (Math.random() * size) + 1;
        return indexKeyMap.get(index);
    }


}
