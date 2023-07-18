public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);

    }
    public void method1(){
        String name1 = this.getName();
        System.out.println(name1 + "Прыгучее животное!");
    }
    public void method2(){
        String name2 = this.getName();
        int age = this.getAge();
        System.out.println(name2 + "прожил "+ age +"лет");
    }
}
