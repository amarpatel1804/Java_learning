import java.util.stream.DoubleStream;

public class constructorStudentChallenge {

}
class product{

    //Data members
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    //Define Property methos for all above data members

    //Get Method
    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    //we can not change itemNo and Name of any product
    //Set method
    public void setPrice(double price){
        this.price=price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }

    //Define Parameterized constructor
    public product(String itemNo,String name,double price,int quantity){
        this.itemNo=itemNo;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public product(String itemNo,String name){
        this.itemNo=itemNo;
        this.name=name;
    }
}
class customer{

    //Data members
    private String custId;
    private String name;
    private String address;
    private String phone;

    //Define Property methos for all above data members

    //Get Method
    public String getCustId(){
        return custId;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }

    //we can not change name and customerId of any product
    //Set method

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    //Define Parameterized constructor
    public customer(String custId,String name,String address,String phone){
        this.custId=custId;
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

    public customer(String custId,String name){
        this.custId=custId;
        this.name=name;
    }
}
