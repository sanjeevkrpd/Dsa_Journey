// package HackerRankQuestions;

// import java.util.ArrayList;
// import java.util.*;

// public class Max_Min_Plant_Tree {
//     public static void main(String[] args) {
        

//         char row[] = {'0', '0' , '0' , 'X' , '0' , '0' , '0'};

//         List<Integer> broken = new ArrayList<>();
//         for (int i = 0; i < row.length; i++) {
                
//             if (row[i] == 'X') {
//                     broken.add(i);
//             }
//         }

//         int max = 0;
//         int min = 0;

//         broken.add(0,-1);
//         broken.add(row.length);

//         for (int i = 0; i < broken.size() -1; i++) {

//             int start = broken.get(i);
//             int end = broken.get(i+1);
//             int len  = end - start  - 1;

//             if (len > 0 ) {

//                 max += (len+1)/2;
//                 min += len/2;

//             }

//         }

//         System.out.println(max);
//         System.out.println(min);

//     }
// }


package HackerRankQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max_Min_Plant_Tree {

     public static void main(String[] args) {
        int N = 1;
        int M = 7;

        List<Integer>[]  broken = new List[N];

        broken[0] = new ArrayList<>();

        broken[0].add(4);

        long maxPlants = 0;
        long minPlants = 0;

        for (int r = 0; r < N; r++) {
            List<Integer> rowBroken = broken[r];

            Collections.sort(rowBroken);

             rowBroken.add(0,0);
             rowBroken.add(M+1);


             for (int i = 0; i < rowBroken.size() - 1; i++) {
                
                int start = rowBroken.get(i);
                int end = rowBroken.get(i+1);

                int len = end - start -1 ;

                if (len > 0)  {
                    maxPlants  += (len+1) /2;
                    minPlants += len/2;
                }
             }

        }

        System.out.println("Maximum plants: " + maxPlants);
        System.out.println("Minimum plants (blocking): " + minPlants);
     }
}
