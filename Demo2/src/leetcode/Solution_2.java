package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-two-numbers
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class Solution_2 {

    static int count = 17;

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Long> list1 = getLongList(l1);
        List<Long> list2 = getLongList(l2);
        int length = list1.size() >= list2.size() ? list1.size() : list2.size();
        String sumStr = "";
        boolean nextPlus = false;
        for (int i = 0; i < length; i++) {
            String tempSumStr;
            long val1 = 0;
            long val2 = 0;
            if (list1.size() > i) {
                val1 = list1.get(i);
            }
            if (list2.size() > i) {
                val2 = list2.get(i);
            }
            long sum = val1 + val2 + (nextPlus ? 1 : 0);
            if (String.valueOf(sum).length() > count) {
                nextPlus = true;
                tempSumStr = String.valueOf(sum).substring(1);
            } else {
                nextPlus = false;
                tempSumStr = String.valueOf(sum);
                if (i != length - 1) {
                    while (tempSumStr.length() < count) {
                        tempSumStr = "0" + tempSumStr;
                    }
                }
            }
            sumStr = tempSumStr + sumStr;
        }
        String reverse = new StringBuilder(sumStr).reverse().toString();
        ListNode result = new ListNode(Integer.parseInt(String.valueOf(reverse.charAt(0))));
        ListNode temp = result;
        for (int i = 1; i < reverse.length(); i++) {
            ListNode item = new ListNode(Integer.parseInt(String.valueOf(reverse.charAt(i))));
            temp.next = item;
            temp = item;
        }
        return result;
    }


    public static long getLong(ListNode l1) {
        ListNode temp = l1;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(temp.val);
        while (temp.next != null) {
            sb1.append(temp.next.val);
            temp = temp.next;
        }
        return Long.parseLong(sb1.reverse().toString());
    }

    public static List<Long> getLongList(ListNode l1) {
        ListNode temp = l1;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(temp.val);
        while (temp.next != null) {
            sb1.append(temp.next.val);
            temp = temp.next;
        }
        sb1 = sb1.reverse();
        List<Long> list = new ArrayList<>();
        while (sb1.length() > count) {
            list.add(Long.parseLong(sb1.substring(sb1.length() - count)));
            sb1 = new StringBuilder(sb1.substring(0, sb1.length() - count));
        }
        list.add(Long.parseLong(sb1.toString()));
        return list;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        public ListNode getNext() {
            return next;
        }
    }
}

