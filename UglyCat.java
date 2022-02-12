import java.awt.*;

public class UglyCat extends Cat{


    public UglyCat(String name, int age, Color color) {
        super(name, age, color);
    }




    @Override
    public int lifes() {
        return 9;
    }
    @Override
    public void makeSound() {
        System.out.println("meoooooooooooooooooooooooooooooow");
    }



}
