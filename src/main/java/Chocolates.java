public class Chocolates implements GiftItems{
    double protiens;
    double weight;
}
class Silk extends Chocolates {
    public double display() {
        return weight;
    }
    public void calculate (int n) {
        weight=20*n;
        protiens=1.0*n;
    }


}

class Nestlie extends Chocolates{
    public double display() {
        return weight;
    }
    public void calculate (int n) {
        weight=10*n;
        protiens=2.0*n;
    }
}
class Fivestar extends Chocolates{
    public double display() {
        return weight;
    }
    public void calculate (int n) {
        weight=5*n;
        protiens=6.0*n;
    }
}

