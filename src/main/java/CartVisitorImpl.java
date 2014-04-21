import java.util.ArrayList;
import java.util.List;

/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:23 PM
 */
public class CartVisitorImpl implements ICartVisitor{

    public List<IItem> itemList;

    public CartVisitorImpl(){
        itemList = new ArrayList<IItem>();
    }

    @Override
    public String visit(TShirt tshirt) {

        return "Visiting TShirt, Size: "+tshirt.getSize()+
                " Color: "+tshirt.getColor()+" Graphic: "+tshirt.getGraphic()
                + "Price :" + tshirt.getPrice()
                +" Status: "
                + tshirt.getSalesStatus();
    }

    @Override
    public String visit(Pants pants) {
        return "Visiting Pants, Size: "+pants.getSize()+
                " Color: "+pants.getColor()+" Price: "+pants.getPrice()
                +" Status: "+ pants.getSalesStatus();
    }

    @Override
    public String visit(Socks socks) {
        return "Visiting Socks, Size: "+socks.getSize()+
                " Color: "+socks.getColor()+" Brand: "+socks.getBrand()+
                " Price: "+socks.getPrice() +" Status: "
                + socks.getSalesStatus();
    }

    @Override
    public String visit(Hat hat) {
        return "Visiting Hat, Color: "+hat.getColor()+
                " Adjustable: "+hat.isAdjustable()+" Type: "+hat.getType()  + "Price :" + hat.getPrice()
                + " Status: "+ hat.getSalesStatus();
    }

    @Override
    public void addItem(IItem item) {
        itemList.add(item);
    }

    @Override
    public void viewCart() {
        for(IItem item:itemList){
            System.out.println(item.accept(this));
        }
    }

    @Override
    public void checkOut() {
        for(IItem item:itemList){
           item.setsaleStatus("Sold");
        }
    }

    @Override
    public void cancelOrder() {
        for(IItem item:itemList){
            item.setsaleStatus("Order Canceled");
        }
    }


}
