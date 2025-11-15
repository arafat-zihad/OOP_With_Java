class Bank{
    public void RateOfInterest(){
        System.out.println("General capacity is 5000");
    }
}

class IBL extends Bank {
    @Override
    public void RateOfInterest(){
        System.out.println("Capacity of storage for IBL is 7000");
    }
}

class NRBC extends Bank {
    @Override
    public void RateOfInterest(){
        System.out.println("Capacity of storage for NRBC is 4000");
    }
}

public class Main{
    public static void main(String[] args) {
        Bank obj = new Bank();
        IBL obj1 = new IBL();
        NRBC obj2 = new NRBC();

        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();
    }
}