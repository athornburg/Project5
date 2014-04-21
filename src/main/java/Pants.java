/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:08 PM
 */
public class Pants implements IItem{
    private String saleStatus;
    private String size;
    private String color;
    private int price;

    public Pants(String size,String color,int price){
        this.size = size;
        this.color = color;
        this.price = price;

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

    @Override
    public String getSalesStatus() {
        return saleStatus;
    }

    @Override
    public String accept(ICartVisitor visitor) {
        return visitor.visit(this);
    }

    public void setsaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Memento savesaleStatus() {
        return new Memento(saleStatus);
    }

    public void restorePrevioussaleStatus(Memento memento) {
        saleStatus = memento.getOriginalsaleStatus();
    }


}
