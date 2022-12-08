package HW1.q10;

import java.util.ArrayList;
import java.util.List;

class Main {
    static List<Bill> billList = new ArrayList<>();

    public static void takeOrder(Client client, Order order) {
        client.getOrderList().add(order);
        order.setClient(client);
        Bill bill = new Bill(client, order);
        order.setBill(bill);
        billList.add(bill);
    }

    public static void main(String[] args) {
        // Creating product and clients
        List<Product> productsList = new ArrayList<>();
        List<Client> clientList = new ArrayList<>();

        Product product1 = new Product("Apple MacBook Air", 25000, "Computer", 5);
        Product product2 = new Product("Apple iPhone 14 Pro", 40000, "Phone", 6);
        Product product3 = new Product("Apple Charging Adapter", 800, "Phone", 9);

        productsList.add(product1);
        productsList.add(product2);


        Client client1 = new Client("Cem", 26);
        Client client2 = new Client("Ahmet", 46);
        Client client3 = new Client("Cem", 22);

        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);


        // Ordering section
        takeOrder(client1, new Order(product2, product1));
        takeOrder(client3, new Order(product2));
        takeOrder(client2, new Order(product2));
        takeOrder(client1, new Order(product1));
        takeOrder(client1, new Order(product3, product3));
        takeOrder(client3, new Order(product3));


        // 1.
        System.out.println("----------------");
        System.out.println("Bütün müşteri sayısı: " + clientList.size());

        // 2, 3.
        int productCount = 0;
        int totalPurchaseAmount = 0;

        for (Bill bill : billList) {
            if (bill.getClient().getName().toLowerCase().equals("cem")) {
                productCount += bill.getOrder().getProductList().size();
                if (bill.getClient().getAge() < 30 && bill.getClient().getAge() > 25) {
                    totalPurchaseAmount += bill.getOrder().getTotalPrice();
                }
            }
        }

        System.out.println("İsmi Cem olan müşterilerin aldıkları ürün sayısı: " + productCount);
        System.out.println("İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarı: "
                + totalPurchaseAmount);

        // 4.
        System.out.println("Sistemdeki 1500 TL üzerindeki faturaları listeleyin:");
        for (Bill bill : billList) {
            if (bill.getOrder().getTotalPrice() > 1500) {
                System.out.println("- " + bill.getClient().getName() + ", " + bill.getOrder().getTotalPrice());
            }
        }

    }
}
