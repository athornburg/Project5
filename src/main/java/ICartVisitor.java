/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:05 PM
 */
public interface ICartVisitor {
    public String visit(TShirt tshirt);
    public String visit(Pants pants);
    public String visit(Socks socks);
    public String visit(Hat hat);

}
