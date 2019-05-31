
public class Chef extends BaseCharacter implements IChef {
	
	public Chef(String name,String description) {
		// TODO Auto-generated constructor stub
		super(name,description);
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name+" memasak ");
	}

}
