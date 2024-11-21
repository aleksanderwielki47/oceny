abstract class Marks {
    abstract void getPercentage();
}

class A extends Marks {
    private int points1;
    private int points2;
    private int points3;

    public A (int points1, int points2, int points3, int points4) {
        this.points1 = points1;
        this.points2 = points2;
        this.points3 = points3;

    }
    @Override
    void getPercentage() {
        int percentA = (points1 + points2 + points3) / 3;
        System.out.println(percentA);
    }
}
class B extends Marks {
    private int points1;
    private int points2;
    private int points3;
    private int points4;

    public B (int points1, int points2, int points3, int points4) {
        this.points1 = points1;
        this.points2 = points2;
        this.points3 = points3;
        this.points4 = points4;

    }

    @Override
    void getPercentage() {
        int percentB = (points1 + points2 + points3 + points4) / 4;
        System.out.println(percentB);
    }
}




public class Main {
    public static void main(String[] args) {
            A a = new A(15,49,57,100);
            B b = new B(75,39,99,20);
            a.getPercentage();
            b.getPercentage();
        }
    }