package Collections;
//Write a class called Command that contains a String and has a
//method operation( ) that displays the String. Write a second class with a method that fills
//a Queue with Command objects and returns it. Pass the filled Queue to a method in a
//third class that consumes the objects in the Queue and calls their operation( ) methods.
import java.util.*;

public class Exercise27 {
        static class Command {
            private String string;

            Command(String string) {
                this.string = string;
            }

            void operation() {
                System.out.println(string);
            }
        }

   static class CommandProducer {

        Queue<Command> fillQueue() {

            Queue<Command> queue = new LinkedList<>();

            queue.offer(new Command("Command 1"));
            queue.offer(new Command("Command 2"));
            queue.offer(new Command("Command 3"));
            queue.offer(new Command("Command 4"));
            queue.offer(new Command("Command 5"));

            return queue;
        }
    }

   static class CommandConsumer {

        void consume(Queue<Command> queue) {

            while (!queue.isEmpty()) {
//.poll = Retrieves and removes the head of this queue,
// or returns null if this queue is empty.
                Command command = queue.poll();

                command.operation();
            }
        }
    }

            public static void main(String[] args) {

                CommandProducer producer = new CommandProducer();

                Queue<Command> queue = producer.fillQueue();

                CommandConsumer consumer = new CommandConsumer();

                consumer.consume(queue);
            }
    }

