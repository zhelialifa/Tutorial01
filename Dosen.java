public class Dosen {
	String nama;
	String noinduk;

	public Mahasiswa(String nama, String noinduk) {
		super();
		this.nama = nama;
		this.noinduk = noinduk;
	}	

	public getNama() {
	return nama;
	}

	public void setNama(String nama_dosen) {
		nama = nama_dosen;
	}

	public getNoinduk() {
		return noinduk;
	}

	public void setNoinduk(String noinduk_dosen) {
		noinduk = noinduk_dosen;
	}
}