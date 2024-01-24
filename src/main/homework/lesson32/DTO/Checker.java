package main.homework.lesson32.DTO;

public class Checker {
    private String checkerColor;
    private Coordinate coordinate; 
    private boolean isQueen; 

    public Checker(String checkerColor, int xCoordinate, int yCoordinate) {
        this.checkerColor = checkerColor;
        coordinate = new Coordinate(xCoordinate, yCoordinate);
        isQueen = false;
    }

    public Checker() {
    }

    public String getColor() {
        return checkerColor;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public boolean isQueen() {
        return isQueen;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate.setCoordinates(coordinate.getX(), coordinate.getY());
    }

    public void setQueen() {
        isQueen = true;
    }
}
