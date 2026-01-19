public class Car{
    private String modelName;
    private int year;
    private double price;

    //modelNmae
    public String getModel(){
        return modelName;
    }
    public void setModel(String modelName){
        this.modelName = modelName;
    }

    //year
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
        if(year > 2025){
            System.out.println("Not allowed");
        } else{
            System.out.println(year);
        }
    }

    //price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }


    void showCardDetails(){
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Price:" + getPrice());
    }
}