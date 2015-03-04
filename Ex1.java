Class Currency{

	String sym;
	int value;

	// Construtor
	Currency(String sym, int value){

		this.sym = sym;
		this.value = value;
	}
	
	public String toString(){

		String msg = "";
		msg = (sym, value);
		return(msg);
	}

	public static void main (String[] arg){
		Currency c1 = new Currency("€", 5);
		System.out.println(c1.toString());	
	}
}