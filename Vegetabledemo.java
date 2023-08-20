abstract class Vegetable{
	String name;
	String color;

}
class Potato extends Vegetable{
	Potato(String name,String color){
		this.name=name;
		this.color=color;
	}

		public String toString(){
			return name;
            return color;
		}	
}
class Brinjal extends Vegetable{
	Brinjal(String name,String color){
		this.name=name;
		this.color=color;
	}
	public String toString(){
			return name;
	}
}
class Tomato extends Vegetable{
	Tomato(String name,String color){
		this.name=name;
		this.color=color;
	}
	public String toString(){
		return name;
	}
}
public class Vegetabledemo{
	public static void main(String[] args) {
		Potato p1=new Potato("Potato","Skin");
		Brinjal b1=new Brinjal("Brinjal","Purple");
		Tomato t1=new Tomato("Tomato","Red");
		System.out.println(p1);
		System.out.println(b1);
		System.out.println(t1);
		
	}
}