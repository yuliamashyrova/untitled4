public class Girl {

    String name;
    int age;


    public int countSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goToCinema() {
        System.out.println("Go! say" + name);
    }

    public void goToRest(String rest) {
        if (rest.equals("Mac")) {
            System.out.println("No! say" + name);
        } else {
            System.out.println("Go!" + name);
        }
    }

    private void () {

    }

    @Override

    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


