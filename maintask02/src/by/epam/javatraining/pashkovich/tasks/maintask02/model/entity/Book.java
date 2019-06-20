package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import java.util.Objects;

public class Book extends Edition {
    private String author = "No author";

    public Book() {
        super();
    }

    public Book(String editionTitle, int editionPages, String editionPrinter, int editionYear) {
        super(editionTitle, editionPages, editionPrinter, editionYear);
    }

    public void setAuthor(String author) {
        if (checkString(author)) {
            this.author = author;
        }
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Edition: Book\n");
        stringBuilder.append(super.toString());
        stringBuilder.append("\nAuthor: ");
        stringBuilder.append(author);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return checkFields(book) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author);
    }
}
