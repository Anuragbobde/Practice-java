package App;
import com.online.restaurant.Customer;
import com.online.restaurant.Vendor;
import com.online.restaurant.Order;

public class Application {
    public static void main(String[] args){
        Customer anurag = new Customer();
        anurag.setName("anurag");
        anurag.setCity("Nagpur");
        anurag.setAddress("Nandanwan Nagpur");
        anurag.setState("Maharashtra");
        anurag.setEmailid("ab@gmail.com");
        anurag.setPhoneNumber(9000000000L);

        System.out.println(" Customer Details: ");
        System.out.println("Name: "+ anurag.getName());
        System.out.println("City: "+ anurag.getCity());
        System.out.println("Address: "+ anurag.getAddress());
        System.out.println("State: "+ anurag.getState());
        System.out.println("Emailid: "+ anurag.getEmailid());
        System.out.println("Phone: "+ anurag.getPhoneNumber());



        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni square Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setRating(5.0);
        haldiram.setCity("Nagpur");
        haldiram.setState("Maharashtra");

        System.out.println("Vendor Details:");
        System.out.println("Name: "+ haldiram.getName());
        System.out.println("Address: "+ haldiram.getAddress());
        System.out.println("Category: "+ haldiram.getCategory());
        System.out.println("Rating: "+ haldiram.getRating());
        System.out.println("State: "+ haldiram.getState());
        System.out.println("Phone: "+ anurag.getPhoneNumber());


        Order order = new Order();
        order.setCustomer(anurag);
        order.setVendor(haldiram);
        order.setTotalAmount(100.0);
        order.setDeliveryAddress("Civil Lines, Nagpur");

        System.out.println("Order Details:");
        System.out.println("Total Amount: "+ order.getTotalAmount());
        System.out.println("OrderDate: "+ order.getOrderDate());
        System.out.println("Order Delivery Address: "+ order.getDeliveryAddress());
    }


}
