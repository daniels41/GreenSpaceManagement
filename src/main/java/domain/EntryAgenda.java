package domain;

import java.util.Date;

public class EntryAgenda {

    protected Date startDate;

    public EntryAgenda(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
