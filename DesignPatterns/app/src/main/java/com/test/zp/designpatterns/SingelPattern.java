package com.test.zp.designpatterns;

/**
 * 单例模式
 */
public class SingelPattern {

    public static void main(String[] args) {

    }


    /**
     * 懒汉式，调用时才会生成单例
     */
    public static class SingelTestClass {

        //volatile保证instance在所有线程中同步
        private static volatile SingelTestClass instance;

        private SingelTestClass() {
        }

        //synchronize 加锁保证所有线程中唯一
        public static synchronized SingelTestClass getInstance() {
            if (instance == null) {
                instance = new SingelTestClass();
            }
            return instance;
        }



    }


    /**
     * 饿汉式,一开始就创建出来放在内存中，线程安全
     */
    public static class SingeTestClass2{

        private SingeTestClass2() {
        }

        private static SingeTestClass2 instance2 = new SingeTestClass2();

        public static SingeTestClass2 getInstance(){
            return instance2;
        }
    }


}
