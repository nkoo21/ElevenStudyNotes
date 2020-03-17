package eleven.datastructure.queue;

import java.util.*;

/**
 * 循环队列简单实现
 */
public class ElevenArrayQueue<E> {
    final Object[] items;

    /**
     * 队头下标
     */
    int front;

    /**
     * 队尾下标
     */
    int rear;

    /**
     * 元素计数
     */
    int count;

    public ElevenArrayQueue(int capacity) {
        this.items = new Object[capacity];
    }

    public int size() {
        return count;
    }

    public void enqueue(E e) {
        if (count == items.length) {
            throw new IllegalMonitorStateException("queue already full");
        }
        items[rear] = e;
        if (++rear == items.length) rear = 0;//数组末尾
        count++;
    }

    public E dequeue() {
        if(count == 0) return null;
        E e = (E) items[front];
        items[front] = null;
        if (++front == items.length) front = 0;//数组末尾
        count--;
        return e;
    }

    public static void main(String[] args) {
        ElevenArrayQueue<Integer> queue = new ElevenArrayQueue<Integer>(10);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(Arrays.toString(queue.items));
        }
        for (int i = 0; i < 5; i++) {
            queue.dequeue();
            System.out.println(Arrays.toString(queue.items));
        }
        for (int i = 0; i < 4; i++) {
            queue.enqueue(i);
            System.out.println(Arrays.toString(queue.items));
        }
        for (int i = 0; i < 2; i++) {
            queue.enqueue(i);
            System.out.println(Arrays.toString(queue.items));
        }
    }
}
