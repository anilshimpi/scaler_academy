package dsa_intermediate;

public class CommonFactor {
    /*
    * 2427. Number of Common Factors

Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.

Example 1:

Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
Example 2:

Input: a = 25, b = 30
Output: 2
Explanation: The common factors of 25 and 30 are 1, 5.

Constraints:

1 <= a, b <= 1000
    * */

    public static int solve(int a, int b) {

        int commonFactor = gcd(a, b);
        int count = 0;
        for (int i = 1; i <=commonFactor / i; i++) {
            if (commonFactor % i == 0) {
                if(i==commonFactor/i){
                   count++;
                }else
                    count+=2;
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
      // a: 12=1,2,3,4,6,12
      // b: 6=1,2,3,6
        int a1=12;
        int b1=6;
        CommonFactor factor = new CommonFactor();
        System.out.println("Command factor count of A and B are: " +solve(a1,b1));
    }
}
