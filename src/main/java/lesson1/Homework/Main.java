package lesson1.Homework;

import java.util.Arrays;

public class Main {
    //    1. Разобраться с имеющимся кодом;
//    2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды прошедших дистанцию,
//    метод вывода информации обо всех членах команды.
//    3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить команду пройти всю полосу;
//    То есть в итоге должно быть:
//
//    public static void main(String[] args) {
//        Course c = new Course(...); // Создаем полосу препятствий
//        Team team = new Team(...); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
//        team.showResults(); // Показываем результаты
//    }
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Robot robot = new Robot("Flaffy");
        Human human = new Human("Rob");


        Wall wall1 = new Wall(20);
        Treadmill treadmill = new Treadmill(100);

//        wall1.catJump(cat);
//        wall1.humanJump(human);
//        treadmill.catRun(cat);
//        treadmill.humanRun(human);

        Team[] team = {new Cat("Flipper"), new Human("Andrey"), new Cat("Aster"), new Human("Bob")};
        Course[] courses = {new Wall(15), new Treadmill(150), new Treadmill(100), new Wall(5)};


        //team[1].run(courses[1]);










    }
}
