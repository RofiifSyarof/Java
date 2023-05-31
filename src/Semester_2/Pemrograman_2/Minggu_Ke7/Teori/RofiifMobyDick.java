package Semester_2.Pemrograman_2.Minggu_Ke7.Teori;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

// Sumber text: https://gist.github.com/StevenClontz/4445774

import java.util.*;
import java.io.*;

public class RofiifMobyDick {
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>();
        
        try {
            Scanner sken1 = new Scanner(new File("D:/VS Code Repo/Java/src/Semester_2/Pemrograman_2/Minggu_Ke7/Teori/mobydick.txt"));
            sken1.useDelimiter("\\s+");
            
            while (sken1.hasNext()) {
                String[] word = sken1.next().split("\\W+");
                for (String k : word) {
                    k = k.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!k.isEmpty()) {
                        wordMap.put(k, wordMap.getOrDefault(k, 0) + 1);
                    }
                }
            }
            sken1.close();
            
            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordMap.entrySet());
            wordList.sort(Map.Entry.comparingByValue());
            
            Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e1.getValue().compareTo(e2.getValue());
                }
            });
            
            System.out.println("Jumlah kata:");
            int rank = 1;
            for (Map.Entry<String, Integer> entry : wordList) {
                if (entry.getValue() >= 1000) {
                    System.out.println(rank + ". " + entry.getKey() + ": " + entry.getValue());
                    rank++;
                }
            }
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*
 * Output:
 * Jumlah kata:
 * 1. he: 1037
 * 2. it: 1196
 * 3. i: 1315
 * 4. his: 1332
 * 5. that: 1559
 * 6. in: 2145
 * 7. to: 2416
 * 8. a: 2575
  * 9. and: 3214
 * 10. of: 3532
 * 11. the: 7032
 */