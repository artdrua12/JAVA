package main.homework.lesson31.fasade;

public class ComputerFasade {

    private Computer computer;

    public ComputerFasade(Computer computer) {
        this.computer = computer;
    }

    public void turnOn() {
        this.computer.startPower();
        this.computer.sheckSystem();
        this.computer.sound();
        this.computer.startWindows();
    }

    public void turnOff() {
        this.computer.endWindows();
        this.computer.endPower();
    }
}
