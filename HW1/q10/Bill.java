package HW1.q10;

class Bill {
    private Client client;
    private Order order;

    public Bill(Client client, Order order) {
        this.client = client;
        this.order = order;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
