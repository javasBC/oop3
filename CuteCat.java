import java.awt.*;

public class CuteCat extends Cat{



    public CuteCat(String name , int age , Color color){
        super(name,age,color);
    }



    @Override
    public void makeSound() {
        System.out.println("funky mew");
    }

    @Override
    public int lifes() {
        return 7;
    }

    //@Override
    //public String toString() {
    //    return "CuteCat{" +
    //            "name='" + this.name + '\'' +
    //            ", age=" + this.age +
    //            ", color=" + this.color +
    //            '}';
    //}
}
