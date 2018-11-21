package knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class KnightMain {
    public static void main(String[] args) throws QuestException {
        System.out.println(".................... 0 ............................");
        // Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        System.out.println(".................... 1 ............................");
        // Получение компонента knight
        Knight knight = (Knight) context.getBean("knight");
        System.out.println(".................... 2 ............................");
        // Использование компонента knight
        knight.embarkOnQuest();
    }
}