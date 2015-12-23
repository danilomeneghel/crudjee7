/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.*;
import javax.ejb.EJB;
import model.ProdutoFacade;
import entities.*;

/**
 *
 * @author Danilo
 */
@ManagedBean
@SessionScoped
public class ProdutoController {
    @EJB
    private ProdutoFacade produtoFacade;
    private Produto p = new Produto();

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }
        
    public ProdutoController() {
    }
    
    public List<Produto> findAll(){
        return this.produtoFacade.findAll();
    }
    
    public String add(){
        this.produtoFacade.create(this.p);
        this.p = new Produto();
        return "index";
    }
    
    public String edit(Produto p){
        this.p = p;
        return "editar";
    }
    
    public String edit(){
        this.produtoFacade.edit(this.p);
        this.p = new Produto();
        return "index";
    }
    
    public void delete(Produto p){
        this.produtoFacade.remove(p);
    }
}
