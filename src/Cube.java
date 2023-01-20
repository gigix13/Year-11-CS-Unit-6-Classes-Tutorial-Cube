public class Cube {
    private int side;
    public Cube(){
        side = 1;
    }

    public Cube(int inputNum){
        if (inputNum < 1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        else {
            side = inputNum;
        }
    }
    public int getSide() {
        return side;
    }

    public int setSide(int userSide) {
        if (userSide < 1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        else {
            side = userSide;
            return side;
        }
    }

    public int getSurfaceArea(){
        return (side*side)*6;
    }

    public int getVolume(){
        return side*side*side;
    }

    public String toString(int userNum){
        return "" + userNum;
    }
}