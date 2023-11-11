public class TestaBanco {
	public static void main(String[] args) {
		Cliente fran = new Cliente();
		fran.setNome("Francyanne C. Branco");
		fran.setCpf("222.222.222.-22");
		fran.setProfissao("programadora");

		Conta contaDaFran = new Conta(7777,888888);
		contaDaFran.deposita(100);

		contaDaFran.setTitular(fran);
		System.out.println(contaDaFran.getTitular().getNome());
		System.out.println(contaDaFran.getTitular());

	}
}