import javax.swing.JOptionPane;

public class app{
	
	public static void main (String[]Args){

		int nmro1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número (Você poderá trocar depois): "));
		int nmro2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número (Você poderá trocar depois): "));
		int escolha;
		int flag = 1;
		calculator calculator = new calculator(nmro1,nmro2);
		double resultado;

		while (flag == 1) {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n\n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Trocar Valores \n 6 - Sair"));
			switch(escolha){
				case 1:
					resultado = calculator.Soma();
					JOptionPane.showMessageDialog(null,resultado);
				break;
				case 2:
					resultado = calculator.Subtracao();
					JOptionPane.showMessageDialog(null,resultado);
				break;
				case 3:
					resultado = calculator.Multiplicacao();
					JOptionPane.showMessageDialog(null,resultado);
				break;
				case 4:
					resultado = calculator.Divisao();
					JOptionPane.showMessageDialog(null,resultado);
				break;
				case 5:
					nmro1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número (Você poderá trocar depois): "));
				 	nmro2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número (Você poderá trocar depois): "));
					calculator.setNmro1(nmro1);
					calculator.setNmro2(nmro2); 
				break;
				case 6:
					flag = 0;
				break;
				default:
					JOptionPane.showMessageDialog(null,"Opção Inválida");
				break;
			}
		
		}
	}
	
}