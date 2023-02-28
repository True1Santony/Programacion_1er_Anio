
public class Aloa extends Pikachu {
	
	protected Aloa() {//ADD ATRIBUTOS DE CLASE HIJA
		
		this.nivel_energia=5;
		this.nivel_vida=5;
		this.Raichu_Aloa=true;
		
	}
	
	protected void luchar() {// IMPLEMENTADO/OBLIGADO, METODO ABSTRACTO DE CLASE PADRE/SUPERCLASE
		this.nivel_vida--;
		System.out.println("Se ha reducido la vida de Alola en 1.");
		

	}

	public void entrenar() {// IMPLEMENTADO/OBLIGADO, METODO ABSTRACTO DE INTERFAZ
		this.nivel_energia++;
		System.out.println("Se ha incrementado la energia de Alola en 1.");
	}
	
	protected void volar() {// METODO PROPIO, AUNQUE SI HUBIERA MAS POKEMON VOLADORES, CREO QUE SERIA MEJOR HEREDAR DE UNA INTERFAZ
		this.nivel_energia--;
		System.out.println("Se ha reducido la energia de Alola en 1.");
	}
}
