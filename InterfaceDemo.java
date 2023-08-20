interface EventListener{
	public void performEvent();
}

interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}

interface KeyListener extends EventListener{
	public void keyPressed();
	public void keyReleased();
}

class EventDemo implements MouseListener,KeyListener{
	public void performEvent(){
		System.out.println("event performed");
	}
	public void mouseClicked(){
		System.out.println("Mouse Clicked");
	}
	public void mousePressed(){
		System.out.println("mouse Pressed");
	}

	public void mouseReleased(){
		System.out.println("mouse Released");
	}
	public void mouseMoved(){
		System.out.println("mouse Moved");
	}

	public void mouseDragged(){
		System.out.println("mouse Dragged");
	}
	public void keyPressed(){
		System.out.println("keyPressed");
	}
	public void keyReleased(){
		System.out.println("key Released");
	}

}

public class InterfaceDemo{
	public static void main(String[] args) {
		EventDemo e1=new EventDemo();

		e1.performEvent();
		e1.mouseClicked();
		e1.mousePressed();
		e1.mouseReleased();
		e1.mouseMoved();
		e1.mouseDragged();
		e1.keyPressed();
		e1.keyReleased();
	}
}