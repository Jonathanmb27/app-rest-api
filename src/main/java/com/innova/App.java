package com.innova;

/*import com.innova.domain.Deuda;
import com.innova.domain.Inquilino;*/

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String args[]){

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("data");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        System.out.println("mejia");

        /*Inquilino inquilino=new Inquilino();
        inquilino.setNombreInquilino("jonathan");
        Deuda deuda=new Deuda();
        deuda.setCantidadDeuda(10);
        /*List<Deuda> deudaList=new ArrayList<>();
        deudaList.add(deuda);*/

       /* inquilino.setDeuda(deuda);
        deuda.setInquilino(inquilino);

        et.begin();
        em.persist(deuda);
        em.persist(inquilino);
        et.commit();
        Inquilino i=(Inquilino) em.find(Inquilino.class, 1l);
        i.getDeuda().forEach(s-> System.out.println("deuda: "+s.getCantidadDeuda()));*/

    }
}
