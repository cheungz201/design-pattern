package com.cheungz.data_structure;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-21 10:01
 * @Version: 1.0.0
 * @Description:
 **/

public class BTNode {

    public BTNode left;
    public BTNode right;
    private Object data;    //    数据域

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BTNode(Object data, BTNode left, BTNode right) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public BTNode(Object data){
        this(data,null,null);
    }

    public BTNode(){}

    public BTNode init() {

        BTNode b = new BTNode('B', null, null);
        BTNode c = new BTNode('C', null, null);
        BTNode a = new BTNode('A', b, c);

        return a;

    }

    public void preorder(BTNode t){
        if ( t == null)
            return;
        System.out.println(t.data);
        preorder(t.left);
        preorder(t.right);
    }

    public static void main(String[] args) {
        BTNode btNode = new BTNode();
        BTNode node = btNode.init();
        btNode.preorder(node);
    }

}
