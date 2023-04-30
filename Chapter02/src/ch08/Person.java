package ch08;

public class Person {
    public int height;
    public int weight;
    public String name;
    public int age;

    public Person(int height, int weight, String name, int age) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    public String showPersonInfo() {
        return "키가 " + height + " 이고, 몸무게가 " + weight + " 킬로인 사람의 이름은 " + name + " 이고, 나이는 " + age + " 세 입니다." ;
    }
}