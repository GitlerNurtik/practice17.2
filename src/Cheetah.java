public class Cheetah extends Animal{
    public Cheetah(String name, int age) {
        super(name, age);
    }

    public static void method1(String Name){
        System.out.println(Name + "Быстрое животное!");
    }
    public static void method2(int Age, String Name){
        System.out.println(Name + "прожил "+ Age +"лет");

    }
}
