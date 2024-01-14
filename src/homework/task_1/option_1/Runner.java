package homework.task_1.option_1;

import homework.task_1.option_1.imitation_morning.Breakfast;
import homework.task_1.option_1.imitation_morning.Coffee;
import homework.task_1.option_1.imitation_morning.ReadingNews;

public class Runner {
    public static void main(String[] args) {

        ReadingNews readingNews = new ReadingNews();
        readingNews.setName("Reading News");
        readingNews.setPriority(3);
        readingNews.start();

        Breakfast breakfast = new Breakfast();
        breakfast.setName("Breakfast");
        breakfast.setPriority(8);
        breakfast.start();

        Coffee coffee = new Coffee();
        coffee.setName("Coffee");
        coffee.setPriority(5);
        coffee.start();
    }
}
