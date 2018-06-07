package sample;

public class TotExistMom {
    private int logID;
    private java.sql.Timestamp totalLicExist;
    private int all_dfr;
    private int all_cm;
    private int all_fud;
    private int all_pcd;
    private int all_vie;

    public TotExistMom(int logID, java.sql.Timestamp totalLicExist, int all_dfr, int all_cm, int all_fud, int all_pcd, int all_vie) {
        this.logID = logID;
        this.totalLicExist = totalLicExist;
        this.all_dfr = all_dfr;
        this.all_cm = all_cm;
        this.all_fud = all_fud;
        this.all_pcd = all_pcd;
        this.all_vie = all_vie;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public java.util.Date getTotalLicExist() {
        return totalLicExist;
    }

    public void setTotalLicExist(java.sql.Timestamp totalLicExist) {
        this.totalLicExist = totalLicExist;
    }

    public int getAll_dfr() {
        return all_dfr;
    }

    public void setAll_dfr(int all_dfr) {
        this.all_dfr = all_dfr;
    }

    public int getAll_cm() {
        return all_cm;
    }

    public void setAll_cm(int all_cm) {
        this.all_cm = all_cm;
    }

    public int getAll_fud() {
        return all_fud;
    }

    public void setAll_fud(int all_fud) {
        this.all_fud = all_fud;
    }

    public int getAll_pcd() {
        return all_pcd;
    }

    public void setAll_pcd(int all_pcd) {
        this.all_pcd = all_pcd;
    }

    public int getAll_vie() {
        return all_vie;
    }

    public void setAll_vie(int all_vie) {
        this.all_vie = all_vie;
    }
}
