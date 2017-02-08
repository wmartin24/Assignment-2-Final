
public class Car {

	int gear = 1;
	int location ;
	int speed =0;
	final int destination = 250;
	
	void reverseGear() {
		gear = 1;
	}

	void gearUp() {
		if(gear==6){
			System.out.println("Cannot increase gear anymore") ;
			
		}
		else if(gear==-1){
			gear=1;
		}
		else {
			gear=gear++;
		}	
	}
	void gearDown(){
		if(gear==1){
			System.out.println("Cannot decrease gear anymore");
		}
			else if(gear==-1){
				System.out.println("Cannot decrease gear anymore,car is in reverse");
		}
	}		
		int reportGear() {
			return gear;
		}
		int reportLocation() {
	        return location;
	    }
		int reportRemaing(){
			return location-destination;
		}	
		void moveByTime(int time){
			int delta;
			if(time<0){
				System.out.println("Time should be positive");
		}		
			else{
				speed=gear*20;
				delta=speed*time;
				location=location+delta;
		}
		}
			boolean isArrived(){
				if (location>=destination){
					return true;
			}
				else{
					return false;
			}		
					
			}
		}

