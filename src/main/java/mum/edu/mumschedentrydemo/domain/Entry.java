package mum.edu.mumschedentrydemo.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entryID;
    @NotEmpty
    private String entryName;
    private int FPPNum;
    private int MPPNum;
    private Date startDate;
    private Date endDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entry")
    private Set<Block> blockList = new HashSet<Block>();

    public int getEntryID() {
        return entryID;
    }

    public void setEntryID(int entryID) {
        this.entryID = entryID;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public int getFPPNum() {
        return FPPNum;
    }

    public void setFPPNum(int FPPNum) {
        this.FPPNum = FPPNum;
    }

    public int getMPPNum() {
        return MPPNum;
    }

    public void setMPPNum(int MPPNum) {
        this.MPPNum = MPPNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<Block> getBlockList() {
        return blockList;
    }

    public void setBlockList(Set<Block> blockList) {
        this.blockList = blockList;
    }

    public void addBlock(Block block) {
        blockList.add(block);

        block.setEntry(this);
    }

    public String getEntryName() {
        return entryName;
    }
}
