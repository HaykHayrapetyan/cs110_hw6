package Shapes;

public class Square {
    private int length;
    
    public Square(int value){
        this.length = value;
    }
    public int getArea(){
        return this.length*this.length;
    }
}
