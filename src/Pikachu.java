
abstract public class Pikachu implements entrenador {
	
	protected boolean Raichu_Aloa=false;
	protected boolean Raichu_Kanto=false;
	protected int nivel_energia;
	protected int nivel_vida;
	

	public String toString() {
		
		String cadena="";
		
		if(Raichu_Aloa==true && Raichu_Kanto==false) {//SI ES ALOA
			cadena="Soy un Raichu-Aloa."+" Mi nivel de energía es: "+this.nivel_energia+" y mi nivel de vida es: "+ this.nivel_vida;
			
		}else if(Raichu_Aloa==false && Raichu_Kanto==true) {//SI ES KANTO
			cadena="Soy un Raichu-Kanto."+" Mi nivel de energía es: "+this.nivel_energia+" y mi nivel de vida es: "+ this.nivel_vida;
		}/*else {
			cadena="Tadavia soy un Picachu ):";
		}*/  //no es posible, asi que lo quito
		return cadena;
	}
	
	/*protected int dimeTipo() {  PRUEBA
		int aux=0;
		if(this.Raichu_Aloa==true && this.Raichu_Kanto==false ) {//si es aloa 1
			aux=1;
		}else if(this.Raichu_Kanto==true && this.Raichu_Aloa==false){//si es 
			aux=2;
		}
		return aux;
		
	}*/ 
	abstract protected void luchar(); //HERENCIA CON OBLIGACION DE IMPLEMENTAR
}


