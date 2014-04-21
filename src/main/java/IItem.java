/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:07 PM
 */
public interface IItem {
    public String accept(ICartVisitor visitor);
}
