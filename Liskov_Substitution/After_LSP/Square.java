class Square extends Shape {
    protected int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}