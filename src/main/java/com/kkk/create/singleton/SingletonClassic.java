package com.kkk.create.singleton;

public class SingletonClassic {

    /**
     * SingletonClassic加载时并不会马上加载SingletonHolder和INIT_WHEN_CALL实例，因此不多占内存。
     * 只有当getInstance()第一次被调用时虚拟机才会加载SingleTonHoler类，才会去初始化INIT_WHEN_CALL对象
     * 能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化时机
     * 参考：https://blog.csdn.net/mnb65482/article/details/80458571
     */
    private static class SingletonHolder {
        /**
         * 虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确地加锁、同步，如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的<clinit>()方法，
         * 其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。如果在一个类的<clinit>()方法中有耗时很长的操作，就可能造成多个进程阻塞(需要注意的是，
         * 其他线程虽然会被阻塞，但如果执行<clinit>()方法后，其他线程唤醒之后不会再次进入<clinit>()方法。同一个加载器下，一个类型只会初始化一次。)，在实际应用中，
         * 这种阻塞往往是很隐蔽的。因此，可以看出INSTANCE在创建过程中是线程安全的，所以说静态内部类形式的单例可保证线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
         */
        private static final SingletonClassic INIT_WHEN_CALL = new SingletonClassic();

        /*static {
            System.out.println("init_single:" + INIT_WHEN_CALL);
        }*/
    }

    private SingletonClassic() {
    }

    public static SingletonClassic getInstance() {
        return SingletonHolder.INIT_WHEN_CALL;
    }
}

class SingleTest {
    public static void main(String[] args) {
        System.out.println("single_main:" + SingletonClassic.getInstance());
    }
}