package my.queue_using_stacks;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MyQueue queue = new MyQueue();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        while (q > 0) {
            String query = bufferedReader.readLine().trim();
            if (query.startsWith("1")) {
                int element = Integer.parseInt(query.split(" ")[1]);
                queue.enqueue(element);
            } else if (query.startsWith("2")) {
                System.out.println(queue.dequeue());
            } else if (query.startsWith("3")) {
                System.out.println(queue.check());
            }
            q--;
        }
    }

    static class MyQueue {

        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public void enqueue(int element) {
            stack1.push(element);
        }

        public int dequeue() {
            if (stack2.empty()) {
                while (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        public int check() {
            if (stack2.empty()) {
                while (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();
        }
    }
}