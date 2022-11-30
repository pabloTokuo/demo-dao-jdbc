package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Department d1 = new Department(1, "Books");
        Seller s1 = new Seller(1, "Pablo", "pablo@gmail.com",new Date(), 3000.0, d1);

        System.out.println(s1);

    }
}
