import Util.HibernateUtil;
import models.User;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by Sergey on 07.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hibernate one to many (XML Mapping)");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = (User) session.load(User.class,1);
        System.out.println(user.getEmail());

//
//        User user = new User();
//        user.setEmail("slayersoft2@mail.ru");
//
//        user.setLogin("slayersoft");
//        user.setAge(24);
//        user.setPassword("password");
//        user.setTelephone("+380977537217");


//        StockDailyRecord stockDailyRecords = new StockDailyRecord();
//        stockDailyRecords.setPriceOpen(new Float("1.2"));
//        stockDailyRecords.setPriceClose(new Float("1.1"));
//        stockDailyRecords.setPriceChange(new Float("10.0"));
//        stockDailyRecords.setVolume(3000000L);
//        stockDailyRecords.setDate(new Date());
//
//        stockDailyRecords.setStock(stock);
//        stock.getStockDailyRecords().add(stockDailyRecords);
//
//        session.save(stockDailyRecords);

        session.getTransaction().commit();

        System.out.println("Done");
    }

}
