package com.uniubi.springcloud.practice.future;

/**
 * @Auther: jerry.feng
 * @Date: 2019/9/2
 * @Description:
 */
public class FutureTE {
    static int count = 0;

    public static void main(String[] args) throws Exception {

    }

    public static void test() throws Exception {

        System.out.println("count===" + count);
        if (true) {
            try {
                Thread.sleep(200);
                count++;
                if (count <= 3) {
                    test();
                    System.out.println("inner");
                } else {
                    System.out.println("get lock time");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            throw new Exception("112312");
        }

    }
}
