import javax.swing.*; // Importa bibliotecas importantes
import java.awt.event.*;

// Ele estende a JFrame e implementa um interface que é usada em todas as classes do JFrame que possuem ação
public class Eventos extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = -793505458962482517L;

	public Eventos() {
        super("Eventos"); // Nomeia a tela

        JButton botao = new JButton("Clique aqui"); // Cria o botão
        getContentPane().add(botao); // E adiciona ele, pelo visto, esse é o container principal do JFrame
        botao.addActionListener(this); // E adiciona uma ActionListener (nele mesmo? pode isso Arnaldo?)

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chama o JFrame
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { // Se a pessoa clicar, aparece o texto "Clicou"
        System.out.println("Clicou");
    }

    public static void main(String[] args) {
        new Eventos(); 
    }    
}
