package com.sai.demo.leetcode;

import lombok.Data;

@Data
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
