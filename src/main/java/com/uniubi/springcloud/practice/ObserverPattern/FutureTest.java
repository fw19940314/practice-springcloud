package com.uniubi.springcloud.practice.ObserverPattern;

import java.util.concurrent.*;

/**
 * @Auther: jerry.feng
 * @Date: 2019/7/25
 * @Description:
 */
public class FutureTest {
    public static void main(String[] args) {
        final ExecutorService exec = Executors.newFixedThreadPool(10);
        try {

            Future<String> future = exec.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(4000);
                    return "执行完成!";
                }
            });
            String obj = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println("任务成功返回:" + obj);
        } catch (TimeoutException ex) {
            System.out.println("处理超时啦....");
        } catch (Exception e) {
            System.out.println("处理失败.");
        }
        // 关闭线程池
        exec.shutdown();
    }
}
