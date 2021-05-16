//package com.test.springcloud.repos;
//
//import java.util.*;
//
//class Test  {
//
//    Test(){
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Ready");
//
//        String a="a";
//        String b="a";
//
//
//        Set<Integer> ss= new HashSet<>();
//        ss.add(null);
//
//
//
//
//
//        System.out.println(a.hashCode()+","+b.hashCode() +","+a.equalsIgnoreCase(b));
//
//        Map<String,Integer> map=new HashMap<>();
//
//        map.put("a",1);
//        map.put("v",10);
//
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//
//        Iterator<Map.Entry<String,Integer>> mapi= map.entrySet().iterator();
//
//        while (mapi.hasNext()){
//         Map.Entry<String,Integer> mp =mapi.next();
//
//            System.out.println(mp.getKey()+":"+mp.getValue());
//        }
//        List<Integer> lst = Arrays.asList(1,5,6,8,3);
//
//        List<List<Integer>> lst1 =new ArrayList<>();
//
//        lst1.add(Arrays.asList(1,1,1,1));
//
//        lst1.add(Arrays.asList(2,2,2,2));
//
//
//        ListIterator<List<Integer>> iter=lst1.listIterator();
//
//        while(iter.hasNext()){
//          iter.next().forEach(i-> System.out.println(i));
//        }
//
//
//
//    }
//
//
//}
