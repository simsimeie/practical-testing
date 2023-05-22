package sample.cafekiosk.unit;

import lombok.Getter;
import org.aspectj.weaver.ast.Or;
import sample.cafekiosk.unit.beverage.Beverage;
import sample.cafekiosk.unit.order.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CafeKiosk {
    private List<Beverage> beverageList = new ArrayList<>();

    public void add(Beverage beverage){
        beverageList.add(beverage);
    }

    public void remove(Beverage beverage){
        beverageList.remove(beverage);
    }

    public void clear(){
        beverageList.clear();
    }

    public int calculateTotalPrice(){
        int totalPrice = 0;
        for(Beverage beverage : beverageList){
            totalPrice += beverage.getPrice();
        }
        return totalPrice;
    }

    public Order createOrder(){
        return new Order(LocalDateTime.now(), beverageList);
    }
}
