public class Cat {
    String name;
    int age;
    float weight;

    public Cat(){
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Cat(String n, int a, float f){
        this.name = n;
        this.age = a;
        this.weight = f;

    }
}
