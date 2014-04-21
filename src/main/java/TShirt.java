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

    public TShirt(String graphic,String color,String size){
        this.graphic = graphic;
        this.color = color;
        this.size = size;
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

    public void setsaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Memento savesaleStatus() {
        return new Memento(saleStatus);
    }

    public void restorePrevioussaleStatus(Memento memento) {
        saleStatus = memento.getOriginalsaleStatus();
    }

    public class Memento{
        private final String saleStatus;

        public Memento(String originalsaleStatus) {
            saleStatus = originalsaleStatus;
        }

        public String getOriginalsaleStatus() {
            return saleStatus;
        }
    }
}
