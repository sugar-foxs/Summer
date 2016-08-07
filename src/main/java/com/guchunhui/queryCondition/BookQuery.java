package com.guchunhui.queryCondition;

/**
 * Created by gch on 16-8-6.
 */
public class BookQuery {
    private int father;
    private int son;

    public int getFather() {
        return father;
    }

    public void setFather(int father) {
        this.father = father;
    }

    public int getSon() {
        return son;
    }

    public void setSon(int son) {
        this.son = son;
    }

    @Override
    public String toString() {
        return "BookQuery{" +
                "father=" + father +
                ", son=" + son +
                '}';
    }
}
