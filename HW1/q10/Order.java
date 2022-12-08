package HW1.q10;

import java.util.ArrayList;
import java.util.List;

class Order {
    private Client client;
    private List<Product> productList = new ArrayList<>();
    private Bill bill;
    private int totalPrice = 0;

    public Order(Product... products) {
        for (Product p : products) {
            if (p.getStockNumber() == 0) {
                System.out.println(p.getName() + " is out of stock!");
            } else {
                this.productList.add(p);
                p.setStockNumber(p.getStockNumber() - 1);
                totalPrice += p.getPrice();
            }
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
