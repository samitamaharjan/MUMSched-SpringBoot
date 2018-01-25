package mum.edu.mumschedentrydemo.service;

import mum.edu.mumschedentrydemo.domain.Block;

import java.util.List;

public interface BlockService {
    public void save(Block block);
    public Block getBlockByBlockID(int blockid);
    public Block getBlockByBlockName(String blockName);
    public List<Block> getAllBlock();
}
