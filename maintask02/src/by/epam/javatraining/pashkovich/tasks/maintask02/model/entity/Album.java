package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import java.util.Objects;

public class Album extends Edition {
    private int imageCount = 1;
    private String artEditor = "No editor";

    public Album() {
        super();
    }

    public Album(String editionTitle, int editionPages, String editionPrinter, int editionYear) {
        super(editionTitle, editionPages, editionPrinter, editionYear);
    }

    public void setImageCount(int imageCount) {
        if (imageCount > 0) {
            this.imageCount = imageCount;
        }
    }

    public void setArtEditor(String artEditor) {
        if (checkString(artEditor)) {
            this.artEditor = artEditor;
        }
    }

    public int getImageCount() {
        return imageCount;
    }

    public String getArtEditor() {
        return artEditor;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Edition: Album\n");
        stringBuilder.append(super.toString());
        stringBuilder.append("\nCount of images: ");
        stringBuilder.append(imageCount);
        stringBuilder.append("\nArt editor: ");
        stringBuilder.append(artEditor);
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

        Album album = (Album) obj;

        return checkFields(album) && imageCount == album.imageCount && artEditor.equals(album.artEditor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), imageCount, artEditor);
    }
}
