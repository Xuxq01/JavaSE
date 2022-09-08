package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法,用于攻击别人
    public void attack(Role role){
        //计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        role.setBlood(remainBlood);
        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头,打了" + role.getName() +
                "一下,造成了" + hurt + "点伤害," + role.getName() + "还剩下了" + remainBlood + "点血量");
    }
}
