
public class Gerente extends Funcionario implements Autenticavel
{
 
	private int senha;
	
    public double getBonificacao() 
    {
    	System.out.println("Gerente");
        return super.getSalario(); //super diz que a vari�vel est� na classe super 
    }

	@Override
	public void setSenha(int senha) 
	{
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) 
	{
		 if(this.senha == senha) 
		 {
             return true;
         } 
		 else 
		 {
             return false;
         }
	}

	
    
}
