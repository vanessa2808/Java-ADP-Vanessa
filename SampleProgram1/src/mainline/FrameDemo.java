package mainline;
import java.awt.*;
public class FrameDemo extends Frame
{
	public FrameDemo(String title)
	{
		super(title);
	}
	public static void main(String args[]) 
	{
		FrameDemo f= new FrameDemo("I have been Frameed!!!");
		f.setSize(400,500);
		f.setVisible(true);
	}
}
