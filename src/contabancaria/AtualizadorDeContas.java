package contabancaria;

class AtualizadorDeContas{

	private double saldoTotal;
	private double selic;

	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}

	public void roda(Conta c){
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Novo saldo: " + c.getSaldo());		

		this.saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal(){
		return this.saldoTotal;
	}
}