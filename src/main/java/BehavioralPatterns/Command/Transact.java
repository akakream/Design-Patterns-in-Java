package BehavioralPatterns.Command;

import java.util.*;

public class Transact {
    private Queue<Order> orderQueue;
    private Stack<Order> orderStack;

    public Transact() {
        this.orderQueue = new LinkedList<>();
        this.orderStack = new Stack<>();
    }

    public void addOrder(Order order) {
        this.orderQueue.add(order);
    }

    public void executeOrders() {
        for (Order order : orderQueue) {
            order.execute();
            this.orderStack.push(order);
        }
        orderQueue.clear();
    }

    public void executeOneOrder() {
        Order order = orderQueue.peek();
        if (!orderQueue.isEmpty()) {
            order.execute();
            orderQueue.remove();
            orderStack.push(order);
        }
    }

    public void undoLastOrder() {
        if (!orderStack.empty()) {
            Order order = orderStack.pop();
            order.undo();
        }
    }
}
