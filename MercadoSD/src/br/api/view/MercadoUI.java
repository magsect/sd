package br.api.view;

import br.api.dao.ProdutoDao;
import br.api.model.Produto;
import br.api.resource.ProdutoTableModel;
import br.api.server.ChatServer;
import br.api.util.IChatAula;
import br.api.util.Message;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.crypto.AEADBadTagException;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MercadoUI extends javax.swing.JFrame {

    Produto pro = new Produto();
    ProdutoDao prodao = new ProdutoDao();
    static String nomeFuncionario = "";
    String msg = "";
    
    public void limparCampos(){
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        txtPesquisar.setText("");
    }
    public MercadoUI()  {
    	
        initComponents();
        setLocationRelativeTo(null);
        btnExcluir.setEnabled(false);
        txtFuncionario_1.setEditable(false);
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().listarTodos()));
//        nomeFuncionario = JOptionPane.showInputDialog("Bem vindo ao MercadoXXXX , qual o seu nome ?");
//        txtFuncionario.setText(nomeFuncionario);
  
    }
    
	private static String returnMessage(List<Message> lst) {
		
		String valor = "";
		for(Message message : lst) {
			valor += message.getUser() + ": " + message.getMessage() + "\n"; 
			//valor += message.getUserAndMessage();
		}
		return valor;
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        lblPesquisar = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtFuncionario = new JTextField();
        JTextPane txtMsg = new JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercado");
        setResizable(false);

        lblCodigo.setText("Codigo:");

        lblDescricao.setText("Descricao");

        lblPreco.setText("Preco:");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(235, 228, 228));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });

        lblPesquisar.setText("Pesquisar:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        lblQuantidade.setText("Quantidade:");
        
        lblNewLabel_1 = new JLabel("Funcionario:");
     
        txtFuncionario_1 = new JTextField();
        txtFuncionario_1.setColumns(10);
        
        lblNewLabel_2 = new JLabel("Mensagem:");
        
       // JTextPane txtMsg = new JTextPane();
  
        JButton btnNewButton = new JButton("Enviar");
        btnNewButton.addActionListener(new ActionListener() {
        	//int pos = 0;
        	public void actionPerformed(ActionEvent e) {
//        		try {
//					IChatAula objChat = (IChatAula) Naming.lookup("rmi://localhost:8282/chat");
//				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
        		//lblNewLabel_1 = textField
        		
        		int hora = LocalDateTime.now().getHour();
        		double minuto = LocalDateTime.now().getMinute();
        		
        		LocalDateTime  dateTime = LocalDateTime.now();
           		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
           		String formattedDateTime = dateTime.format(formatter);
           		
        		//String textPanel = "["+formattedDateTime +"] "+txtFuncionario.getText() + ":" + txtMsg.getText() +"\n";
        		
        		String timeAndFuncionario = "["+formattedDateTime +"] "+txtFuncionario_1.getText() + ":";
        		
				IChatAula objChat;
				try {
					objChat = (IChatAula) Naming.lookup("rmi://localhost:8282/chat");
					Message msg = new Message(timeAndFuncionario, txtMsg.getText());
					//Message msg = new Message(textPanel);
					objChat.sendMessage(msg);
					textAreaChat.insert(returnMessage(objChat.retrieveMessage()), 0);
					//textAreaChat.insert(str, pos);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
        		
//        		while(txtMsg.equals("")) {
//        			txtAreaChat.insert(textPanel, pos);
//        			pos++;
//        		}
//        		
        		
        		//textAreaChat.insert(textPanel, 0);
        		txtMsg.setText("");
        	}
        });
        
        
        scrollPane = new JScrollPane();
        
        JLabel lblNewLabel = new JLabel("CHAT");
        
       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblQuantidade)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblDescricao)
        								.addComponent(lblCodigo)
        								.addComponent(lblPreco))
        							.addGap(32)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
        									.addComponent(btnSalvar)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(btnExcluir)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(btnLimpar)
        									.addGap(59))
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(txtPreco, Alignment.LEADING)
        									.addComponent(txtDescricao, Alignment.LEADING, 511, 511, Short.MAX_VALUE))))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblPesquisar)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(lblNewLabel_1)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(txtFuncionario_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(lblNewLabel_2)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(btnNewButton)
        											.addPreferredGap(ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
        											.addComponent(btnSair))
        										.addComponent(txtMsg, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)))
        								.addComponent(txtPesquisar, 461, 461, 461))
        							.addGap(57))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(273)
        					.addComponent(lblNewLabel)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(31)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblDescricao)
        						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(lblCodigo)
        					.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(14)
        					.addComponent(lblPreco))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(btnExcluir)
        					.addComponent(btnSalvar)
        					.addComponent(btnLimpar))
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(lblQuantidade)))
        			.addGap(29)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPesquisar)
        				.addComponent(txtPesquisar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
        			.addGap(10)
        			.addComponent(lblNewLabel)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_1)
        				.addComponent(txtFuncionario_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(9)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_2)
        				.addComponent(txtMsg, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNewButton)
        				.addComponent(btnSair)))
        );
        
        textAreaChat = new JTextArea();
        scrollPane.setViewportView(textAreaChat);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     // Double prec = Double.parseDouble(txtPreco.getText());
