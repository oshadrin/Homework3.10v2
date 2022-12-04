import java.util.ArrayDeque;
import java.util.Queue;

public class Store {

    Queue <String> queue1 = new ArrayDeque<>(5);
    Queue <String> queue2 = new ArrayDeque<>(5);

    public void addPeople(){
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("покупатель: " + i);
        }
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue2.offer("покупатель: " + i);
        }
    }

    public void printQueues() {
        if(!queue1.isEmpty()){
            System.out.println(queue1);
        } else {
            System.out.println("Очередь 1 пустая");
        }
        if(!queue2.isEmpty()){
            System.out.println(queue2);
        } else {
            System.out.println("Очередь 2 пустая");
        }
    }

    public void addBuyer(String name) {
        if(queue1.size() == 5 && queue2.size() == 5){
            System.out.println("Позвать Галю");
            return;
        }
        if (queue1.size() < queue2.size()){
            queue1.add(name);
            System.out.println("Новый покупатель встал в очередь 1");
        }
        if (queue1.size() >= queue2.size()){
            queue2.add(name);
            System.out.println("Новый покупатель встал в очередь 2");
        }
    }
    public void removeBuyer() {
        if (queue1.isEmpty() && queue1.isEmpty()){
            return;
        }
        if(Math.random() < 0.5 && !queue1.isEmpty()){
            queue1.poll();
            System.out.println("Покупатель покинул очередь 1");
        }
        if (Math.random() > 0.5 && !queue2.isEmpty()){
            queue2.poll();
            System.out.println("Покупатель покинул очередь 1");
        }
    }

}
