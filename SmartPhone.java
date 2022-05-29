package week3.day1;
//SmartPhone is Child
public class SmartPhone  extends AndroidPhone{
	public void connectWhatsapp(){
		System.out.println("Connect Dhanya through Whatsapp");
	}
	public void takeVideo() {
		System.out.println("---Overriding is the method which is in Android Phone Class---");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone smPhone = new SmartPhone();
		smPhone.makeCall();
		smPhone.sendMsg();
		smPhone.saveContact();
		smPhone.takeVideo();
		smPhone.connectWhatsapp();

	}

}
