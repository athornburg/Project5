/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:23 PM
 */
public class CartVisitorImpl implements ICartVisitor{

    @Override
    public String visit(TShirt tshirt) {

        return "Visiting TShirt, Size: "+tshirt.getSize()+
                " Color: "+tshirt.getColor()+" Graphic: "+tshirt.getGraphic();
    }

    @Override
    public String visit(Pants pants) {
        return "Visiting Pants, Size: "+pants.getSize()+
                " Color: "+pants.getColor()+" Price: "+pants.getPrice();
    }

    @Override
    public String visit(Socks socks) {
        return "Visiting Socks, Size: "+socks.getSize()+
                " Color: "+socks.getColor()+" Brand: "+socks.getBrand()+
                " Price: "+socks.getPrice();
    }

    @Override
    public String visit(Hat hat) {
        return "Visiting Hat, Color: "+hat.getColor()+
                " Adjustable: "+hat.isAdjustable()+" Type: "+hat.getType();
    }
}
