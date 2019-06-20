package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Objects;

public class Edition {
    private static final Logger LOGGER = Logger.getRootLogger();
    protected static final int CURRENT_YEAR;

    static {
        Calendar calendar = Calendar.getInstance();
        CURRENT_YEAR = calendar.get(Calendar.YEAR);
    }

    private int orderCount;
    private String title;
    private String genre;
    private String language;
    private String printEdition;
    private int pageCount;
    private int printYear;


    public Edition() {
        title = "Title";
        genre = "No genre";
        language = "English";
        printEdition = "No edition";
        pageCount = 1;
        printYear = 1;
    }

    public Edition(String title, int pageCount, String printEdition, int printYear) {
        this();
        setTitle(title);
        setPageCount(pageCount);
        setPrintEdition(printEdition);
        setPrintYear(printYear);
    }

    public void setOrderCount(int orderCount) {
        if (orderCount > 0) {
            this.orderCount = orderCount;
        }
    }

    public void setTitle(String title) {
        if (checkString(title)) {
            this.title = title;
        }
    }

    public void setGenre(String genre) {
        if (checkString(genre)) {
            this.genre = genre;
        }
    }

    public void setLanguage(String language) {
        if (checkString(language)) {
            this.language = language;
        }
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        }
    }

    public void setPrintEdition(String printEdition) {
        if (checkString(printEdition)) {
            this.printEdition = printEdition;
        }
    }

    public void setPrintYear(int printYear) {
        if (printYear > 0 && printYear <= CURRENT_YEAR) {
            this.printYear = printYear;
        }
    }

    public int getOrderCount() {
        return orderCount;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getPrintEdition() {
        return printEdition;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPrintYear() {
        return printYear;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Title: ");
        stringBuilder.append(title);
        stringBuilder.append("\nGenre: ");
        stringBuilder.append(genre);
        stringBuilder.append("\nLanguage: ");
        stringBuilder.append(language);
        stringBuilder.append("\nPrint Edition: ");
        stringBuilder.append(printEdition);
        stringBuilder.append("\nCount of pages: ");
        stringBuilder.append(pageCount);
        stringBuilder.append("\nPrint year: ");
        stringBuilder.append(printYear);
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

        Edition edition = (Edition) obj;

        return checkFields(edition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderCount, title, genre, language, pageCount, printEdition, printYear);
    }

    protected boolean checkFields(Edition edition) {
        return orderCount == edition.orderCount && title.equals(edition.title) && genre.equals(edition.genre)
                && language.equals(edition.language) && pageCount == edition.pageCount
                && printEdition.equals(edition.printEdition) && printYear == edition.printYear;
    }

    protected boolean checkString(String str) {
        if (str == null) {
            LOGGER.warn("NullPointer");
            return false;
        } else if (str.length() == 0) {
            LOGGER.warn("EmptyData");
            return false;
        } else {
            int spaceCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    spaceCount++;
                }
            }
            if (spaceCount == str.length()) {
                LOGGER.warn("Incorrect Data");
                return false;
            }
        }
        return true;
    }
}
