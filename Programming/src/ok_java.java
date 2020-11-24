import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
public class ok_java {

	public static void main(String[] args) {
		
		String id = "Java APT 507";
	
		//Elevator call
	Elevator myElevator = new Elevator(id);
	myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		
		//Light on
		
		Lighting halllamp = new Lighting(id+" / hall Lamp");
		halllamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		
		

	}

}
