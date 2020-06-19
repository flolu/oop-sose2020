public class Rectangle extends Figure implements MobileObject {
  private double height;
  private double width;

  Rectangle(double h, double w) {
    super();
    height = h;
    width = w;
  }

  Rectangle(double x, double y, double h, double w) {
    super(x, y);
    height = h;
    width = w;
  }

  double getHeight() {
    return height;
  }

  double getWidth() {
    return width;
  }

  void printXY() {
    super.printXY();
    System.out.println("Height: " + getHeight() + " Width: " + getWidth());
  }

  public void move(double x, double y) {
    this.x += x;
    this.y += y;
  }

  public void increase(double value) {
    width *= value;
    height *= value;
  }

  public void decrease(double value) {
    width *= 1 / value;
    height *= 1 / value;
  }

  void getLocationRelation(Rectangle r) {
    double intersectionY = intersectionYAxis(r);
    double intersectionX = intersectionXAxis(r);

    if (intersectionY < 0 || intersectionX < 0) {
      System.out.println("disjoint");
      return;
    }

    if (intersectionY == r.getHeight() && intersectionY == getHeight() && intersectionX == r.getWidth()
        && intersectionX == getWidth()) {
      System.out.println("same");
      return;
    }

    if (intersectionY == Math.min(r.getHeight(), getHeight()) && intersectionX == Math.min(r.getWidth(), getWidth())) {
      System.out.println("contained");
      return;
    }

    if ((intersectionX == 0 && intersectionY != 0) || (intersectionX != 0 && intersectionY == 0)) {
      System.out.println("aligned");
      return;
    }

    System.out.println("something else");
  }

  private double intersectionYAxis(Rectangle r) {
    return getIntersection(y - getHeight() / 2, y + getHeight() / 2, r.y - r.getHeight() / 2, r.y + r.getHeight() / 2);
  }

  private double intersectionXAxis(Rectangle r) {
    return getIntersection(x - getWidth() / 2, x + getWidth() / 2, r.x - r.getWidth() / 2, r.x + r.getWidth() / 2);
  }

  private double getIntersection(double min1, double max1, double min2, double max2) {
    if (max2 > max1 && min1 > min2)
      return max1 - min1;
    if (max1 > max2 && min2 > min1)
      return max2 - min2;
    return max1 > max2 ? max2 - min1 : max1 - min2;
  }

}
