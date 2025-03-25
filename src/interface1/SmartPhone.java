package interface1;

public class SmartPhone  implements Camera,Music{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone obj=new SmartPhone();
		obj.recording();
		obj.takePhoto();
		obj.startMusic();
		obj.stopMusic();
	}

	@Override
	public void startMusic() {
		// TODO Auto-generated method stub
		System.out.println("start music");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("stop music");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("take photo");
	}

	@Override
	public void recording() {
		// TODO Auto-generated method stub
		System.out.println("take video");
	}

}
