package com.nick.leetcode;

//https://leetcode.com/problems/number-of-recent-calls/

public class No_933 {
    public static void main(String[] args) {
        No_933 obj = new No_933();
        No_933.RecentCounter recentCounter = obj.new RecentCounter();
        int[] times = new int[] {1, 100, 3001, 3002};
        for (int t : times) {
            System.out.println(recentCounter.ping(t));
        }
    }

    class RecentCounter {
        public RecentCounter() {
        }
        private Queue queue = new Queue(3001);
        public int ping(int t) {
            while (!queue.isEmpty()) {
                if (queue.getHeadElement() < t - 3000) {
                    queue.deQueue();
                } else {
                    break;
                }
            }
            queue.enQueue(t);
            return queue.getSize();
        }

        private class Queue{
            private int[] array;
            private int maxSize;
            private int size = 0;
            private int head = -1;
            private int tail = -1;
            Queue(int maxSize) {
                array = new int[maxSize];
                this.maxSize = maxSize;
            }

            public void enQueue(int e) {
                if (maxSize == size) {
                    throw new RuntimeException("Queue Overflow");
                }
                tail = (++tail) % maxSize;
                array[tail] = e;
                size++;
                if (head < 0) {
                    head = tail;
                }
            }

            public int deQueue() {
                if (size <= 0) {
                    throw new RuntimeException("Queue is empty");
                }
                int temp = head;
                head = (++head) % maxSize;
                size--;
                return array[temp];
            }

            public int getSize() {
                return size;
            }

            public boolean isEmpty() {
                return size <= 0;
            }

            public int getHeadElement() {
                return array[head];
            }

            public int getTailElement() {
                return array[tail];
            }
        }
    }
}
