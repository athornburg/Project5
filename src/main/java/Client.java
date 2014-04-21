/**
 * User: alexthornburg
 * Date: 4/21/14
 * Time: 1:41 PM
 */
public class Client {
    public static void main(String[] args){

        //Initialize Items
        IItem hat1 = new Hat("Blue",false,"fedora",12);
        IItem hat2 = new Hat("red",false,"fedora",12);
        IItem hat3 = new Hat("Blue",false,"baseball",43);
        IItem hat4 = new Hat("red",false,"baseball", 32);

        IItem pant1 = new Pants("32","blue",40);
        IItem pant2 = new Pants("34","blue",40);
        IItem pant3 = new Pants("32","blue",20);
        IItem pant4 = new Pants("32","blue",20);

        IItem socks1 = new Socks("White",10,"FootJoy","S");
        IItem socks2 = new Socks("Black",10,"FootJoy","S");
        IItem socks3 = new Socks("White",12,"Nike","M");
        IItem socks4  = new Socks("White",12,"Nike","S");

        //initalize Cart
        ICartVisitor cartVisitor = new CartVisitorImpl();
        cartVisitor.addItem(hat1);
        cartVisitor.addItem(hat2);
        cartVisitor.addItem(hat3);
        cartVisitor.addItem(hat4);
        cartVisitor.addItem(pant1);
        cartVisitor.addItem(pant2);
        cartVisitor.addItem(pant3);
        cartVisitor.addItem(pant4);
        cartVisitor.addItem(pant1);
        cartVisitor.addItem(socks1);
        cartVisitor.addItem(socks2);
        cartVisitor.addItem(socks3);
        cartVisitor.addItem(socks4);

        cartVisitor.viewCart();


        System.out.println("Checking Out");
        cartVisitor.checkOut();

        cartVisitor.viewCart();

        System.out.println("Canceling Check Out");
        cartVisitor.cancelOrder();

        cartVisitor.viewCart();


    }
}
