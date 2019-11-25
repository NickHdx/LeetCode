package com.nick.leetcode;

import lombok.Data;

// https://leetcode.com/problems/add-two-numbers/
// linked list
public class No_2 {
    public static void main(String[] args) {
        No_2 obj = new No_2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        ListNode l1 = new ListNode(9);
//
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(9);
//        l2.next.next.next = new ListNode(9);
//        l2.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next.next.next = new ListNode(9);
//        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        System.out.println(obj.addTwoNumbers(l1, l2));
    }

    // --------------------------v3----------------------
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        int carray = 0;
        ListNode curr = list;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + carray;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carray = sum / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carray > 0) {
            curr.next = new ListNode(carray);
        }
        return list.next;
    }


// --------------------v2---------------------
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        return addTwoNumbers(l1, l2, 0);
//    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        ListNode list = null;
        if (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            if (sum < 10) {
                list = new ListNode(sum);
                carry = 0;
            } else {
                list = new ListNode(sum % 10);
                carry = sum / 10;
            }
            list.next = addTwoNumbers(l1.next, l2.next, carry);
        } else if (l1 == null && l2 != null) {
            int sum = l2.val + carry;
            if (sum < 10) {
                list = new ListNode(sum);
                carry = 0;
            } else {
                list = new ListNode(sum % 10);
                carry = sum / 10;
            }
            list.next = addTwoNumbers(null, l2.next, carry);
        } else if (l1 != null) {
            int sum = l1.val + carry;
            if (sum < 10) {
                list = new ListNode(sum);
                carry = 0;
            } else {
                list = new ListNode(sum % 10);
                carry = sum / 10;
            }
            list.next = addTwoNumbers(l1.next, null, carry);
        } else if (carry != 0) {
            list = new ListNode(carry);
        }
        return list;
    }


    // -------------v1----------------
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        return toListNode(toNumber(l1, 1) + toNumber(l2, 1));
//    }

    private long toNumber(ListNode list, long base) {
        if (list.next != null) {
            return list.val * base + toNumber(list.next, base * 10);
        }
        return list.val * base;
    }

    private ListNode toListNode(long num) {
        if (num < 10) {
            return new ListNode((int) num);
        } else {
            ListNode list = new ListNode((int)(num % 10));
            list.next = toListNode(num / 10);
            return list;
        }
    }
}

@Data
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
