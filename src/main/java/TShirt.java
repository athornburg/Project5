/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:07 PM
 */
public class TShirt implements IItem{

    private String saleStatus;
    private String graphic;
    private String color;
    private String size;
    private int price;

    public TShirt(String graphic,String color,String size, int price){
        this.graphic = graphic;
        this.color = color;
        this.size = size;
        this.setsaleStatus("Unsold");
    }

    public String getGraphic() {
        return graphic;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String accept(ICartVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getSalesStatus() {
        return saleStatus;
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
