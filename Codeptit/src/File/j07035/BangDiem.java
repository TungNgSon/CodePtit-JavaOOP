/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.j07035;

/**
 *
 * @author Moment
 */
public class BangDiem implements Comparable<BangDiem>
{
    private SinhVien sv;
    private MonHoc mh;
    private String score;

    public BangDiem(SinhVien sv, MonHoc mh, String score) {
        this.sv = sv;
        this.mh = mh;
        this.score = score;
    }
    public String toString()
    {
        return sv.toString()+" "+this.score;
        
    }
    public String getIdSubject()
    {
        return this.mh.getId();
    }
    @Override 
    public int compareTo(BangDiem bd)
    {
        if(this.score==bd.score)
        {
            return this.sv.getId().compareTo(bd.sv.getId());
        }
        return bd.score.compareTo(this.score);
    }
}
