public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaFran = new Conta(7777,888888);
		contaDaFran.deposita(100);
		contaDaFran.deposita(50);
		System.out.println(contaDaFran.getSaldo());

		boolean conseguiuRetirar = contaDaFran.saca(20);
		System.out.println(contaDaFran.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(1111,222222);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaFran);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDaFran.getSaldo());
	}

}