public class Main {
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah("Cheetah",10);
        Rabbit rabbit = new Rabbit("Rabbit", 4);
        cheetah.method1();
        cheetah.method2();

        rabbit.method1();
        rabbit.method2();
    }
}