package analisador;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class Interface extends javax.swing.JFrame {

    public Interface() {
    	setBackground(Color.RED);
    	getContentPane().setBackground(Color.RED);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CalcSpi");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser(){
            @Override
            public void approveSelection(){
                File f = getSelectedFile();
                if(f.exists() && getDialogType() == SAVE_DIALOG){
                    int result = JOptionPane.showConfirmDialog(this, "Arquivo existente, deseja sobrescrever?", "Arquivo existente", JOptionPane.YES_NO_CANCEL_OPTION);
                    switch(result){
                        case JOptionPane.YES_OPTION:
                        super.approveSelection();
                        return;
                        case JOptionPane.NO_OPTION:
                        return;
                        case JOptionPane.CLOSED_OPTION:
                        return;
                        case JOptionPane.CANCEL_OPTION:
                        cancelSelection();
                        return;
                    }
                }
                super.approveSelection();
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 11));
        run = new javax.swing.JButton();
        run.setBackground(Color.WHITE);
        run.setForeground(new Color(102, 153, 0));
        open = new javax.swing.JButton();
        open.setBackground(Color.WHITE);
        open.setForeground(new Color(255, 128, 0));
        clear = new javax.swing.JButton();
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.RED);
        jScrollPane3 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextPane();
        save = new javax.swing.JButton();
        save.setBackground(Color.WHITE);
        save.setForeground(new Color(255, 128, 0));

        fileChooser.setDialogTitle("Abrir cÛdigo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textarea.setColumns(20);
        textarea.setRows(5);
        textarea.setToolTipText(null);
        jScrollPane1.setViewportView(textarea);

        jLabel1.setText("SaÌda do compilador");
        jLabel1.setToolTipText(null);

        run.setText("Executar");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });

        open.setText("Abrir");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        clear.setText("Limpar tudo");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        output.setToolTipText(null);
        jScrollPane3.setViewportView(output);
        output.setEditable(false);

        save.setText("Salvar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        
        JButton sair = new JButton("Sair");
        sair.setBackground(Color.WHITE);
        sair.setForeground(Color.RED);
        sair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JPanel panel = new JPanel();  
		        panel.setLayout(null);  
		        Object source;  
		        source = e.getSource();  
		        System.exit(0);
        	}
        });
        
        tabela = new JButton("Tabela");
        tabela.setBackground(Color.WHITE);
        tabela.setForeground(Color.BLUE);
        tabela.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tabela window = new tabela();
				window.frame1.setVisible(true);
        	}
        });
        
        btnSobre = new JButton("Sobre");
        btnSobre.setBackground(Color.WHITE);
        btnSobre.setForeground(Color.BLUE);
        btnSobre.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		sobre s = new sobre();
				s.setVisible(true);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(open)
        					.addGap(2)
        					.addComponent(save)
        					.addGap(39)
        					.addComponent(run)
        					.addGap(26)
        					.addComponent(tabela)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSobre)
        					.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
        					.addComponent(clear)
        					.addGap(1)
        					.addComponent(sair))
        				.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(3)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(open)
        				.addComponent(clear)
        				.addComponent(sair)
        				.addComponent(save)
        				.addComponent(btnSobre)
        				.addComponent(tabela)
        				.addComponent(run))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed

        // Texto do JTextPane, onde aparece a sa√≠da
        StyledDocument doc = output.getStyledDocument();
        SimpleAttributeSet attributes = new SimpleAttributeSet();

        // Toda vez que o bot√£o executar √© acionado, limpar o campo de sa√≠da
        output.setText("");

        String codigo = textarea.getText();
        
        if(!codigo.isEmpty()){
        
            String saida = "An·lise lÈxica:\n";

            boolean erro_lexico = false;

            // Verifica erro l√©xico
            try {
                @SuppressWarnings("deprecation")
				Parser p = new Parser((Scanner) new Lexer(new StringReader(codigo)));

                Symbol token = p.scan();
                int simbolo = token.sym;

                while(simbolo != Sym.EOF) {

                    // toString do scanner foi sobrescrito para retornar a linha e a coluna
                    String linha_coluna = p.getScanner().toString();

                    saida += linha_coluna;

                    // token em si
                    String token_atual = Sym.terminalNames[simbolo];

                    if(simbolo == Sym.error){
                        erro_lexico = true;
                        token_atual = "ERRO";
                    }

                    // inst√¢ncia do token
                    String valor = token.value.toString();

                    saida += " " + token_atual + " [" + valor + "] " + '\n';

                    token = p.scan();
                    simbolo = token.sym;

                }

                if(erro_lexico == true){
                    saida += "Erro lÈxico\n";
                }
            } catch (Exception ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(erro_lexico == false){
                saida += "\nAn·lise sint·tica:\n";

                @SuppressWarnings("deprecation")
				Parser p = new Parser((Scanner) new Lexer(new StringReader(codigo)));

                try {             
                    p.parse();

                    saida += "CompilaÁ„o sem erros\n";
                } catch (Exception ex) {
                    saida += p.getScanner().toString() + " Erro sint·tico\n";

                }
            }

            try {
                doc.insertString(doc.getLength(), saida, attributes);
            } catch (BadLocationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_runActionPerformed
    
    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        
        // Abrir no diret√≥rio de trabalho
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        
        int returnVal = fileChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
              textarea.read( new FileReader( file.getAbsolutePath() ), null );
            }
            catch (IOException ex){
              System.out.println("Problema em acessar o arquivo " + file.getAbsolutePath());
            }
        }

    }//GEN-LAST:event_openActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        textarea.setText("");
        output.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        // Abrir no diret√≥rio de trabalho
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        
        int returnVal = fileChooser.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            String text = textarea.getText();
            try(FileWriter fw = new FileWriter(fileChooser.getSelectedFile())) {
                fw.write(text);
            } catch (IOException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton open;
    private javax.swing.JTextPane output;
    private javax.swing.JButton run;
    private javax.swing.JButton save;
    private javax.swing.JTextArea textarea;
    private JButton tabela;
    private JButton btnSobre;
}
