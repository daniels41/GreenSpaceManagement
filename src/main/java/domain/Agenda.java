package domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<EntryAgenda> entriesAgendaList;

    public Agenda() {
        entriesAgendaList = new ArrayList<>();
    }

    public List<EntryAgenda> getEntriesAgendaList() {
        return entriesAgendaList;
    }

}
