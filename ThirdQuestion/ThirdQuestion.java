package com.example.administrator.swort_refer_to_offer;

import java.util.ArrayList;
import java.util.Stack;

public class ThirdQuestion {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer>  list = new ArrayList<>();
        if(listNode == null){
            return list;
        }
        Stack<ListNode> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        whiel(!stack.isEmpty()) {
            list.add(stack.pop().value);
        }
        return list;
    }

}