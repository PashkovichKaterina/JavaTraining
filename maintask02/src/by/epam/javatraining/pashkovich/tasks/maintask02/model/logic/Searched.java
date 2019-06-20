package by.epam.javatraining.pashkovich.tasks.maintask02.model.logic;

import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.*;
import org.apache.log4j.Logger;

public class Searched {

    private static final Logger LOGGER = Logger.getRootLogger();

    public static int findPositionPopularEdition(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionEditionBy(library, "order");
        }
        return -1;
    }

    public static int findPositionBigEdition(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionEditionBy(library, "pageCount");
        }
        return -1;
    }

    private static int findPositionEditionBy(Library library, String parametr) {
        int position = 0;
        for (int i = 1; i < library.getSize(); i++) {
            if ((parametr.equals("order")
                    && library.getElement(i).getOrderCount() > library.getElement(position).getOrderCount())
                    || (parametr.equals("pageCount")
                    && library.getElement(i).getPageCount() > library.getElement(position).getPageCount())) {
                position = i;
            }

        }
        return position;
    }

    public static int findPositionPopularBook(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionBookBy(library, "order");
        }
        return -1;
    }

    public static int findPositionBigBook(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionBookBy(library, "pageCount");
        }
        return -1;
    }

    private static int findPositionBookBy(Library library, String parametr) {
        int position = 0;
        for (int i = 1; i < library.getSize(); i++) {
            if (library.getElement(i).getClass() == Book.class
                    && ((parametr.equals("order")
                    && library.getElement(i).getOrderCount() > library.getElement(position).getOrderCount())
                    || (parametr.equals("pageCount")
                    && library.getElement(i).getPageCount() > library.getElement(position).getPageCount()))) {
                position = i;
            }
        }
        return position;
    }

    public static int findPositionPopularAlbum(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionAlbumBy(library, "order");
        }
        return -1;
    }

    public static int findPositionBigAlbum(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionAlbumBy(library, "pageCount");
        }
        return -1;
    }

    private static int findPositionAlbumBy(Library library, String parametr) {
        int position = 0;
        for (int i = 1; i < library.getSize(); i++) {
            if (library.getElement(i).getClass() == Album.class
                    && (parametr.equals("order")
                    && library.getElement(i).getOrderCount() > library.getElement(position).getOrderCount())
                    || (parametr.equals("pageCount")
                    && library.getElement(i).getPageCount() > library.getElement(position).getPageCount())) {
                position = i;
            }
        }
        return position;
    }

    public static int findPositionPopularMagazine(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionMagazineBy(library, "order");
        }
        return -1;
    }

    public static int findPositionBigMagazine(Library library) {
        if (checkReference(library) && library.getSize() > 0) {
            return findPositionMagazineBy(library, "pageCount");
        }
        return -1;
    }

    private static int findPositionMagazineBy(Library library, String parametr) {
        int position = 0;
        for (int i = 1; i < library.getSize(); i++) {
            if (library.getElement(i).getClass() == Magazine.class
                    && (parametr.equals("order")
                    && library.getElement(i).getOrderCount() > library.getElement(position).getOrderCount())
                    || (parametr.equals("pageCount")
                    && library.getElement(i).getPageCount() > library.getElement(position).getPageCount())) {
                position = i;
            }
        }
        return position;
    }

    public static int findPositionByTitle(Library library, String title) {
        if (checkReference(library) && checkReference(title)) {
            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.getElement(i);
                if (edition.getTitle().equals(title)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static boolean checkReference(Object obj) {
        if (obj == null) {
            LOGGER.warn("NullPointer");
            return false;
        }
        return true;
    }
}
