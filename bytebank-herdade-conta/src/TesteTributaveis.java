
public class TesteTributaveis {

	public static void main(String[] args) {
		
		

	        ContaCorrente cc = new ContaCorrente(222, 333);
	        cc.deposita(100.0);

	        SeguroVida seguro = new SeguroVida();

	        CalcularImposto calc = new CalcularImposto();
	        calc.registra(cc);
	        calc.registra(seguro);

	        System.out.print(calc.getTotalImposto());

	}

}
