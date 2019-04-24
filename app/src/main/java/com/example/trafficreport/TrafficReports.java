package com.example.trafficreport;

public class TrafficReports {

    private String namaJalan;
    private String deskripsi;
    private String idPembuat;
    private String idReport;


    public String getIdPembuat() {
        return idPembuat;
    }

    public void setIdPembuat(String idPembuat) {
        this.idPembuat = idPembuat;
    }

    public String getIdReport() {
        return idReport;
    }

    public void setIdReport(String idReport) {
        this.idReport = idReport;
    }

    public String getNamaJalan() {
        return namaJalan;
    }

    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public TrafficReports(String namaJalan, String deskripsi, String idPembuat, String idReport) {
        this.namaJalan = namaJalan;
        this.deskripsi = deskripsi;
        this.idPembuat = idPembuat;
        this.idReport = idReport;
    }
}