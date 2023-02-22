/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Business;
import Business.UserAccount;
import UI.SysAdminWorkArea.AdminJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class SysAdminRole extends Roles{
    
    public SysAdminRole(){
        
    }
    
    @Override
    public JFrame getWorkArea(Business business, UserAccount useraccount) {
        return new AdminJFrame(business, useraccount);
    }
    
}
