package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import java.util.Calendar;
import java.util.Objects;

public class Magazine extends Edition {

    private static final int CURRENT_MONTH;
    private static final int MONTH_COUNT = 12;

    private String editor = "No editor";
    private int printMonth = 1;
    private int magazineNumber = 1;

    static {
        Calendar calendar = Calendar.getInstance();
        CURRENT_MONTH = calendar.get(Calendar.MONTH);
    }

    public Magazine() {
        super();
    }

    public Magazine(String editionTitle, int editionPages, String editionPrinter, int editionYear) {
        super(editionTitle, editionPages, editionPrinter, editionYear);
    }

    public void setEditor(String editor) {
        if (checkString(editor)) {
            this.editor = editor;
        }
    }

    public void setPrintMonth(int printMonth) {
        if (printMonth > 0 && (getPrintYear() != CURRENT_YEAR && printMonth <= MONTH_COUNT)
                || (getPrintYear() == CURRENT_YEAR && printMonth <= CURRENT_MONTH + 1)) {
            this.printMonth = printMonth;
        }
    }

    public void setMagazineNumber(int magazineNumber) {
        if (magazineNumber > 0) {
            this.magazineNumber = magazineNumber;
        }
    }

    public String getEditor() {
        return editor;
    }

    public int getPrintMonth() {
        return printMonth;
    }

    public int getMagazineNumber() {
        return magazineNumber;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Edition: Magazine\n");
        stringBuilder.append(super.toString());
        stringBuilder.append("\nEditor: ");
        stringBuilder.append(editor);
        stringBuilder.append("\nPrint month: ");
        stringBuilder.append(printMonth);
        stringBuilder.append("\nNumber of magazine: ");
        stringBuilder.append(magazineNumber);
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

        Magazine magazine = (Magazine) obj;

        return checkFields(magazine) && printMonth == magazine.printMonth && editor.equals(magazine.editor)
                && magazineNumber == magazine.magazineNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), editor, printMonth, magazineNumber);
    }
}
