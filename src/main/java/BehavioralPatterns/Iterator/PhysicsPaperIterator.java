package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class PhysicsPaperIterator implements PaperIterator{
    private List<Paper> papers;
    private PaperType paperType;
    private int position;
    private List<Paper> paperlist;
    private int listSize;

    public PhysicsPaperIterator(List<Paper> papers) {
        this.papers = papers;
        this.paperType = PaperType.PHYSICS;
        this.position = 0;
        this.paperlist = new ArrayList<>();
        initializePaperList();
    }

    private void initializePaperList() {
        for (Paper p: this.papers) {
            if (p.getPaperType() == PaperType.PHYSICS) {
                this.paperlist.add(p);
            }
        }
        this.listSize = this.paperlist.size();
    }

    @Override
    public boolean hasNext() {
        return this.position < listSize;
    }

    @Override
    public Paper getNext() {
        Paper currentPaper = null;
        if (hasNext()) {
            currentPaper = this.paperlist.get(this.position);
            this.position++;
        }

        return currentPaper;
    }

    @Override
    public void reset() {
        paperlist.clear();
        initializePaperList();
        this.position = 0;
    }
}
