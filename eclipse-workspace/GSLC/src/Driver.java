
public class Driver extends BaseCharacter implements IWorker, IDriver {

	public Driver(String name, String description) {
		// TODO Auto-generated constructor stub
		super(name, description);
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name+" mengemudi ");
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name+" bekerja ");
	}
}
