package by.epam.javatraining.pashkovich.tasks.maintask02.model.logic;

import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.*;
import org.apache.log4j.Logger;

public class Counter {
    private static final Logger LOGGER = Logger.getRootLogger();

    public static int calcBookCount(Library library) {
        int count = -1;
        if (checkReference(library)) {
            count = 0;
            for (int i = 0; i < library.getSize(); i++) {
                if (library.getElement(i).getClass() == Book.class) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static int calcAlbumCount(Library library) {
        int count = -1;
        if (checkReference(library)) {
            count = 0;
            for (int i = 0; i < library.getSize(); i++) {
                if (library.getElement(i).getClass() == Album.class) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static int calcMagazineCount(Library library) {
        int count = -1;
        if (checkReference(library)) {
            count = 0;
            for (int i = 0; i < library.getSize(); i++) {
                if (library.getElement(i).getClass() == Magazine.class) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static int calcBookCountByAuthor(Library library, String author) {
        int count = -1;
        if (checkReference(library) && checkReference(author)) {
            count = 0;
            for (int i = 0; i < library.getSize(); i++) {
                if (library.getElement(i).getClass() == Book.class) {
                    Book book = (Book) library.getElement(i);
                    if (book.getAuthor().equals(author)) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }

    public static int calcAlbumCountByArtEditor(Library library, String artEditor) {
        int count = -1;
        if (checkReference(library) && checkReference(artEditor)) {
            count = 0;
            for (int i = 0; i < library.getSize(); i++) {
                if (library.getElement(i).getClass() == Album.class) {
                    Album album = (Album) library.getElement(i);
                    if (album.getArtEditor().equals(artEditor)) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }

    public static int calcMagazineCountByEditor(Library library, String editor) {
        int count = -1;
        if (checkReference(library) && checkReference(editor)) {
            count = 0;
            for (int i = 0; i < library.getSize(); i++) {
                if (library.getElement(i).getClass() == Magazine.class) {
                    Magazine magazine = (Magazine) library.getElement(i);
                    if (magazine.getEditor().equals(editor)) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }

    public static int calcEditionCountByGenre(Library library, String genre) {
        if (checkReference(library) && checkReference(genre)) {
            return calcEditionCountBy(library, "genre", genre);
        }
        return -1;
    }

    public static int calcEditionCountByLanguage(Library library, String language) {
        if (checkReference(library) && checkReference(language)) {
            return calcEditionCountBy(library, "language", language);
        }
        return -1;
    }

    public static int calcEditionCountByPrintEdition(Library library, String printEdition) {
        if (checkReference(library) && checkReference(printEdition)) {
            return calcEditionCountBy(library, "printEdition", printEdition);
        }
        return -1;
    }

    public static int calcEditionCountByPrintYear(Library library, int printYear) {
        if (checkReference(library)) {
            return calcEditionCountBy(library, "printYear", printYear);
        }
        return -1;
    }

    private static int calcEditionCountBy(Library library, String parametr, Object value) {
        int count = 0;
        for (int i = 0; i < library.getSize(); i++) {
            Edition edition = library.getElement(i);
            if (parametr.equals("genre") && edition.getGenre().equals(value)
                    || parametr.equals("language") && edition.getLanguage().equals(value)
                    || parametr.equals("printEdition") && edition.getPrintEdition().equals(value)
                    || parametr.equals("printYear") && edition.getPrintYear() == (int) value) {
                ++count;

            }
        }
        return count;
    }

    private static boolean checkReference(Object obj) {
        if (obj == null) {
            LOGGER.warn("NullPointer");
            return false;
        }
        return true;
    }
}
