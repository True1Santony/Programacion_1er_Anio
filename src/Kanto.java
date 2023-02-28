
public class Kanto extends Pikachu {

	public Kanto(int energia, int vida) {// ATRIBUTOS DE CLASE
			
			this.nivel_energia=energia;
			this.nivel_vida=vida;
			this.Raichu_Kanto=true;
			
		}
		
		protected void luchar() {//METODO DE CLASE PADRE, ABSTRACTO
			
			this.nivel_vida=this.nivel_vida-2;
			System.out.println("Se ha reducido la vida de Kanto en 2.");
			
		}
	
		public void entrenar() {//METODO DE INTERFAZ
			this.nivel_energia++;
			System.out.println("Se ha aumentado la energia de Kanto en 1.");
			
		}
		
}
