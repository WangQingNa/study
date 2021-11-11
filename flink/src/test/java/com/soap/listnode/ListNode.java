package com.soap.listnode;

import lombok.Data;

/**
 * @author yangfuzhao on 2021/11/3.
 */
@Data
public class ListNode {
    int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
