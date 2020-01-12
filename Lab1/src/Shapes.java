// to represent a geometric shape
interface IShape {
    double getArea();
    // TODO: this is how todo's work
}

/*
    NOTES:
    - Difference between Class/object and instance
    - 3 parts to documentation of a method/function
        - Purpose Statement
        - Signature
        - TESTS
 */
// to represent a circle
class Circle implements IShape {
    // fields
    int x;
    int y;
    int rad;

    /// constructor(s)
    Circle(int x, int y, int rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    /**
     * Calculates area of a circle.
     * () -> Double
     * @return pi * r^2 as double
     */
    public double getArea() {
        return Math.PI * rad * rad;
    }
}

// to represent a rectangle
class Rect implements IShape {
    int x;
    int y;
    int w;
    int h;

    Rect(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public double getArea() {
        return w * h;
    }
}


// to represent a combined shape
class Combo implements IShape {
    IShape top;
    IShape bot;

    Combo(IShape top, IShape bot) {
        this.top = top;
        this.bot = bot;
    }

    public double getArea() {
        return this.top.getArea() + this.bot.getArea();
    }
}


// to represent examples and tests for shapes
class ExamplesShapes {
    public static void main(String args[]) {
        IShape circle = new Circle(50, 50, 50);
        IShape rleft = new Rect(20, 20, 20, 20);
        IShape rBot = new Rect(20, 60, 60, 20);

        IShape addMouth = new Combo(rBot, circle);
        IShape addLeftEye = new Combo(rleft, addMouth);
        IShape face = new Combo(new Rect(60, 20, 20, 20), addLeftEye);

        System.out.println(test1(addMouth)+ "\n" + test1(circle) + "\n" + test1(rBot));
    }

    public static double test1(IShape A){
        return A.getArea();
    }
}