package sample;

import java.sql.Timestamp;

public class TotUseMom {

    private int logID;
    private java.sql.Timestamp totalLicExist;
    private int used_dfr;
    private int used_cm;
    private int used_fud;
    private int used_pcd;
    private int used_vie;

    public TotUseMom(int logID, Timestamp totalLicExist, int used_dfr, int used_cm, int used_fud, int used_pcd, int used_vie) {
        this.logID = logID;
        this.totalLicExist = totalLicExist;
        this.used_dfr = used_dfr;
        this.used_cm = used_cm;
        this.used_fud = used_fud;
        this.used_pcd = used_pcd;
        this.used_vie = used_vie;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public Timestamp getTotalLicExist() {
        return totalLicExist;
    }

    public void setTotalLicExist(Timestamp totalLicExist) {
        this.totalLicExist = totalLicExist;
    }

    public int getUsed_dfr() {
        return used_dfr;
    }

    public void setUsed_dfr(int used_dfr) {
        this.used_dfr = used_dfr;
    }

    public int getUsed_cm() {
        return used_cm;
    }

    public void setUsed_cm(int used_cm) {
        this.used_cm = used_cm;
    }

    public int getUsed_fud() {
        return used_fud;
    }

    public void setUsed_fud(int used_fud) {
        this.used_fud = used_fud;
    }

    public int getUsed_pcd() {
        return used_pcd;
    }

    public void setUsed_pcd(int used_pcd) {
        this.used_pcd = used_pcd;
    }

    public int getUsed_vie() {
        return used_vie;
    }

    public void setUsed_vie(int used_vie) {
        this.used_vie = used_vie;
    }
}
