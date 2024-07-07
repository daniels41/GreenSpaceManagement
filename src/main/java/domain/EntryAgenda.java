package domain;

import enums.AgendaStatus;

import java.util.Date;

public class EntryAgenda {

    private Task task;

    private Date startingDate;

    private AgendaStatus status;

    public EntryAgenda(Task task, Date startingDate, AgendaStatus status) {
        this.task = task;
        this.startingDate = startingDate;
        this.status = status;
    }

    public Task getTask() {
        return task;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public AgendaStatus getStatus() {
        return status;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public void setStatus(AgendaStatus status) {
        this.status = status;
    }

}
