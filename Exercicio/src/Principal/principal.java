package Principal;

public class principal {
	

	public static void main(String[] args) {
		// Usando a classe abstrata 
		// no caso relembrando mesmo
		class Puxa extends fazCoisas{
			void Metodo() {
				System.out.print("foi \n");
			}
		}
		class Paxa extends fazCoisas{
			void Metodo() {};
			@Override
			void Mesa(int num) {
				System.out.print("Uma pena,a mesa "+num+" não é sua\n");
				num++;
				System.out.print("Fica na mesa"+num+" \n");
			}
		}
		//Clente 1 usa pUxa
		fazCoisas a = new Puxa();
		a.Metodo();
		a.Mesa(2);
		
		//Cliente 2 usa pAxa
		fazCoisas b = new Paxa();
		b.Mesa(3);
		
	}

}
