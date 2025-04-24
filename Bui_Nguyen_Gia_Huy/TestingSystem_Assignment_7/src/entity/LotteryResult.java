package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LotteryResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date date;
    private int winningNumber;

    public LotteryResult(Date date, int winningNumber) {
        this.date = date;
        this.winningNumber = winningNumber;
    }

    public Date getDate() {
        return date;
    }

    public int getWinningNumber() {
        return winningNumber;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("| %-12s | %-13d |", dateFormat.format(date), winningNumber);
    }
}
