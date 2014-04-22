/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:08 PM
 */
public class Socks implements IItem {
    private String saleStatus;
    public String color;
    public int price;
    public String brand;
    public String size;

    public Socks(String color,int price,String brand,String size){
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.setsaleStatus("Unsold");

    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }


    @Override
    public String getSalesStatus() {
        return saleStatus;
    }

    @Override
    public String accept(ICartVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void setsaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    @Override
    public Memento savesaleStatus() {
        return new Memento(saleStatus);
    }

    @Override
    public void restorePrevioussaleStatus(Memento memento) {
        saleStatus = memento.getOriginalsaleStatus();
    }


}
