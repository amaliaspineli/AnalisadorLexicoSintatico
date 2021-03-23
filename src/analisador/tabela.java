package analisador;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.Set;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class tabela {

	JFrame frame1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tabela window = new tabela();
					window.frame1.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public tabela() {
		initialize();
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(Color.RED);
		frame1.setTitle("Tabela de Tokens");
		frame1.setBounds(100, 100, 1503, 598);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame1.getContentPane().setLayout(null);
		
		frame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JLabel lblTabelaDeTokens = new JLabel("Tabela de Tokens");
		lblTabelaDeTokens.setForeground(Color.WHITE);
		lblTabelaDeTokens.setBounds(0, 0, 190, 23);
		frame1.getContentPane().add(lblTabelaDeTokens);
		lblTabelaDeTokens.setFont(new java.awt.Font("Verdana", 1, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 28, 1360, 531);
		frame1.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setBackground(Color.WHITE);
		table.setEnabled(false);
		table.setBorder(null);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Variavel", "a, b, var, x1, y2", "Letra(Letra|Digito)"},
				{"FinalLinha", ";", ";"},
				{"DoisPontos", ":", ":"},
				{"virgula", ",", ","},
				{"AbParentese", "(", "("},
				{"FchParentese", ")", ")"},
				{"AbColchete", "[", "["},
				{"FchColchete", "]", "]"},
				{"OpRelacional", "<, <=, >, >=, ==, !=", "( < | <= | > | >= | == | != )"},
				{"AbChave", "{", "{"},
				{"FchChave", "}", "}"},
				{"se", "se", "se"},
				{"senao", "senao", "senao"},
				{"num", "3.1416, -1, 10", "Digito.* | -Digito.*"},
				{"caractere", "exemplo1", "Letra(Letra|Digito)"},
				{"enquanto", "enquanto", "enquanto"},
				{"para", "para", "para"},
				{"caso", "caso", "caso"},
				{"break", "break", "break"},
				{"switch", "switch", "switch"},
				{"escreva", "escreva", "escreva"},
				{"leia", "leia", "leia"},
				{"comentario", "//", "(//letra*|digito*)"},
				{"OpMatematica", "subtracao, divisao, multiplicacao, soma, raizquadrada, potencia, porcentagem, fatorial, logaritmo, cosseno, seno, tangente", "(subtracao | divisao | multiplicacao | soma | raizquadrada | potencia | porcentagem | fatorial | logaritmo | cosseno | seno | tangente)"},
				{"bool", "verdadeiro, falso", "(verdadeiro | falso)"},
				{"retorna", "retorna", "retorna"},
				{"atribuicao", "=", "="},
				{"tipo", "int, double, string, float", "(int | double| string | float)"},
				{"texto", "\u201CDigite um numero\u201D", "(\"letra*|digito*\")"},
				{"e", "e", "e"},
				{"ou", "ou", null},
			},
			new String[] {
				"TOKEN", "LEXEMA", "EXPRESS\u00C3O REGULAR"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(0).setMinWidth(90);
		table.getColumnModel().getColumn(0).setMaxWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(650);
		table.getColumnModel().getColumn(1).setMinWidth(680);
		table.getColumnModel().getColumn(1).setMaxWidth(650);
		table.getColumnModel().getColumn(2).setPreferredWidth(640);
		table.getColumnModel().getColumn(2).setMinWidth(500);
		table.getColumnModel().getColumn(2).setMaxWidth(640);
	}
}
