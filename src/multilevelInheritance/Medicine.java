package multilevelInheritance;

public class Medicine extends Engeneering{
	
	void physiyo() {
		System.out.println("physiotheraphy");
	}
	void dental() {
	    System.out.println("dentist");
	}
	void mmbs() {
		System.out.println("mdeical student");
	}

	public static void main(String[] args) {
		Medicine check=new Medicine();
		check.pg();
		check.ug();
		check.bsc();
		check.BBA();
		check.ba();
		check.bEd();
		check.BE();
		check.BTECH();
		check.physiyo();
		check.dental();
		check.mmbs();

	}

}
