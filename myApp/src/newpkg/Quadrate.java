package newpkg;

public class Quadrate implements Geometric {
        private int side;

        public Quadrate(int side) {
            this.side = side;
        }


    @Override
    public String getName() {
        return "quadrate";
    }

    @Override
    public int getSquare() {
        return side * side;
    }
}

