package Atividade1;

public class ArmazenarGenerica<T> {

	  private T objeto;

	    public ArmazenarGenerica(T objeto) {
	        this.objeto = objeto;
	    }

	    public T getObjeto() {
	        return objeto;
	    }

		@Override
		public String toString() {
			return "ArmazenarGenerica [objeto=" + objeto + ", getObjeto()=" + getObjeto() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

}
