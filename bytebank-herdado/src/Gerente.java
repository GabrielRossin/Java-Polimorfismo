
public class Gerente extends Funcionario implements Autenticavel
{
 
	private AutenticacaoUtil autentica;

    
    public Gerente() {
		this.autentica = new AutenticacaoUtil();
	}
	
    public double getBonificacao() 
    {
    	System.out.println("Gerente");
        return super.getSalario(); //super diz que a variável está na classe super 
    }

    @Override
	public void setSenha(int senha) {
		
		this.autentica.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		   if(this.autentica.autentica(senha)) {
               return true;
           } else {
               return false;
           }
	}

	
    
}
