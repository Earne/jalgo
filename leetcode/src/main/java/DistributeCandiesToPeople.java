/**
 * @author gengyuanzhen
 */
public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int peopleNum) {
        int lasFullPos = (int) Math.sqrt(candies * 2);
        lasFullPos = lasFullPos * (lasFullPos + 1) / 2 > candies ? lasFullPos - 1 : lasFullPos;
        int round = lasFullPos / peopleNum;

        int[] result = new int[peopleNum];
        int x = (round - 1) * round / 2;
        for (int i = 0; i < peopleNum; i++) {
            result[i] = x * peopleNum + (i + 1) * round;
        }
        for (int i = 0; i < lasFullPos % peopleNum; i++) {
            result[i] += i + 1 + round * peopleNum;
        }

        int left = candies - (lasFullPos * (lasFullPos + 1)) / 2;
        result[lasFullPos % peopleNum] += left;
        return result;
    }
}
