import java.util.Scanner;

/**
 * Created by earne on 9/29/15.
 */
public class MS_D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    }

    int rotateMatrix(int[][] S, int[][] D, int startL, int startP,int endL, int endP)
    {
        if( endP-startP+1 % 2 == 0 )// 是偶数)所以要继续旋转里面4个小矩阵
        {
            if( rotateMatrix(S, D, startL, startP, (startL+endL)/2, (startP+endP)/2 ) == 1&&
                    rotateMatrix(S, D, startL, (startP+endP)/2, (startL+endL)/2, endP ) == 1&&
                    rotateMatrix(S, D,  (startL+endL)/2,startP, endL, (startP+endP)/2 ) == 1 &&
                    rotateMatrix(S, D, (startL+endL)/2, (startP+endP)/2, endL, endP ) == 1    )
                return 1;//如果这四个小矩阵都可以通过各种旋转得到D中对应位置的小矩阵,则说明S可以旋转得到D,打印yes
        }

        else//矩阵是奇数的话,直接判断S,D相不相等
        {
            int flag=0;
            for(int i=startL; i<=endL; i++)
            {
                for(int j=startP; j<=endP; j++)
                {
                    if(S[i][j]!=D[i][j])
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0)  return 1;//说明可以旋转得到,打印yes
        }
        //以上是S整体没旋转的情形,下句是S整体分别旋转90,180,270(旋转的函数单独写)三种情形任意一个可以旋转成功的话,返回1
//        if( rotateMatrix(旋转90度的矩阵S) || rotateMatrix(旋转180度的矩阵S) || rotateMatrix(旋转270度的矩阵S)
        return 1;

//        return 0;//以上全部满足时说明D无法从S旋转得到,打印No
    }
}
