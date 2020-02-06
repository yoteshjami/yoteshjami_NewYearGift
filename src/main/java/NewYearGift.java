import java.util.*;
public class NewYearGift {
    public static void main(String[] args){

        String Sweets[]={"Kova","Burfy","Kalakand"};
        String Chocolates[]={"Silk","Nestlie","Fivestar"};
        String Candies[]={"Narnge","Mint","Pop"};
        int size=3;
        ArrayList<Double> weights=new ArrayList<Double>(size);
        for(int i=0;i<3;i++)
        {
            double totalweight=0;
            String s1=Sweets[i];
            String s2=Chocolates[i];
            String s3=Candies[i];
            System.out.println("\n************************************");
            System.out.println("Items in Gift Pack "+(i+1)+"......");
            System.out.println("\n************************************");
            if (s1=="Kova"){
                Kova obj1=new Kova();
                Random r=new Random();
                int x=r.nextInt(15);
                obj1.calculate(x);
                totalweight+=obj1.display();
                System.out.println(s1+"  :  "+obj1.display());
            }
            else if(s1=="Burfy"){
                Burfy obj2=new Burfy();
                Random r=new Random();
                int x=r.nextInt(15);
                obj2.calculate(x);
                totalweight+=obj2.display();
                System.out.println(s1+"  :  "+obj2.display());
            }
            else{
                Kalakand obj3=new Kalakand();
                Random r=new Random();
                int x=r.nextInt(15);
                obj3.calculate(x);
                totalweight+=obj3.display();
                System.out.println(s1+"  :  "+obj3.display());
            }

            if (s2=="Silk"){
                Silk obj1=new Silk();
                Random r=new Random();
                int x=r.nextInt(15);
                obj1.calculate(x);
                totalweight+=obj1.display();
                System.out.println(s2+"  :  "+obj1.display());
            }
            else if(s2=="Nestlie"){
                Nestlie obj2=new Nestlie();
                Random r=new Random();
                int x=r.nextInt(15);
                obj2.calculate(x);
                totalweight+=obj2.display();
                System.out.println(s2+"  :  "+obj2.display());
            }
            else{
                Fivestar obj3=new Fivestar();
                Random r=new Random();
                int x=r.nextInt(15);
                obj3.calculate(x);
                totalweight+=obj3.display();
                System.out.println(s2+"  :  "+obj3.display());
            }

            if (s3=="Narnge"){
                Narnge obj1=new Narnge();
                Random r=new Random();
                int x=r.nextInt(15);
                obj1.calculate(x);
                totalweight+=obj1.display();
                System.out.println(s3+"  :  "+obj1.display());
            }
            else if(s2=="Mint"){
                Mint obj2=new Mint();
                Random r=new Random();
                int x=r.nextInt(15);
                obj2.calculate(x);
                totalweight+=obj2.display();
                System.out.println(s3+"  :  "+obj2.display());
            }
            else{
                Pop obj3=new Pop();
                Random r=new Random();
                int x=r.nextInt(15);
                obj3.calculate(x);
                totalweight+=obj3.display();
                System.out.println(s3+"  :  "+obj3.display());
            }
            weights.add(totalweight);
            System.out.println("Total Weight of Gift Pack1 is "+totalweight);
        }
        ArrayList<String> gifts=new ArrayList<String>(Arrays.asList("Gift1","Gift2","Gift3"));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("The Gift Packs Sorted Based on Weights");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        while (!weights.isEmpty()){
            int min=weights.indexOf(Collections.min(weights));
            String w=String.format("%,.2f",weights.get(min));
            System.out.println(gifts.get(min)+"  :  "+w);
            weights.remove(weights.get(min));
            gifts.remove(min);
        }
    }
}


