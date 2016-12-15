//реалізація наслідування

//клас External_Student унаслідується від Student
public class External_Student extends Student{
    public int money;// нова змінна - скільки грошей платить за навчання на заочному


    //конструктор
    public External_Student(String name, String university, int money) {
        super(name, university);// кажемо що в класі External_Student будуть поля name і university
        this.money = money;// також нове поле money
    }


    //виводимо інформацію про студента заочника
    public void studiyng(){
        System.out.println(name + " навчається в " + university + " і платить за це " + money + " гривень");
    }
}
