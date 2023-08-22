import javax.swing.JOptionPane;

import Clases.ConvertidorDivisas;

public class Aplicacion {
	
	ConvertidorDivisas misOperaciones;
	
public Aplicacion() {
	
	misOperaciones = new ConvertidorDivisas();
	
	presentarMenu();
	
	}

	private void presentarMenu() {
		
			
		String menu="CONVERTIDOR DE DIVISAS\n";
		menu+="1. Pesos Colombia (COP) a Dolares (US)\n";
		menu+="2. Dolares (US) a Pesos Colombianos(COP)\n";
		menu+="3. Pesos Colombia (COP) a Euros (EU)\n";
		menu+="4. Eurs (EU) a Pesos Colombia (COP)\n";
		menu+="5. Pesos Colombia (COP) a Libras E (LE)\n";
		menu+="6. Libras E (LE) a Pesos Colombia (COP)\n";
		menu+="7. Pesos Colombia (COP) a Yen (Y)\n";
		menu+="8. Yen (Y) a Pesos Colombia (COP)\n";
		menu+="9. Salir\n";
		menu+="Ingrese una opción\n";
		int cod=0;
		
		do {
			
			int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a Convertir"));
						
			cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			case 1:
				double res1=misOperaciones.PaU(num1);
				JOptionPane.showMessageDialog(null, num1+ " Pesos, equivalen a: "+res1 + " Dolares");
				break;
			case 2:
				double res2=misOperaciones.UaP(num1);
				JOptionPane.showMessageDialog(null,num1+ " Dolares, equivalen a: "+res2 + " Pesos");
				break;
			case 3:
				double res3=misOperaciones.PaE(num1);
				JOptionPane.showMessageDialog(null,num1+ " Pesos, equivalen a: "+res3 + " Euros");
				break;
			case 4:
				double res4=misOperaciones.EaP(num1);
				JOptionPane.showMessageDialog(null,num1+ " Euros, equivalen a: "+res4 + " Pesos");
				break;
			case 5:
				double res5=misOperaciones.PaL(num1);
				JOptionPane.showMessageDialog(null, num1+ " Pesos, equivalen a: "+res5 + " Libras E.");
				break;
			case 6:
				double res6=misOperaciones.LaP(num1);
				JOptionPane.showMessageDialog(null,num1+ " Libras E, equivalen a: "+res6 + " Pesos");
				break;
			case 7:
				double res7=misOperaciones.PaY(num1);
				JOptionPane.showMessageDialog(null,num1+ " Pesos, equivalen a: "+res7 + " Yenes");
				break;
			case 8:
				double res8=misOperaciones.YaP(num1);
				JOptionPane.showMessageDialog(null,num1+ " Yenes, equivalen a: "+res8 + " Pesos");
				break;			
			case 9:
				JOptionPane.showMessageDialog(null, "Hasta Pronto!");
				break;				
			default: JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
				break;
			}
		} while (cod!=9);
	}

	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}
	
}