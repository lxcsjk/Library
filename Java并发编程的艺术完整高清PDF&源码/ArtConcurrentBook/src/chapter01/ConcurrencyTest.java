package chapter01;

/**
 * �����͵��߳�ִ�в���
 * 
 * @author tengfei.fangtf
 * @version $Id: ConcurrencyTest.java, v 0.1 2014-7-18 ����10:03:31 tengfei.fangtf Exp $
 */
public class ConcurrencyTest {

    /** ִ�д��� */
    private static final long count = 10000l;

    public static void main(String[] args) throws InterruptedException {
        //��������
        concurrency();
        //���̼߳���
        serial();
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
                System.out.println(a);
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        thread.join();
        long time = System.currentTimeMillis() - start;
        System.out.println("concurrency :" + time + "ms,b=" + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms,b=" + b + ",a=" + a);
    }

}
