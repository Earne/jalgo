/**
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 * <p>
 * Follow up:
 * If this function is called many times, how would you optimize it?
 * <p>
 * Related problem: Reverse Integer
 */
public class ReverseBits {
    public int reverseBits(int n) {
        n = ((n & 0x55555555) << 1) | ((n >>> 1) & 0x55555555);
        n = ((n & 0x33333333) << 2) | ((n >>> 2) & 0x33333333);
        n = ((n & 0x0f0f0f0f) << 4) | ((n >>> 4) & 0x0f0f0f0f);
        n = ((n & 0x00ff00ff) << 8) | ((n >>> 8) & 0x00ff00ff);
        n = ((n & 0x0000ffff) << 16) | ((n >>> 16) & 0x0000ffff);
        return n;
    }

    public int reverseBits1(int n) {
        return Integer.reverse(n);
    }

    // you need treat n as an unsigned value
    public int reverseBits2(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>>= 1;
        }
        return result;
    }

    public int reverseBits3(int n) {
        int result;
        if (n % 2 == 0) {
            result = 0;
        } else {
            result = -1;
        }
        n = n >>> 1;

        for (int i = 1; i < 32; i++) {
            result = result << 1;
            if (n % 2 != 0) {
                result += 1;
            }
            n = n >>> 1;
        }
        return result;
    }
}
