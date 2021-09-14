/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Util.HibernateUtil;

/**
 *
 * @author Xavier de Jesus
 */
public class OcmsProject {
    
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
        HibernateUtil.getSessionFactory().close();
    }
    
}
