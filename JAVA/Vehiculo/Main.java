
public class Main {

	public static void main(String[] args) {
		
		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		
		Car car = new Car();
		
		car.go();
		
		Bicycle bike = new Bicycle();
                
                car.go();
		bike.stop();
                
                Motocicleta Mot = new Motocicleta ();
                
                Mot.go();
                car.stop();
                
                Patineta Patin = new Patineta ();
                
                Patin.go();
                Mot.stop();
		
		System.out.println(car.door);
		System.out.println(bike.pedals); 
                System.out.println(Mot.address);
                System.out.println(Patin.board);
                
               
        }        
}
