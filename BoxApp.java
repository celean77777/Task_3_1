public class BoxApp {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Box<Apple> appleBox1 = new Box<>();

        appleBox.addFruit(4, new Apple());
        appleBox1.addFruit(10, new Apple());

        orangeBox.addFruit(7, new Orange());

        System.out.println(appleBox.compare(orangeBox));

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());

        appleBox.emptyTo(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());

    }
}
