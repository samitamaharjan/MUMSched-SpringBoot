package mum.edu.mumschedentrydemo.dao;

import mum.edu.mumschedentrydemo.domain.Entry;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntryDao extends CrudRepository<Entry, Long> {
    @Query("select s from Entry s where s.entryID= :entryID")
    public Entry findEntryByEntryID(@Param("entryID") int entryID);

    @Query("select s from Entry s where s.entryName= :entryName")
    public Entry findEntryByEntryName(@Param("entryName") String entryName);

    @Query("select s from Entry s")
    public List<Entry> getAllEntry();
}
