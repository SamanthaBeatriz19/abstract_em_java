package Principal;

public abstract class fazCoisas {
	//a declara��o do metodo tem que ser alterada na classe que vai usar ele 
	
	//esse metodo � obrigatorio de implementar por ser abstrato
	abstract void Metodo();
	
	//esse n�o -u-
	void Mesa(int num) {
		System.out.println("Sua mesa � "+num+"\n");
	}
}
