package br.api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.api.model.Produto;

public class ProdutoDao {
    
    private Connection conn;
    private PreparedStatement prts;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Produto> lista = new ArrayList<>();
    
    public ProdutoDao(){
        conn = new ConnectionFactoryDB().getConnection();
    }
    
    public void inserir(Produto produto){
        String sql = "INSERT INTO produto(descricao_produto,preco_produto,quantidade) VALUES (?,?,?)";
        try {
            prts = conn.prepareStatement(sql);
            prts.setString(1, produto.getDescricao());
            prts.setDouble(2, produto.getPreco_produto());
            prts.setInt(3, produto.getQuantidade());
            prts.execute();
            prts.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro(sql) inserir : ",e);
        }
            
        
    }
        public void alterar(Produto produto){
        String sql = "UPDATE produto SET descricao_produto = ?, preco_produto = ?, quantidade = ? WHERE codigo_produto = ?";          
        try {
            prts = conn.prepareStatement(sql);
            prts.setString(1, produto.getDescricao());
            prts.setDouble(2, produto.getPreco_produto());
            prts.setInt(3, produto.getQuantidade());
            prts.setInt(4, produto.getCodigo_produto());
            prts.execute();
            prts.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro(sql) alterar : ",e);
        }
            
        
    }
        
        public void excluir(int valor){
        String sql = "DELETE FROM produto WHERE codigo_produto = "+valor;
        try {
            st = conn.createStatement();
            //System.out.println("sql = " + sql+"valor = " +valor);
            st.execute(sql);            
            st.close();
        } catch (Exception e) {
            System.out.println("sql = "+sql);
            throw new RuntimeException("Erro(sql) excluir : ",e);
        }
    }
        
              
        public ArrayList<Produto> listarTodos(){
            String sql = "SELECT * from produto";
            try {
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next()){
                    Produto produto = new Produto();
                    produto.setCodigo_produto(rs.getInt("codigo_produto"));
                    produto.setDescricao(rs.getString("descricao_produto"));
                    produto.setPreco_produto(rs.getDouble("preco_produto"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    lista.add(produto);
                }              
            } catch (Exception e) {
                throw new RuntimeException("Erro(sql) listarTodos : ",e);
            }
            return lista;
        }
        
            public ArrayList<Produto> listarTodosDescricao(String valor){
            String sql = "SELECT * from produto WHERE descricao_produto LIKE '%"+valor+"%'";
            try {
                st = conn.createStatement();
                System.out.println("sql = " +sql);
                rs = st.executeQuery(sql);
                while(rs.next()){
                    Produto produto = new Produto();
                    produto.setCodigo_produto(rs.getInt("codigo_produto"));
                    produto.setDescricao(rs.getString("descricao_produto"));
                    produto.setPreco_produto(rs.getDouble("preco_produto"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    lista.add(produto);
                }              
            } catch (Exception e) {
                throw new RuntimeException("Erro(sql) listarTodos : ",e);
            }
            return lista;
        }
}
