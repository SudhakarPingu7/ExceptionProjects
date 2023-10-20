package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car("volvo",50000,"black",true);
		Car car2=new Car("Tata",60000,"We",false);
		Car car3=new Car("toyoto",70000,"green",true);
		Car car4=new Car("mahindra",80000,"blue",false);
		Car car5=new Car("bmw",1100000,"yellow",true);
		Car car6=new Car("benz",900000,"red",true);
		
		ArrayList<Car> carlist=new ArrayList<>();
		carlist.add(car1);
		carlist.add(car2);
		carlist.add(car3);
		carlist.add(car4);
		carlist.add(car5);
		carlist.add(car6);
		List<Car>car0=Arrays.asList(car1,car2,car3,car4,car5,car6);
		List<Car>cc=new ArrayList<>();
		for(Car j:carlist) {
			j.setbrand(j.getcolour());
			//System.out.println(j);
			cc.add(j);
			
		}cc.forEach(x->System.out.println(x));
		//System.out.println(car6);
		//System.out.println(car5);
		List<Car>ac=new ArrayList<>();
		
		for(int i=0;i<carlist.size();i++) {
			if(carlist.get(i).getcolour().equals("red")) {
				ac.add(carlist.get(i));
				
			}
			
		}System.out.println(ac);
		for(int i=0;i<carlist.size();i++) {
			System.out.println(carlist.get(i).getbrand());
		}for(Car carli:carlist) {
			System.out.println(carli.getbrand());
		}carlist.forEach(x->System.out.println(x.getbrand()));
		Car max=carlist.get(0);
		for(int i=0;i<carlist.size();i++) {
			if(max.getprice()<carlist.get(i).getprice()) {
				 max=carlist.get(i);
			}
		}System.out.println(max.getbrand());
		int  min=carlist.get(0).getprice();
		for(Car ca:carlist) {
			if(min>ca.getprice()) {
				min=ca.getprice();
					
			}
		}System.out.println(min);
	
		ArrayList<Car> petrolCars=new ArrayList<>();
		for(Car c:carlist) {
			if(c.getisPetrol()==true) {
				petrolCars.add(c);
			}
	} System.out.println(petrolCars);
	}

}class Car {
	private String brand;
	private int price;
	private String colour;
	private boolean isPetrol;
	
	public void setbrand(String brand) {
		this.brand=brand;
	}public String getbrand() {
		return brand;
		
	}public void setprice(int price) {
		this.price=price;
	}public int getprice() {
		return price;
	}public void setcolour(String colour) {
		this.colour=colour;
	}public String getcolour() {
		return colour;
	}public void setisPetrol(boolean isPetrol) {
		this.isPetrol=isPetrol;
		
	}public boolean getisPetrol() {
		return isPetrol;
	}
	public Car(String brand,int price,String colour,boolean isPetrol) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.isPetrol=isPetrol;
	}public String toString() {
		return brand+" "+price+" "+colour+" "+isPetrol;
	}
}
