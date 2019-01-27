package figure;

class Triangle extends Figure{
    private int base;
    private int height;

    Triangle(int podstawa, int wysokosc){
        this.base = podstawa;
        this.height = wysokosc;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;

    }
}
