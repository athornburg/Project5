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

    public Hat(String color,boolean adjustable,String type){
        this.color = color;
        this.adjustable = adjustable;
        this.type = type;
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
