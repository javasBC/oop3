import java.awt.*;

public abstract class Cat extends Animal{
    public Color color;

    public Cat(String name , int age , Color color){
        this.name= name;
        this.color=color;
        this.age=age;
    }

    public abstract int lifes();

    @Override
    public String toString() {
        return ""+getClass().getName()+"  "+
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
