
public class Administrador extends Funcionario implements Autenticavel {
	
	
    private AutenticacaoUtil autentica;

    
     public Administrador() {
		this.autentica = new AutenticacaoUtil();
	}

    @Override
    public double getBonificacao() {
            return 50;
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
