import java.util.*;

/**
 * Created by Earne on 2015/8/23.
 */
public class APAC_RoundA_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        for (int i = 1; i <= T; i++) {
            System.out.println("Case #" + i + ": ");
            int N= cin.nextInt();
            int M = cin.nextInt();
            Map<ArrayList<Integer>, Integer> roadMap = new HashMap<>();
            long[][] dis = new long[N][N];
            LinkedList<Integer>[][] rs = new LinkedList[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (j != k)
                        dis[j][k] = Integer.MAX_VALUE;
                    rs[j][k] = new LinkedList<>();
                }
            }

            for (int j = 0; j < M; j++) {
                int U = cin.nextInt();
                int V = cin.nextInt();
                int tmp = cin.nextInt();
                dis[U][V] = tmp;
                dis[V][U] = tmp;
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(U);
                arr.add(V);
                roadMap.put(arr, j);
                rs[U][V].add(U);
                rs[U][V].add(V);
                rs[V][U].add(V);
                rs[V][U].add(U);
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        if (dis[k][l] > dis[k][j] + dis[j][l]) {
                            dis[k][l] = dis[k][j] + dis[j][l];
                            rs[k][l] = new LinkedList<>();
                            rs[k][l].addAll(rs[k][j]);
                            if (rs[k][l].size() != 0) rs[k][l].removeLast();
                            rs[k][l].addAll(rs[j][l]);
                        }

                    }
                }
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < rs[j][k].size() - 1; l++) {
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(rs[j][k].get(l));
                        arr.add(rs[j][k].get(l + 1));
                        roadMap.remove(arr);

                        arr = new ArrayList<>();
                        arr.add(rs[j][k].get(l + 1));
                        arr.add(rs[j][k].get(l));
                        roadMap.remove(arr);
                    }
                }
            }
            LinkedList<Integer> res = new LinkedList<>();
            for (Integer va : roadMap.values())
                res.add(va);
            Collections.sort(res);
//            System.out.println(res);
            for (Integer in : res) {
                System.out.println(in);
            }
//            System.out.println(roadMap.values());
//             roadMap.values()
//            System.out.println("***");
        }
    }
}
