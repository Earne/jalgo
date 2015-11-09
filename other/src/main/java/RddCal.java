import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * 统计spark的log中RDD数目的变化，分析的文件是经过“grep rdd_" 后得到的文件
 * 本例中各RDD的编号为3\9\18……，行中有Added表示有rdd增加，否则表示有rdd被remove
 */
public class RddCal {
    public static void main(String[] args) {
        Map<Integer, Integer> rddCount = new TreeMap<>();
        rddCount.put(3, 0);
        rddCount.put(9, 0);
        rddCount.put(18, 0);
        rddCount.put(20, 0);
        rddCount.put(28, 0);
        rddCount.put(30, 0);
        rddCount.put(40, 0);
        rddCount.put(46, 0);
        rddCount.put(52, 0);
        rddCount.put(58, 0);
        rddCount.put(64, 0);
        rddCount.put(70, 0);
        rddCount.put(76, 0);
        rddCount.put(82, 0);
        rddCount.put(88, 0);
        rddCount.put(94, 0);
        try {
            FileReader fileReader = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fileReader);
            String str;

            String preTime = null, curTime;
            while ((str = br.readLine()) != null) {

                curTime = str.substring(9, 17);
                if (preTime != null && !curTime.equals(preTime)) {
                    System.out.println(preTime + " " + rddCount.values());
                }
                preTime = curTime;

                int rddNameBeg = str.indexOf("_");
                int rddNameEnd = str.lastIndexOf("_");
                int rddName = Integer.parseInt(str.substring(rddNameBeg + 1, rddNameEnd));
                boolean isAdd = str.contains("Added");
                if (isAdd) {
                    if (rddCount.containsKey(rddName)) {
                        rddCount.put(rddName, rddCount.get(rddName) + 1);
                    } else {
                        rddCount.put(rddName, 1);
                    }
                } else {
                    if (rddCount.containsKey(rddName)) {
                        rddCount.put(rddName, rddCount.get(rddName) - 1);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }

            }
            fileReader.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
