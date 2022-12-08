package HW1.q10;

class Product {
    private String name;
    private int price;
    private String category;
    private int stockNumber;

    public Product(String name, int price, String category, int stockNumber) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockNumber = stockNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }
}

