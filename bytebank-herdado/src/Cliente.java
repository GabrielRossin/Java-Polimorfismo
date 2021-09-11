
public class Cliente implements Autenticavel {
	

    private AutenticacaoUtil autentica;

	
	public Cliente()
	{
        this.autentica = new AutenticacaoUtil();

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
