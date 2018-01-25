package mum.edu.mumschedentrydemo.service.imp;

import mum.edu.mumschedentrydemo.dao.BlockDao;
import mum.edu.mumschedentrydemo.domain.Block;
import mum.edu.mumschedentrydemo.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("blockService")
public class BlockServiceImp implements BlockService {

    @Autowired
    BlockDao blockDAO;

    @Override
    public void save(Block block) {
        blockDAO.save(block);
        return;
    }

    @Override
    public Block getBlockByBlockID(int blockid) {
        return blockDAO.findBlockByBlockID(blockid);
    }

    @Override
    public Block getBlockByBlockName(String blockName) {
        return blockDAO.findBlockByBlockName(blockName);
    }

    @Override
    public List<Block> getAllBlock() {
        return blockDAO.getAllBlock();
    }
}
