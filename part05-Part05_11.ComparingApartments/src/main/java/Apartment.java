
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < this.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int diff = (this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare);
        if (diff < 0) {
            return diff * -1;
        }
        return diff;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.squares * this.princePerSquare) > (compared.squares * compared.princePerSquare)) {
            return true;
        }
        return false;
    }
}
