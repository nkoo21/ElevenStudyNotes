package eleven.datastructure.queue;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 队列顺序存储结构 基于数组实现队列
 *
 * 不足：单是顺序存储，出列每次所有元素向前移动，性能较低
 * 循环队列，数组会溢出
 */
public class ElevenArrayQueue<E> {
    final Object[] items;

    /** 队头下标 循环队列的关键*/
    int takeIndex;

    /** 队尾下边*/
    int putIndex;

    /** 元素计数 */
    int count;

    public ElevenArrayQueue(int capacity) {
        this.items = new Object[capacity];
    }

    public int size() {
        return count;
    }

    public boolean offer(E e) {
        return false;
    }

    public E poll() {
        return null;
    }

    public E peek() {
        return null;
    }
}
