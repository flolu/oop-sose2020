abstract class Figure {
  protected double x;
  protected double y;

  Figure() {
    x = 0;
    y = 0;
  }

  Figure(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  void printXY() {
    System.out.println("X: " + getX() + " Y: " + getY());
  }
}