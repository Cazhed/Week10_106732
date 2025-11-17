package week10.zachary.id.ac.umn;

public class MainDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CEO c = new CEO();
		Pekerja p = new CEO();
		c = (CEO)p;
		c.tanyaPendapatan();
	}

}
