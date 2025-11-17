package week10.zachary.id.ac.umn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pekerja pekerja = new Pekerja();
		pekerja.tanyaIdentitas();
		
		pekerja = new CEO();
		pekerja.tanyaIdentitas();
		
		Karyawan karyawan = new Karyawan();
		pekerja = (Pekerja)karyawan;
		pekerja.tanyaIdentitas();
	}

}
