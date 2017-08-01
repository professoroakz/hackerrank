class MyBook extends Book {
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    void display() {
        System.out.format("Title: %s\nAuthor: %s\nPrice: %d", title, author, price);
    }
}
