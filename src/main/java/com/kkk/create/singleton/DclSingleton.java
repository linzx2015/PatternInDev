package com.kkk.create.singleton;

/**
 * Created by Administrator on 2020/4/28.
 */
public class DclSingleton {

    private static /*volatile JDK1.6增加可解决DCL问题*/ DclSingleton INSTANCE = null;

    private DclSingleton() {
    }

    /**
     * 只有在对象需要被使用时才创建，第一次判断 INSTANCE == null为了避免非必要加锁，当第一次加载时才对实例进行加锁再实例化。
     * 这样既可以节约内存空间，又可以保证线程安全。但是，由于jvm存在乱序执行功能，DCL也会出现线程不安全的情况
     */
    public static DclSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DclSingleton.class) {
                if (INSTANCE == null) {
//                    INSTANCE = new DclSingleton();
//                    1.在堆内存开辟内存空间。
//                    2.在堆内存中实例化SingleTon里面的各个参数。
//                    3.把对象指向堆内存空间。
//                    DCL失效问题：由于cpu抢占时间片进行调度,jvm存在乱序执行的可能，因此存在2还没执行(参数未赋值完成)就先执行了3，如果此时再被切换到线程B上，
//                    由于执行了3，INSTANCE 已经非空了，会被直接拿出来用，这样的话，就会出现异常。
//                    JDK1.6后对变量增加volatile即可：private static volatile DclSingleton INSTANCE = null;
                    INSTANCE = new DclSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
