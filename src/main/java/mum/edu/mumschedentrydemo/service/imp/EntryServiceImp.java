package mum.edu.mumschedentrydemo.service.imp;

import mum.edu.mumschedentrydemo.dao.EntryDao;
import mum.edu.mumschedentrydemo.domain.Entry;
import mum.edu.mumschedentrydemo.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServiceImp implements EntryService {
    @Autowired
    EntryDao entryDao;

    @Override
    public void save(Entry entry) {
        entryDao.save(entry);
        return;
    }

    @Override
    public Entry getEntryByEntryID(int entryid) {
        return entryDao.findEntryByEntryID(entryid);
    }

    @Override
    public Entry getEntryByEntryName(String entryName) {
        return entryDao.findEntryByEntryName(entryName);
    }

    @Override
    public List<Entry> getAllEntry() {
        return entryDao.getAllEntry();
    }
}