//      int qnt = Integer.parseInt(txtQuantidade.getText());
//      
//      if(!txtDescricao.getClass().equals(String.class)){
//          JOptionPane.showMessageDialog(null, "Tipo dos valores incorretos");
//          
//      }
////        if(!txtDescricao.getClass().equals(String.class) || !prec.getClass().equals(Double.class) || !prec.getClass().equals(Integer.class)) {
////           JOptionPane.showMessageDialog(null, "Tipo dos valores incorretos");
//      
      
        if(txtDescricao.getText().equals("") || txtPreco.getText().equals("") || txtQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos em branco", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }else{    
            if(txtCodigo.getText().equals("")){
                pro.setDescricao(txtDescricao.getText());
                pro.setPreco_produto(Double.parseDouble(txtPreco.getText()));
                pro.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
                prodao.inserir(pro);
                limparCampos();
            }else{
                pro.setDescricao(txtDescricao.getText());
                pro.setPreco_produto(Double.parseDouble(txtPreco.getText()));
                pro.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
                pro.setCodigo_produto(Integer.parseInt(txtCodigo.getText()));
                prodao.alterar(pro);
                limparCampos();
            }
         }         
         tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().listarTodos()));      
         btnExcluir.setEnabled(false);    
         
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja Sair ?", "Sair", JOptionPane.YES_NO_OPTION);
        if(op==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        txtCodigo.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),ProdutoTableModel.COL_CODIGO_PRODUTO).toString());
        txtDescricao.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),ProdutoTableModel.COL_DESCRICAO_PRODUTO).toString());
        txtPreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),ProdutoTableModel.COL_PRECO_PRODUTO).toString());
        txtQuantidade.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(),ProdutoTableModel.COL_QUANTIDADE).toString());
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int op = JOptionPane.showConfirmDialog(null, "Deseja Excluir o produto: "+txtDescricao.getText()+" ?", "Produto : "+txtDescricao.getText(), JOptionPane.YES_NO_OPTION);
       if(op==0){
            int codigo = Integer.parseInt(txtCodigo.getText());
            //new ProdutoDao().excluir(codigo);
            prodao.excluir(codigo);
            tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().listarTodos()));
            limparCampos();
            btnExcluir.setEnabled(false);
       }
       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        String pesquisa = txtPesquisar.getText();
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDao().listarTodosDescricao(pesquisa)));
    }//GEN-LAST:event_txtPesquisarKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MercadoUI().setVisible(true);
                
//                try {
//					new ChatServer();  // necessario inicar 1x							
//				} catch (RemoteException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
                
                nomeFuncionario = JOptionPane.showInputDialog("Bem vindo ao MercadoXXXX , qual o seu nome ?");
                txtFuncionario_1.setText(nomeFuncionario);
                
//                try {
//        			IChatAula objChat = (IChatAula) Naming.lookup("rmi://localhost:8282/chat");
//        		} catch (MalformedURLException e) {
//        			// TODO Auto-generated catch block
//        			e.printStackTrace();
//        		} catch (RemoteException e) {
//        			// TODO Auto-generated catch block
//        			e.printStackTrace();
//        		} catch (NotBoundException e) {
//        			// TODO Auto-generated catch block
//        			e.printStackTrace();
//        		}

            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private JLabel lblNewLabel_1;
    private static  JTextField txtFuncionario;
    private static JTextField txtFuncionario_1;
    private JLabel lblNewLabel_2;
    private JScrollPane scrollPane;
    private JTextArea textAreaChat;
}
