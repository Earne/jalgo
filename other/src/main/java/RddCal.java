import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * 统计spark的log中RDD数目的变化，分析的文件是经过“grep rdd_" 后得到的文件
 * 本例中各RDD的编号为3\9\18……，行中有Added表示有rdd增加，有Removed表示有rdd被remove
 * 有Removing表示某rdd全部被删除
 * 15/11/03 15:41:13.123 INFO BlockManagerInfo: Added rdd_30_9 in memory on 11.11.0.65:59604 (size: 285.9 MB, free: 4.3 GB)
 */
public class RddCal {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss.SSS");
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

            Date preTime = null, curTime;
            long curStamp = 0;
            while ((str = br.readLine()) != null) {

                curTime = sdf.parse(str.substring(0, 21));
                if (preTime != null && !curTime.equals(preTime)) {
                    System.out.println(sdf.format(preTime) + " " + curStamp + " " + rddCount.values());
                    curStamp += curTime.getTime() - preTime.getTime();
                }
                preTime = curTime;

                if (!str.contains("Removing")) {
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
                } else if (str.contains("from")) {
                    int rddNameBeg = str.indexOf("RDD ");
                    int rddNameEnd = str.lastIndexOf("from");
                    int rddName = Integer.parseInt(str.substring(rddNameBeg + 4, rddNameEnd - 1));
                    rddCount.put(rddName, 0);
                }
            }
            // the last time
            System.out.println(sdf.format(preTime) + " " + curStamp + " " + rddCount.values());
            fileReader.close();
            br.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
