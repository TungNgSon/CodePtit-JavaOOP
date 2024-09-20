/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest1.lop_user;

/**
 *
 * @author Moment
 */
public class TaiKhoan {
    private String id,pass;
    public TaiKhoan(String id,String pass)
    {
        this.id=id;
        this.pass=pass;
    }
    public String getId()
    {
        return this.id;
    }
    public String getPass()
    {
        return this.pass;
    }
    public boolean isValid(TaiKhoan tk)
    {
        if(this.id.equals(tk.getId())&&this.pass.equals(tk.getPass()))
        {
            return true;
        }
        return false;
    }
}
