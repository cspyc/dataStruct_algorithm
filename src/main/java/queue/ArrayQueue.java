package queue;

import java.util.NoSuchElementException;

/**
 * @author Pi
 * @date 2021-04-28 12:34
 */
public class ArrayQueue<T> {
    private int maxSize;//队列保存最多元素个数
    private int head = -1;//头指针，指向队列头的前一个位置
    private int rear = -1;//尾指针，指向队列尾部(队列的最后一个数据)
    private Object[] elements;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        elements = new Object[maxSize];
    }

    public boolean isEmpty() {
        return head == rear;
    }

    public T get() throws Exception {
        if (isEmpty()) {
            throw new NoSuchElementException("队列为空，无法取出元素");
        }
        head++;
        return (T) elements[head];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new RuntimeException("队列已满，无法添加元素");
        }
        rear++;
        elements[rear] = element;
    }

    public Object[] list() {
        return elements;
    }

    public T head() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法取出头元素");
        }
        return (T) elements[head + 1];
    }
}
