@ToString
public class Ex23 {
    @ToString(value = true) // поле будет включено в ToString
    String name;

    @ToString(value = false) // поле будет исключено из ToString
    int age;

    public void start() {
        System.out.println("Поле name аннотировано @ToString! Значение: " + name);
        System.out.println("Поле age аннотировано @ToString! Значение: " + age);
    }
}
