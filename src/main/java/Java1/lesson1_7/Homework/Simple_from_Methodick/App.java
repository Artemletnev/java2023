package Java1.lesson1_7.Homework.Simple_from_Methodick;

public class App {
    public static void main(String[] args) {
        CAt cat1 = new CAt("Bars", 123);
        CAt cat2 = new CAt("Frano", 123);
        CAt cat3 = new CAt("Hruno", 123);
        CAt cat4 = new CAt("Vivi", 1200);
        Plate plate1 = new Plate(1000);
        Plate plate2 = new Plate(1300);
        Warehouse warehouse = new Warehouse(50);
        warehouse.info();




        CAt[] cats = new CAt[]{cat1,cat2,cat3,cat4 };

        for (CAt cat : cats ){
            cat.eat(plate1);
            cat.info(cat);
        }
        plate1.info();

        plate1.addFood(warehouse);
        warehouse.info();
        plate1.info();



    }
}

//+1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//(например, в миске 10 еды, а кот пытается покушать 15-20).

//+2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//удалось покушать (хватило еды), сытость = true.

//+3. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//наполовину сыт (это сделано для упрощения логики программы).

//+4. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//потом вывести информацию о сытости котов в консоль.

//5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
