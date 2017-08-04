package cn.com.lanou.domain;

import java.util.Date;

public class Serverinfo {
    private Integer id;

    private String cpuusage;

    private String setcpuusage;

    private String jvmusage;

    private String setjvmusage;

    private String ramusage;

    private String setramusage;

    private String email;

    private Date opertime;

    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpuusage() {
        return cpuusage;
    }

    public void setCpuusage(String cpuusage) {
        this.cpuusage = cpuusage == null ? null : cpuusage.trim();
    }

    public String getSetcpuusage() {
        return setcpuusage;
    }

    public void setSetcpuusage(String setcpuusage) {
        this.setcpuusage = setcpuusage == null ? null : setcpuusage.trim();
    }

    public String getJvmusage() {
        return jvmusage;
    }

    public void setJvmusage(String jvmusage) {
        this.jvmusage = jvmusage == null ? null : jvmusage.trim();
    }

    public String getSetjvmusage() {
        return setjvmusage;
    }

    public void setSetjvmusage(String setjvmusage) {
        this.setjvmusage = setjvmusage == null ? null : setjvmusage.trim();
    }

    public String getRamusage() {
        return ramusage;
    }

    public void setRamusage(String ramusage) {
        this.ramusage = ramusage == null ? null : ramusage.trim();
    }

    public String getSetramusage() {
        return setramusage;
    }

    public void setSetramusage(String setramusage) {
        this.setramusage = setramusage == null ? null : setramusage.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}