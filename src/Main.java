public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("Ira", 20);
        Girl girl1 = new Girl("Kat", 22);

        System.out.println(girl.toString());
        System.out.println(girl1.toString());

        System.out.println(girl.name);
        System.out.println(girl.age);

        girl.goToCinema();
        girl1.goToRest("Mac");
        System.out.println(girl1.countSum(1, 2, 3, 4, 5));
        girl1 = null;
        System.gc();
    }
}
