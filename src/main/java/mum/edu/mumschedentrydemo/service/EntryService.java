package mum.edu.mumschedentrydemo.service;

import mum.edu.mumschedentrydemo.domain.Entry;

import java.util.List;

public interface EntryService {
    public void save(Entry entry);
    public Entry getEntryByEntryID(int entryid);
    public Entry getEntryByEntryName(String entryName);
    public List<Entry> getAllEntry();
}
