/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbibliotecariahibernate;

/**
 *
 * @author CONFIMOVIL
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class TestConexion {
    public static void main(String[] args) {
        try {
            // Obtener la SessionFactory
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            // Abrir sesión
            Session session = sessionFactory.openSession();

            System.out.println("Conexión a la base de datos establecida correctamente.");

            // Cerrar sesión
            session.close();
            sessionFactory.close();
        } catch (Exception e) {
            System.out.println("Error en la conexión a la base de datos:");
            e.printStackTrace();
        }
    }
}