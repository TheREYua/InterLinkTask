//реалізація наслідування
public class Student {

    public String name, university;


    //конструктор для створення і ініціалізації об'єкта класу Student
    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }



    //метод, який виводить інформацію про студента
    public void studiyng(){
        System.out.println(name + " навчається в " + university);
    }
}
