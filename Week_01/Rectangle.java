class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public static void main (String [] args){
        Rectangle rect1 = new Rectangle(6, 4);

        System.out.println("Area of the rectangle is : " + rect1.calculateArea());
        System.out.println("Perimeter of the rectangle is : " + rect1.calculatePerimeter());
    }
}
