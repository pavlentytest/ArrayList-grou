package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        Collections (Коллекции)
        Set-ы: множества.
        List-ы: списки. Упорядоченное множество. Есть номер у элемента.
        Map-ы: словари. Неупород. Есть имя у каждого элемента. Пары: ключ - значения.

        В Java:
        Set-ы: HashSet, TreeSet, SortedSet;
        List-ы: ArrayList, LinkedList, Vector, Stack
        Map-ы: HashMap, TreeMap, SortedMap, Hashtable

         */
       //String[] a = new String[100];

        ArrayList<String> ab = new ArrayList<>(); // 20
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      /*  while(true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            ab.add(s);
        }*/
        //for(String str: ab) System.out.print(str + " ");
        //for(int i=0;i<ab.size();i++) System.out.print(ab.get(i) + " ");

        ArrayList<String> f = new ArrayList<>();
        Collections.addAll(f,"asdfasdf","asdfasdf","ddd","w");

        List<Integer> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      /*  while(true) {
            String s = r.readLine();
            if(s.isEmpty()) break;
            int x = Integer.parseInt(s);
            if(x%2 == 0) {
                list.add(x);
            } else {
                list.add(0,x);
            }
        }*/
      //  for(Integer p: list) System.out.print(p + " ");

        List<Integer> kkk = new ArrayList<>();
        kkk.add(333);
        kkk.add(121);
        kkk.add(338);
        kkk.add(5);
        kkk.add(3);
        for(int j=0;j<kkk.size();j++) {
            if(kkk.get(j)>10) kkk.remove(j);
        }
      //  for(Integer p: kkk) System.out.print(p + " ");

        Integer[] h = {3,4,5,6};
        List<Integer> h_ = Arrays.asList(h);

        List<Double> t = new ArrayList<>();
        Collections.addAll(t, 4.0, 4.0, 5.6, 5.5);
        Double[] t_ = t.toArray(new Double[t.size()]);

        for(Double l: t_) System.out.print(l + " ");

        //Collections.sort()
          //      Arrays.sort()
            //Collections.binarySearch()





    }
}
