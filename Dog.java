public final class Dog extends Animal{

    public String favDogFood;


    public Dog(String favDogFood,String name,int age) {
        this.favDogFood = favDogFood;
        this.age=age;
        super.name=name;
    }

    @Override
    public void makeSound() {
        System.out.println(" haw haw ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.name + '\'' +
                ", age=" + super.age +
                ", favDogFood='" + favDogFood + '\'' +
                '}';
    }
}
