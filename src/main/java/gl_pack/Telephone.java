package gl_pack;

public class Telephone implements java.io.Serializable {
		
	String fixePro;
	String fixePerso;
	String portable;
	
	public String getFixePro() {
		return this.fixePro;
	}
	
	public String getFixePerso() {
		return this.fixePerso;
	}
	
	public String getportable() {
		return this.portable;
	}
	
	public void setFixePro(String fixePro) {
		this.fixePro = fixePro;
	}
	
	public void setFixePerso(String fixePerso) {
		this.fixePro = fixePerso;
		}
	public void setPortable(String portable) {
		this.portable = portable;
		}
	
	public Telephone(String fixePro, String fixeperso, String portable) {
		this.fixePro = fixePro;
		this.fixePerso = fixePerso;
		this.portable = portable;
	}
	
	public Telephone(String fixePro, String portable) {
		this.fixePro = fixePro;
		this.portable = portable;
	}
	
	public Telephone(String fixePro) {
		this.fixePro = fixePro;
	}
	
}
