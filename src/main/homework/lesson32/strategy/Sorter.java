package main.homework.lesson32.strategy;

public class Sorter {
    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        this.sortStrategy.sort();
    }
}
