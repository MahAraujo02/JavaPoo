package com.mycompany.mavenproject1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mavenproject1 extends JFrame 
                     implements ActionListener {    
    JLabel lNome, lId, lEst, lCid;
    JTextField tfNome, tfId;
    JButton bSalvar, bLimpar, bSair;
    JComboBox cbEst, cbCid;
    JRadioButton rbOp1, rbOp2;
    ButtonGroup bgOp;
    JCheckBox jcOp1, jcOp2, jcOp3;
    
    String [] ma = {"", "Imperatriz", "Sao Luis", "Açailandia"};
    String [] pi = {"", "Teresina","Parnaiba", "Picos"};
    String [] ce = {"", "Fortaleza", "Sobral", "Tiangua"};
            
    
   
    public Mavenproject1()  {
        setLayout(new FlowLayout());
       
        lNome = new JLabel("Nome");
        add(lNome);
        
        tfNome = new JTextField(20);
        tfNome.addActionListener(this);
        add(tfNome);
        
        lId = new JLabel("Idade");
        add(lId);
        
        tfId = new JTextField(4);
        add(tfId);
        
        lEst = new JLabel ("Estado");
        add(lEst);

        String [] est = {"", "Maranhao", "Piaui", "Ceara"};

        cbEst = new JComboBox (est);
        cbEst.addActionListener(this);
        add(cbEst);

        lCid = new JLabel ("Cidade");
        add(lCid);
        cbCid = new JComboBox();
        add(cbCid);
        
        
        bSalvar = new JButton("Salvar");
        bSalvar.addActionListener(this);
        add(bSalvar);
        
        bLimpar = new JButton("Limpar");
        bLimpar.addActionListener(this);
        add(bLimpar);
        
        bSair = new JButton("Sair");
        bSair.addActionListener(this);
        add(bSair);
        
        rbOp1 = new JRadioButton ("agua com gas");
        rbOp1.setSelected(true);
        add(rbOp1);
        rbOp2 = new JRadioButton("agua mineral");
        add(rbOp2);
        bgOp = new ButtonGroup();
        bgOp.add(rbOp1);
        bgOp.add(rbOp2);
        
        jcOp1 = new JCheckBox("pizza");
        jcOp1.setSelected(true);
        add(jcOp1);
        jcOp2 = new JCheckBox("coxinha");
        jcOp2.setSelected(true);
        add(jcOp2);
        jcOp3 = new JCheckBox("xtudo");
        add(jcOp3);

        
       
        setSize(800, 600);
        setVisible(true);
    }
    public static void main(String [] args){
        Mavenproject1 s = new Mavenproject1();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == cbEst){
            if(cbEst.getSelectedIndex() == 0){
                cbCid.removeAllItems();
         }
            else if(cbEst.getSelectedIndex() == 1){
                cbCid.removeAllItems();
                for(int i = 0; i <= 3; i++ )
                    cbCid.insertItemAt(ma[i], i);
            }

            else if (cbEst.getSelectedIndex() == 2){
                cbCid.removeAllItems(); 
                for(int i = 0; i <= 3; i++)
                    cbCid.insertItemAt(pi[i], i);
            }
            else if (cbEst.getSelectedIndex () == 3){
                cbCid.removeAllItems();
                for(int i = 0; i<= 3; i++)
                     cbCid.insertItemAt(ce[i], i);
            }
        }

        if(ae.getSource()==bSalvar){
            
            boolean jc1 = jcOp1.isSelected();
            boolean jc2 = jcOp2.isSelected();
            boolean rb1 = rbOp1.isSelected();
            boolean rb2 = rbOp2.isSelected(); 
            JOptionPane.showMessageDialog(this,
                    "Salvo com sucesso!\n" + jc1 + "\n" + jc2 + "\n" + rb1 + "\n" + rb2);
        }else
        if(ae.getSource()==bLimpar){
            tfNome.setText("");
            tfId.setText("");
            cbEst.setSelectedIndex(0);
            cbCid.setSelectedIndex(0);
        }else
        if(ae.getSource()==bSair){
            System.exit(0);
        }
        if(ae.getSource()== tfNome){
             tfId.requestFocus();
        }
        if(ae.getSource() == tfId){
            cbEst.requestFocus();
        }
      
    }    
    
}