/**
 * 
 */
/**
 * @author Admin
 *
 */
package exampleecapsulation;
public class Person{
	public String name;
	private double weight;
	public void setweight(double weight) {
		if(this.weight<0) System.out.println("Weight can not negative");
		else this.weight= weight;
	}
	public class EncapsulationExist{
	public void main (String []args) {
		Person a= new Person();
		a.name="trang";
	a.setweight(-10);
	}
}
}