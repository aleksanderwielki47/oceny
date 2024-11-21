abstract class Marks {
    abstract void getPercentage();
}

class A extends Marks {
    int points1 = 35;
    int points2 = 100;
    int points3 = 78;
    @Override
    void getPercentage() {
        int percentA = (points1 + points2 + points3) / 3;
        System.out.println(percentA);
    }
}
class B extends Marks {
    int points1 = 35;
    int points2 = 100;
    int points3 = 78;
    int points4 = 37;

    @Override
    void getPercentage() {
        int percentB = (points1 + points2 + points3 + points4) / 4;
        System.out.println(percentB);
    }
}




public class Main {
    public static void main(String[] args) {
            A a = new A();
            B b = new B();
            a.getPercentage();
            b.getPercentage();
        }
    }