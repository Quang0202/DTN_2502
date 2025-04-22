package Question04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private LocalDate date;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
    public TapChi() {
        super();
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", date=" + date +
                ", formatter=" + formatter +
                "} " + super.toString();
    }
}
