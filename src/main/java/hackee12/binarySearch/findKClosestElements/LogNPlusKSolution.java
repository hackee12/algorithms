package hackee12.binarySearch.findKClosestElements;

import java.util.LinkedList;
import java.util.List;

public class LogNPlusKSolution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] == x) {
                left = mid;
                break;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (arr[left] != x && left - 1 >= 0 && x - arr[left - 1] <= arr[left] - x) {
            left -= 1;
        }
        LinkedList<Integer> reply = new LinkedList<>();
        reply.addFirst(arr[left]);
        k--;
        int i = 1;
        int j = 1;
        while (k-- > 0) {
            if (left - i >= 0 && left + j < arr.length) {
                if (x - arr[left - i] <= arr[left + j] - x) {
                    reply.addFirst(arr[left - i]);
                    i++;
                } else {
                    reply.addLast(arr[left + j]);
                    j++;
                }
            } else if (left - i >= 0) {
                reply.addFirst(arr[left - i]);
                i++;
            } else {
                reply.addLast(arr[left + j]);
                j++;
            }
        }
        return reply;
    }
}