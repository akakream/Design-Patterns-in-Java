package BehavioralPatterns.Iterator;

public interface PaperIterator {
    boolean hasNext();
    Paper getNext();
    void reset();
}
