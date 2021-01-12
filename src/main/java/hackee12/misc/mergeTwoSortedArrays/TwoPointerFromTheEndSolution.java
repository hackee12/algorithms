package hackee12.misc.mergeTwoSortedArrays;

public class TwoPointerFromTheEndSolution implements Solution {

    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ii = m + n - 1;
        int fi = m - 1;
        int si = n - 1;
        int min = Integer.MIN_VALUE;
        while (ii >= 0) {
            int fv = fi >= 0 ? nums1[fi] : min;
            int sv = si >= 0 ? nums2[si] : min;
            if (fv >= sv) {
                fi--;
                nums1[ii--] = fv;
            } else {
                si--;
                nums1[ii--] = sv;
            }
        }
    }
}
