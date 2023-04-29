package newpkg;
import newpkg.Quadrate;

public class App {
//    public Quadrate enlargeQuad(Quadrate quadrate){
//        var side1 = quadrate.getSide()*2;
//        var res = new Quadrate(side1);
//        return res;
//    }
    public static String getfigureSquare(Geometric quadrate) {
        var square = quadrate.getSquare();
        var name = quadrate.getName();
        var res = "Square of " + name + " is " + square;
        return res;
    }
}
