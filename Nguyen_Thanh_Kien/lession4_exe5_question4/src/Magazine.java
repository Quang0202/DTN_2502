public class Magazine extends Document{
    private int numberOfPublications;
    private int monthOfPublications;

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "numberOfPublications=" + numberOfPublications +
                ", monthOfPublications=" + monthOfPublications +
                ", code='" + code + '\'' +
                ", imprint='" + imprint + '\'' +
                ", totalNumberOfPublications=" + totalNumberOfPublications +
                '}';
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    public int getMonthOfPublications() {
        return monthOfPublications;
    }

    public void setMonthOfPublications(int monthOfPublications) {
        this.monthOfPublications = monthOfPublications;
    }

    public Magazine() {
    }
}
