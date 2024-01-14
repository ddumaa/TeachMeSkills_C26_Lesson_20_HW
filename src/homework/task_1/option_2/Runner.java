package homework.task_1.option_2;

import homework.task_1.option_2.imitation_morning.Breakfast;
import homework.task_1.option_2.imitation_morning.Coffee;
import homework.task_1.option_2.imitation_morning.ReadingNews;

/**
 * Create a program that simulates the morning: reading the news, breakfast, coffee.
 * Give each thread a name and priority from the config file.
 * Let there be 3 threads.
 * Create and run 3 threads.
 */
public class Runner {
    public static void main(String[] args) {

        new ReadingNews();

        new Breakfast();

        new Coffee();
    }
}
