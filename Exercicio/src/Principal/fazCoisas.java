package Principal;

public abstract class fazCoisas {
	//a declaração do metodo tem que ser alterada na classe que vai usar ele 
	
	//esse metodo é obrigatorio de implementar por ser abstrato
	abstract void Metodo();
	
	//esse não -u-
	void Mesa(int num) {
		System.out.println("Sua mesa é "+num+"\n");
	}
}
