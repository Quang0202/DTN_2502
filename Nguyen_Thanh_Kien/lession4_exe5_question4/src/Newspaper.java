public class Newspaper extends Document{
    private int dayOfPublication;

    @Override
    public String toString() {
        return "Newspaper{" +
                "dayOfPublication=" + dayOfPublication +
                ", code='" + code + '\'' +
                ", imprint='" + imprint + '\'' +
                ", totalNumberOfPublications=" + totalNumberOfPublications +
                '}';
    }

    public int getDayOfPublication() {
        return dayOfPublication;
    }

    public void setDayOfPublication(int dayOfPublication) {
        this.dayOfPublication = dayOfPublication;
    }

    public Newspaper() {
    }
}
