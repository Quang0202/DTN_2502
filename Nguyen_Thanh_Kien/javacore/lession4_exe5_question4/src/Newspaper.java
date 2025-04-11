public class Newspaper extends Document{
    private int dayOfPublication;

    @Override
    public String toString() {
        return "Newspaper{" +
                "dayOfPublication=" + dayOfPublication +
                ", code='" + super.getCode() + '\'' +
                ", imprint='" + super.getImprint() + '\'' +
                ", totalNumberOfPublications=" + super.getTotalNumberOfPublications() +
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
