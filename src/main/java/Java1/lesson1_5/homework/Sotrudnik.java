package Java1.lesson1_5.homework;

public class Sotrudnik {
    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String fio;
    private String post;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Sotrudnik(String fio, String post, String email, String telephone, int salary, int age) {
        this.age = age;
        this.fio = fio;
        this.email = email;
        this.post = post;
        this.salary = salary;
        this.telephone = telephone;

    }

    public String getFio() {
        return fio;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void subjecktInformation() {
        System.out.println("FCs-" + fio + ", the post-" + post + ", email-" + email + ", telephone-" + telephone + ", salary=" + salary + ", age=" + age);
    }
    //4. Создать массив из 5 сотрудников.
    //Пример:
    //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //persArray[1] = new Person(...);
    //...
    //persArray[4] = new Person(...);


}
