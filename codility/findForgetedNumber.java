package com.onetechone.design.designpattern.codechallenge;

import java.util.Arrays;

public class FindForgetedNumber {

//  Write a function:
//
//  class Solution { public int solution(int[] A); }
//
//  that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//  For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//  Given A = [1, 2, 3], the function should return 4.
//
//  Given A = [−1, −3], the function should return 1.
//
//  Assume that:
//
//  N is an integer within the range [1..100,000];
//  each element of array A is an integer within the range [−1,000,000..1,000,000].
//  Complexity:
//
//  expected worst-case time complexity is O(N);
//  expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
//

  class Solution {
    public int solution(int[] A) {
      // write your code in Java SE 8
      Arrays.sort(A);
      for (int j = 0; j < A.length - 1; j++) {
        if (A[j] >0 && A[j] != A[j + 1] && A[j + 1] - A[j] > 1) {
          return A[j] + 1;
        }
      }

      if (A[A.length - 1] > 0) {
        return (A[A.length - 1] + 1);
      } else {
        return 1;
      }
    }

  }

}
