/**
 * @author Nirton Afonso de Oliveira Filho
 * @matricula 201851301411
 *
 * @author Ilmar Macedo Alves Junior
 * @matricula 201851406603
 *
 * @docente Dr. Oberdan Rocha Pinheiro
 *
 */

package br.com.poo.modelo;

public class Local {

    private String endereco;
    private int capacidadePessoas;

    /**
     * Construtor
     *
     * @param endereco
     * @param capacidadePessoas
     */
    public Local(String endereco, int capacidadePessoas) {
        setEndereco(endereco);
        setCapacidadePessoas(capacidadePessoas);
    }

    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    /**
     * @param capacidadePessoas
     */
    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    @Override
    public String toString() {
        StringBuilder local = new StringBuilder();
        local.append("Local do evento: ");
        local.append(getEndereco());
        local.append("\n\n");
        local.append("Lotacao Maxima: ");
        local.append(getCapacidadePessoas());
        local.append(" pessoas");

        return local.toString();
    }

}
