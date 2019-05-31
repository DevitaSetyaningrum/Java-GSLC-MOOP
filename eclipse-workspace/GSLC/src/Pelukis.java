
public class Pelukis extends BaseCharacter implements IArtist{


	public Pelukis(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name+" melukis ");
	}

}
