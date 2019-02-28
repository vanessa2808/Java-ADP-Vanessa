package mainline;
import java.awt.*;
public class ButtonTest extends Frame
{
	Button b1= new Button("red");
	Button b2= new Button("green");
	Button b3= new Button("blue");
	Button b4= new Button("yellow");
public ButtonTest(String title) 
{
	super(title);
	setLayout(new FlowLayout());
	add(b1);
	add(b2);
	add(b3);
	add(b4);
}
public static void main(String[]args) 
{
	ButtonTest sc= new ButtonTest("Button");
	sc.setSize(300,200);
	sc.show();
}
}
