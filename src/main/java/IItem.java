/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:07 PM
 */
public interface IItem {
    public String accept(ICartVisitor visitor);
    public int getPrice();

    //Memento Pattern
    public String getSalesStatus();
    void setsaleStatus(String saleStatus);
    Memento savesaleStatus();
    void restorePrevioussaleStatus(Memento memento);

}
