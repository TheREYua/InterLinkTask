public class Main {
    public static void main(String args[]){
        //реалізація інкапсуляції
        Number a = new Number();//створюємо об'єкт класу Number
        a.setN(123);//встановлюємо його значення
        a.printAnyNumber();//виводим значення на екран

        //реалізація наслідування
        Student student1 = new Student("John", "LP");// створюємо об'єкт класу Student і передаємо дані про нього в конструктор
        student1.studiyng();//викликаємо метод для студента1

        External_Student student2 = new External_Student("Chris", "LP", 10000);//створюємо об'єкт класу External_Student і передаємо дані про нього в конструктор
        student2.studiyng();//викликаємо метод для студента2

        //реалізація поліморфізму
        Circle circle = new Circle(5);
        circle.square();

        Rectangle rect = new Rectangle(5, 4);
        rect.square();
    }
}