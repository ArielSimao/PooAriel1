/*
 * Aulas professor Maromo.
 */
package gerenciarfolha;

/**
 *
 * @author maromo
 */
public class Secretaria extends Funcionario {
    private int ramal;

    

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Ramal: " + ramal);
    }
}
