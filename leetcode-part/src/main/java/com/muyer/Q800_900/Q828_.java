package com.muyer.Q800_900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/6 15:00
 */
public class Q828_ {

    public int uniqueLetterString(String s) {
        int res = 0;
        List<String> list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < s.length()){
            while(index2 < s.length()){
                if(index1<=index2){
                    String str = s.substring(index1,index2+1);
                    list.add(str);
                    //System.out.println(str);
                }
                index2++;
            }
            index1++;
            index2 = 0;
        }

        for(String str : list){
            int n = countUniqueChars(str);
            //System.out.println(str+":"+n);
            res = res + n;
        }
        return res;
    }

    public int countUniqueChars(String str){
        if(str.length() == 1){
            return 1;
        }
        if(str.length() == 2){
            return str.charAt(0) == str.charAt(1) ? 0 : 2;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            char key = str.charAt(i);
            if(map.containsKey(key)){
                map.put(key,1+map.get(key));
            } else {
                map.put(key,1);
            }
        }
        int count = 0;
        for(char key:map.keySet()){
            if(map.get(key) == 1){
                count++;
            }
        }
        //return str.length - 2*(str.length - sets.size());
        return count;
    }
}
