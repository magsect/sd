
package br.api.resource;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import br.api.model.Produto;

public class ProdutoTableModel extends AbstractTableModel{

    public static final int COL_CODIGO_PRODUTO=0;
    public static final int COL_DESCRICAO_PRODUTO=1;
    public static final int COL_PRECO_PRODUTO=2;
    public static final int COL_QUANTIDADE=3;
    
    public ArrayList<Produto> lista;
    
    public ProdutoTableModel(ArrayList<Produto> l){
        lista = new ArrayList<Produto>(l);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Produto produto = lista.get(rowIndex);
       if(columnIndex == COL_CODIGO_PRODUTO) return produto.getCodigo_produto();
       if(columnIndex == COL_DESCRICAO_PRODUTO) return produto.getDescricao();
       if(columnIndex == COL_PRECO_PRODUTO) return produto.getPreco_produto();
       if(columnIndex == COL_QUANTIDADE) return produto.getQuantidade();
       return "";
    }
    
    @Override
    public String getColumnName(int column){
       if(column == COL_CODIGO_PRODUTO) return "Codigo";
       if(column == COL_DESCRICAO_PRODUTO) return "Descricao";
       if(column == COL_PRECO_PRODUTO) return "Precoo";
       if(column == COL_QUANTIDADE) return "Quantidade";

       return "";
    }
}
