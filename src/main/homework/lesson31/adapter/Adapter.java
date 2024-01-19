package main.homework.lesson31.adapter;

public class Adapter implements USB {
    private MemoryCard memoryCard;

    public Adapter(MemoryCard card) {
        this.memoryCard = card;
    }

    @Override
    public void connectionWitchUSBCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }

}
