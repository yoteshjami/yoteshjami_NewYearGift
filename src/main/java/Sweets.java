public class Sweets implements GiftItems{
    double protiens;
    double weight;
}
   class Kova extends Sweets {
       public double display() {
           return weight;
       }
       public void calculate (int n) {
           weight=20*n;
           protiens=1.0*n;
       }


       }

   class Burfy extends Sweets{
       public double display() {
           return weight;
       }
       public void calculate (int n) {
           weight=10*n;
           protiens=2.0*n;
       }

   }
class Kalakand extends Sweets{
    public double display() {
        return weight;
    }
    public void calculate (int n) {
        weight=30*n;
        protiens=2.0*n;
    }

}


