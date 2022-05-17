package _06_vault;

public class VaultRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vault vault = new Vault();
		Vault vault2 = new Vault();
	SecretAgent secretAgent = new SecretAgent();
	System.out.println(secretAgent.findCode(vault));
	System.out.println(secretAgent.findCode(vault2));
	
		
		
	}

}
