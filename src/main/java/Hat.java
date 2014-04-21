/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:08 PM
 */
public class Hat implements IItem {
    private String saleStatus;
    public String color;
    public boolean adjustable;
    public String type;
    public int price;

    public Hat(String color,boolean adjustable,String type, int price){
        this.color = color;
        this.adjustable = adjustable;
        this.type = type;
        this.price = price;
        this.setsaleStatus("Unsold");
    }

    public String getColor() {
        return color;
    }

    public boolean isAdjustable() {
        return adjustable;
    }

    public String getType() {
        return type;
    }

    @Override
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
