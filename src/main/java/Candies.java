public class Candies implements GiftItems{
    double protiens;
    double weight;
}
class Narnge extends Candies{
    public double display() {
        return weight;
    }
    public void calculate (int n) {
        weight=10*n;
        protiens=1.0*n;
    }


}

class Mint extends Candies{
    public double display() {
        return weight;
    }
    public void calculate (int n) {
        weight=15*n;
        protiens=2.0*n;
    }
}
class Pop extends Candies{
    public double display() {
        return weight;
    }
    public void calculate (int n) {
        weight=5*n;
        protiens=2.0*n;
    }
}
