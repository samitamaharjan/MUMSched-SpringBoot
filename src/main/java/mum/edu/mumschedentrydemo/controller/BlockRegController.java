package mum.edu.mumschedentrydemo.controller;

import mum.edu.mumschedentrydemo.domain.Block;
import mum.edu.mumschedentrydemo.domain.Entry;
import mum.edu.mumschedentrydemo.service.BlockService;
import mum.edu.mumschedentrydemo.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlockRegController {

    @Autowired
    BlockService blockService;
    @Autowired
    EntryService entryService;

    @RequestMapping(value = "/block", method = RequestMethod.GET)
    public String blockRegForm(@ModelAttribute("newBlock")Block block, Model model) {
        List<Block> blockList = new ArrayList<Block>();
        blockList.addAll(blockService.getAllBlock());
        List<String> entryNameList = new ArrayList<String>();

        for (Entry entry : entryService.getAllEntry()) {
            entryNameList.add(entry.getEntryName());
        }

        model.addAttribute("entryNameList", entryNameList);
        model.addAttribute("blockList", blockList);
        model.addAttribute("newBlock", block);
        return "addBlockForm";
    }

    @RequestMapping(value = {"/addnewblock"}, method = RequestMethod.POST)
    public String registerNewBlock(@ModelAttribute("newBLock") Block block, Model model) {
        Entry entry = entryService.getEntryByEntryName(block.getEntryName());
        entry.addBlock(block);
        blockService.save(block);
        return "redirect:/block";
    }
}
