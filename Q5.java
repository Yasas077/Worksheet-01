class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

public class Q5  {
        public static void main(String[] args) {
            double ri = 3.0;
            double ro = 5.0;

            Circle inCircle = new Circle(ri);
            Circle outCircle = new Circle(ro);

            double circularArea = outCircle.computeArea() - inCircle.computeArea();

            System.out.println("The area of the circular region is: " + circularArea);
        }
    }

