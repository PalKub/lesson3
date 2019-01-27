package figure;

class Rectangle extends Figure {
    private int bok1;
    private int bok2;

    Rectangle(int bok1, int bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public double calculateArea() {
        return bok1 * bok2;
    }
}
