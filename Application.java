package VirtualTechies;

class Circle
{
    double radius;
    
    void calculateArea() //method 1 definition
    {
        double area = 3.14*radius*radius;
        System.out.println("Area of circle: " +area);
    }
    void calculateCircumference() //method 2 definition
    {
        double circum = 2*3.14*radius;
        System.out.println("Circumference of circle: " +circum);
    }
}
class Main
{
    public static void main(String args[])
    {
        Circle c = new Circle(); //creating object of class circle
        c.radius = 5; 
        c.calculateArea(); //invokes calculateArea() with object c
        c.calculateCircumference(); //invokes calculateCircumference() with object c
    }
	#feature202 changes by vivek
	public static void sampleMethod(int a,int b) throws ArithmeticException{
      System.out.println("Hello, this is sample method");
      int c = a/b;
      System.out.println("c:"+c);
 }
  
 public static void main (String[] args){
    DemoClass.sampleMethod(4,2);     
 }
 
}
	
}