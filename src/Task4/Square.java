package Task4;

public class Square implements Shape {

    double radius;
    double længde;
    Square(double længde) {
        this.længde = længde;
    }

    @Override
    public double getArea() {
        return 3.14 * (længde * længde);
    }
}
