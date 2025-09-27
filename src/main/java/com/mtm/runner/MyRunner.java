package com.mtm.runner;

import com.mtm.entity.Customer;
import com.mtm.entity.Item;
import com.mtm.repository.CustomerRepository;
import com.mtm.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    CustomerRepository custRepo;
    @Autowired
    ItemRepository itemRepo;

    @Override
    public void run(String... args) throws Exception {
        Customer c1 = new Customer();
        c1.setCustomerId(1001);
        c1.setCustomerName("Mario");

        Customer c2 = new Customer();
        c2.setCustomerId(1002);
        c2.setCustomerName("Goku");

        Item i1= new  Item();
        i1.setItemId(101);
        i1.setItemName("Mashroom");

        Item i2= new  Item();
        i2.setItemId(102);
        i2.setItemName("Mobile");

        Item i3= new  Item();
        i3.setItemId(103);
        i3.setItemName("KEBOARD");

        List<Item> itemList1= Arrays.asList(i1,i2,i3);
        List<Item> itemList2= Arrays.asList(i1,i2);

        c1.setItems(itemList1);
        c2.setItems(itemList2);

        custRepo.save(c1);
        custRepo.save(c2);
    }
}
