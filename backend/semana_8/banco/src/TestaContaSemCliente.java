public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaFran = new Conta(7777,888888);
		System.out.println(contaDaFran.getSaldo());

		contaDaFran.setTitular(new Cliente());
		System.out.println(contaDaFran.getTitular());

		contaDaFran.getTitular().setNome("Francyanne");
		System.out.println(contaDaFran.getTitular().getNome());

	}
}