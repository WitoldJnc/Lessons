package functions;

import static java.lang.Math.rint;

public class FunctionVarriables {
    private double start;
    private double finish;
    private double step;

    public FunctionVarriables(double start, double finish, double step) {
        this.start = start;
        this.finish = finish;
        this.step = step;
    }

    public void resultWhile() {
        while ((start += step) <= finish) {
            double fx = Math.tan(2 * start) - 3;
            System.out.println(" " + rint(1000.0 * start) / 1000 + ": " + rint(1000.0 * fx) / 1000);
        }
    }

    public void resulDoWhile() {
        do {
            double fx = Math.tan(2 * start) - 3;
            System.out.println(" " + rint(1000.0 * start) / 1000 + ": " + rint(1000.0 * fx) / 1000);
        } while ((start += step) <= finish);
    }

    public void resultFor() {
        for (double i = start; i <= finish; i += step) {
            double fx = Math.tan(2 * i) - 3;
            System.out.println(i + rint(1000.0 * start) / 1000 + ": " + rint(1000.0 * fx) / 1000);
        }
    }

}


