package com.Hacker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveQueries {


    public static int getMedian(List<Integer> arr){

        int[] a = arr.stream().mapToInt(i->i).toArray();
        int n = arr.size();
        if (n % 2 != 0){
            return (int)a[n/2];
        }



        return (int)(a[(n - 1) / 2]);
    }

    public static boolean isEqual(Integer a, Integer b){

        if(a==b){
            return true;
        }else{
            return false;
        }

    }

    public static List<Integer> solvingQueries(List<Integer> arr, List<Integer> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int k = 0 ; k<=queries.size()-1; k++){
            List<Integer> passes = new ArrayList<>();
            for(int u=1; u<=queries.get(k); u++ ){
                boolean flag = true;
                System.out.println("Queries = "+(queries.get(k)-1));
                for(int i= 0 ; i<=queries.get(k)-1; i++){
                    int mod = i%u;

                    flag = isEqual(arr.get(i), arr.get(mod));
                    if(flag) {
//                        System.out.println("u = " + u + ", i = " + i + ", arr[" + i + "] = " + arr.get(i) + ", arr[" + mod + "]= " + arr.get(mod) + ", is =" + flag);
                    }
                    if(!flag){
                        break;
                    }
                }
                if(flag){
                    passes.add(u);
                }
            }
            if(passes.size()>0) {
                result.add(getMedian(passes));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Integer[] a  = {5,
                32,
                52,
                1,
                96,
                56,
                65,
                47,
                54,
                79,
                69,
                31,
                52,
                19,
                30,
                60,
                56,
                33,
                40,
                5,
                32,
                52,
                1,
                96,
                56,
                65,
                47,
                54,
                79,
                69,
                31,
                52,
                19,
                30,
                60,
                56,
                33,
                40,
                5,
                32,
                52,
                1,
                96,
                56,
                65,
                47,
                54,
                79,
                69,
                31,
                52,
                19,
                30,
                60,
                56,
                33,
                40,
        5,32};
        Integer[] q = {30,
                45,
                2,
                6,
                9,
                29,
                56,
                26,
                56,
                51,
                50,
                35,
                19,
                25,
                50,
                22,
                36,
                5,
                50,
                8,
                36,
                38,
                39,
                1,
                33,
                18,
                33,
                57,
                24,
                45,
                22,
                25,
                55,
                40,
                15,
                9,
                34,
                26,
                49,
                47,
                25,
                30,
                36,
                43,
                53,
                49,
                11,
                3,
                54,
                15,
                37,
                52,
                3,
                54,
                45,
                48,
                28,
                27,
                33,
                7,
                39,
                35,
                5,
                16,
                40,
                6,
                43,
                52,
                28,
                9,
                57,
                50,
                24,
                31,
                26,
                6,
                47,
                19,
                12,
                53,
                18,
                58,
                4,
                12,
                34,
                14,
                1,
                52,
                28,
                18,
                25,
                4,
                1,
                51,
                17,
                22,
                20,
                40,
                48,
                48,
                23};
        System.out.println(solvingQueries(Arrays.asList(a),Arrays.asList(q)));
    }


}
