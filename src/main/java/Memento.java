/**
 * Created by john on 4/21/2014.
 */
public class Memento {

        private final String saleStatus;

        public Memento(String originalsaleStatus) {
            saleStatus = originalsaleStatus;
        }

        public String getOriginalsaleStatus() {
            return saleStatus;
        }
}
