
import javax.swing.*; // Importa as bibliotecas para o GUI
import java.awt.*;

public class BookAlpoo extends JFrame{ // A janela6 estende a classe JFrame, pois essa classe basicamente exibe um frame

    // Construtor do objeto janela
    public BookAlpoo() {

        super("Primeira Janela"); // Chama o construtor da superclasse com o parâmetro do título da tela

        Container c = getContentPane(); // Cria um container c que cobra toda área do Jframe
        c.setLayout(new BorderLayout()); // Coloca um layout (responsável por organizar componentes) nele

        Container c2 = new JPanel(); // Cria outro container do tipo JPanel
        c2.setLayout(new GridLayout(4, 1)); // Cria outro tipo de layout no container
        c2.add(new JButton("OK")); // E adiciona os elementos neste container
        c2.add(new JButton("Cancelar"));
        c2.add(new JButton("Deletar"));
        c2.add(new JButton("Ajudar"));

        c.add(BorderLayout.CENTER, new JButton("Centro")); // Cria um botão no container principal
        c.add(BorderLayout.EAST, c2); // E adiciona o container secundário nele

        JFrame frame = new JFrame(); // Cria a tela principal
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    // Método principal
    public static void main(String[] args) {
        new Janela5(); // Chama a janela
    }
}