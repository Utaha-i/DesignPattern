package com.example.designpattern.utaha.singleton1;

public class Singleton3 {

    /**
     * volatile关键字的作用：防止重排序。
     */
    private volatile static Singleton3 INSTANCE;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        //外层判断null的作用：其实就是为了减少进入同步代码块的次数，提高效率。
        // 你想一下，其实去了外层的判断其实是可以的，但是每次获取对象都需要进入同步代码块，实在是没有必要。
        if (INSTANCE == null) {
            synchronized (Singleton3.class) {
                //内层判断null的作用：防止多次创建对象。
                // 假设AB同时走到同步代码块，A先抢到锁，进入代码，创建了对象，释放锁，
                // 此时B进入代码块，如果没有判断null，那么就会直接再次创建对象，那么就不是单例的了，
                // 所以需要进行判断null，防止重复创建单例对象。
                if (INSTANCE == null) {
                    INSTANCE = new Singleton3();
                }
            }
        }
        return INSTANCE;
    }

}
