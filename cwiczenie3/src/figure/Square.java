package figure;


class Square extends Rectangle{
    private double side;

    Square(int side){
        super(side, side);
    }

    /*Square(double side) throws RuntimeException {
        if (side <= 0) {
            throw new RuntimeException("Wrong number");
        }
        this.side = side;
    }*/




    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Square) return false;
        Square square = (Square) o;
        return square.side == side;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(side).intValue();
    }
}
