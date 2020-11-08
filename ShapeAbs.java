abstract class Shape{        //Abstract class
	abstract void draw();  // Abstract Method
}
// Now Body of the Abstract class is privided by the Extended class
class Rectangle extends Shape{
	void draw(){System.out.println("Draw the Rectangle");}
}

class Triangle extends Shape{
	void draw(){
		System.out.println("Draw the Triangle");
	}
}

class Main{
	public static void main(String[] args) {
		Shape obj=new Triangle();   // Abstract class is not Instantiated
		Shape obj1=new Rectangle(); // Abstract class is not Instantiated
		      obj.draw();           // Calling the method
		      obj1.draw();
	}
}