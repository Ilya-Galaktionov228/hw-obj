class MainApp {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Стефан", "Кларк");
        Book book1 = new Book("Война и Мир. 1 часть", author1, 1988);
        Book book2 = new Book("Боже, спаси Францию", author2, 2002);

        // Изменяем год публикации второй книги
        book2.setPublishingYear(2013);

        System.out.println("Год издания: " + book2.getPublishingYear());
        System.out.println("Книга: " + book1.getBookTitle() + ", автор: "
                + author1.getAuthorName() + " " + author1.getAuthorSurname()
                + ", год издания: " + book1.getPublishingYear());
        System.out.println("Книга: " + book2.getBookTitle() + ", автор: "
                + author2.getAuthorName() + " " + author2.getAuthorSurname()
                + ", год издания: " + book2.getPublishingYear());
    }
}

class Book {
    private final String bookTitle;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookTitle, Author authorName, int publishingYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}

class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorSurname() {
        return authorSurname;
    }
}