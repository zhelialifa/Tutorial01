public class Mahasiswa {
	String nama;
	String npm;

	public Mahasiswa(String nama, String npm) {
		super();
		this.nama = nama;
		this.npm = npm;
	}	

	public getNama() {
	return nama;
	}

	public void setNama(String nama_mahasiswa) {
		nama = nama_mahasiswa;
	}

	public getNpm() {
		return npm;
	}

	public void setNpm(String npm_mahasiswa) {
		npm = npm_mahasiswa;
	}
}