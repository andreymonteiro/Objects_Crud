/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudfuncoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tarde.cetafaju
 */
public class CrudFuncoes {

    /**
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Produto>lista = new ArrayList<Produto>();
        int id=1; 
        boolean close = false;
        while(close == false){
        String linha = "--------------------------";
        System.out.println(linha);
        System.out.println("Funcões: \n 1-Cadastrar \n 2-Consultar por ID \n 3-Listar Todos \n 4-Alterar \n 5-Excluir por ID \n 6-Excluir Todos \n 7-Sair");
            //System.out.println(linha);
        String number = sc.nextLine();
        switch (number){
            
            case "1":
                Produto p = new Produto();
                System.out.println(linha);
                System.out.println("::::::::Cadastrar::::::::");
                System.out.println("Digite seu Nome");
                p.setNome(sc.nextLine());
                System.out.println("Digite a Descrição");
                p.setDesc(sc.nextLine());
                System.out.println("Digite o Valor");
                p.setValor(Double.parseDouble(sc.nextLine()));
                p.setId(id);
                id++;
                lista.add(p);
                break;
            case "2":
                Produto pali = new Produto();
                System.out.println(linha);
                System.out.println("::::::::Consultar por ID::::::::");
                  System.out.println("id");
                pali.setId(Integer.parseInt(sc.nextLine()));
                
                  for (int i = 0; i < lista.size(); i++) {
                       if (lista.get(i).getId() == pali.getId()) {
                  
                      System.out.println(lista.get(i).getId()+" ! "+lista.get(i).getNome()+" ! "+lista.get(i).getDesc()+" ! "+lista.get(i).getValor());
                       } 
                  }
               
                break;
            case "3":
                    System.out.println("::::::::Listar Todos::::::::");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i).getId() + "|" + lista.get(i).getNome() + "|" + lista.get(i).getDesc() + "|" + lista.get(i).getValor());
                    }
                break;
            case "4":
                Produto palt = new Produto();
                System.out.println(linha);
                System.out.println("::::::::Alterar::::::::");
                System.out.println("id");
                palt.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Altere seu Nome");
                palt.setNome(sc.nextLine());
                System.out.println("Altere sua Descrição");
                palt.setDesc(sc.nextLine());
                System.out.println("Altere seu Valor");
                palt.setValor(Double.parseDouble (sc.nextLine()));
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getId() == palt.getId()) {
                        lista.get(i).setNome(palt.getNome());
                        lista.get(i).setDesc(palt.getDesc());
                        lista.get(i).setValor(palt.getValor());
                    }
                }
                break;
            case "5":
               Produto pex = new Produto();
                System.out.println(linha);
              System.out.println("::::::::Excluir por id::::::::");
              System.out.println("id:");
               pex.setId(Integer.parseInt(sc.nextLine()));
             
                for (int i = 0; i < lista.size(); i++){
                    if (lista.get(i).getId() == pex.getId()) {
                    
                lista.get(i).setNome(pex.getNome());
                lista.get(i).setDesc(pex.getDesc());
                lista.get(i).setValor(pex.getValor());
                lista.remove(i);
                }}
                
                    break;
                
               
                
            case "6": 
                 Produto papel = new Produto();
                 System.out.println("::::::::Excluir Todos::::::::");
                
                    for (int i = 0; i < lista.size(); i++) {
                        
                papel.setId(lista.get(i).getId());
                papel.setNome(lista.get(i).getNome());
                papel.setDesc(lista.get(i).getDesc());
                papel.setValor(lista.get(i).getValor());
                lista.removeAll(lista);
                    }
                break;
              
            case "7":
                close = true;
                break;
    }
               
    }
}}

