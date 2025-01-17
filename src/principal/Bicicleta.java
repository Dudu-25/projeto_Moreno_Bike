package principal;

import java.util.Date;

/**
 *
 * @author genilton
 */

public class Bicicleta 
{
    // Criando os atributos
    private Cliente dono;
    private Date dataEntrada;
    private Date dataSaida;

    // Criando os construtores da classe
    public Bicicleta() { }

    public Bicicleta(Cliente dono, Date dataEntrada) 
    {
        this.dono = dono;
        this.dataEntrada = dataEntrada;
        this.dataSaida = null;
    }

    // Métodos Get/Set
    public Cliente getDono() 
    {
        return dono;
    }

    public void setDono(Cliente dono) 
    {
        this.dono = dono;
    }

    public Date getDataEntrada() 
    {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) 
    {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() 
    {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) 
    {
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() 
    {
        return "Bicicleta: " + "Dono:" + dono + ", Data Entrada: " + dataEntrada + ", Data Saida: " + dataSaida;
    }
}
