package com.example.java.poker.mianxiangduixiang;

public class Poker {
    private String dot;
    private String pic;
//构造函数
    public Poker(String dot, String pic) {
        this.dot = dot;
        this.pic = pic;
    }
//set 和 get 方法
    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    private void test(){
        //测试添加branch
    }


    //重写toString（）

    @Override
    public String toString() {
        return dot+pic;
    }
}
