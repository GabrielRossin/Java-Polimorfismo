
public class ContaCorrente extends Conta 
{
	
	public ContaCorrente(int agencia, int numero)
	{
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) 
	{
		double valorSaca = valor + 0.2;
		return super.saca(valorSaca);
	}

	@Override
	public void deposita(double valor) 
	{
		super.saldo += valor;
	}
	
	

}
