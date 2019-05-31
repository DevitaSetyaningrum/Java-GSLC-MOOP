
public class Worker extends BaseCharacter implements IChef, IDriver, IWorker, IArtist {

	public Worker(String name, String description) {
		// TODO Auto-generated constructor stub
		super (name, description);
	}
	
	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name+" melukis ");
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name+" bekerja ");
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name+" mengemudi ");
		
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name+" memasak ");
		
	}

}
