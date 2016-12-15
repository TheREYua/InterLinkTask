//реалізація інкапсуляції
public class Number {
    //створюємо змінну n, яка буде доступна тільки в поточному класі
    private int n;

    public int getN() {
        return n; //створюємо setter щоб встановити значення змінної n з інших класів
    }

    public void setN(int n) {
        this.n = n; //створюємо getter щоб отримати доступ до змінної n з інших класів
    }

    public void printAnyNumber(){
        System.out.println("Any number is " + getN()); //метод який виводить число
    }
}
