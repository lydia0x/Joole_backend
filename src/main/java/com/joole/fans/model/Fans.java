package com.joole.fans.model;


import javax.persistence.*;

@Entity
@Table(name = "fans")
public class Fans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String manufacturer;

    @Column
    private String series;

    @Column
    private String model;

    @Column
    private String use_type;

    @Column
    private String application;

    @Column
    private String mounting_location;

    @Column
    private String accessories;

    @Column
    private int model_year;

    @Column
    private int airflow;

    @Column
    private double power_min;

    @Column
    private double power_max;

    @Column
    private int operating_voltage_min;

    @Column
    private int operating_voltage_max;

    @Column
    private int fan_speed_min;

    @Column
    private int fan_speed_max;

    @Column
    private int number_of_fan_speeds;

    @Column
    private int sound_at_max_speed;

    @Column
    private int fan_sweep_diameter;

    @Column
    private double height_min;

    @Column
    private double height_max;

    @Column
    private double weight;

    @Column
    private String detail;

    @Column
    private int firm;

    @Column
    private int global;

    @Column
    private String contact_s_name;

    @Column
    private String contact_s_phone;

    @Column
    private String contact_s_email;

    @Column
    private String contact_s_web;

    @Column
    private String contact_m_department;

    @Column
    private String contact_m_phone;

    @Column
    private String contact_m_email;

    @Column
    private String contact_m_web;

    @Column
    private String fan_image;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUse_type() {
        return use_type;
    }

    public void setUse_type(String use_type) {
        this.use_type = use_type;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMounting_location() {
        return mounting_location;
    }

    public void setMounting_location(String mounting_location) {
        this.mounting_location = mounting_location;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public int getModel_year() {
        return model_year;
    }

    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }

    public int getAirflow() {
        return airflow;
    }

    public void setAirflow(int airflow) {
        this.airflow = airflow;
    }

    public double getPower_min() {
        return power_min;
    }

    public void setPower_min(double power_min) {
        this.power_min = power_min;
    }

    public double getPower_max() {
        return power_max;
    }

    public void setPower_max(double power_max) {
        this.power_max = power_max;
    }

    public int getOperating_voltage_min() {
        return operating_voltage_min;
    }

    public void setOperating_voltage_min(int operating_voltage_min) {
        this.operating_voltage_min = operating_voltage_min;
    }

    public int getOperating_voltage_max() {
        return operating_voltage_max;
    }

    public void setOperating_voltage_max(int operating_voltage_max) {
        this.operating_voltage_max = operating_voltage_max;
    }

    public int getFan_speed_min() {
        return fan_speed_min;
    }

    public void setFan_speed_min(int fan_speed_min) {
        this.fan_speed_min = fan_speed_min;
    }

    public int getFan_speed_max() {
        return fan_speed_max;
    }

    public void setFan_speed_max(int fan_speed_max) {
        this.fan_speed_max = fan_speed_max;
    }

    public int getNumber_of_fan_speeds() {
        return number_of_fan_speeds;
    }

    public void setNumber_of_fan_speeds(int number_of_fan_speeds) {
        this.number_of_fan_speeds = number_of_fan_speeds;
    }

    public int getSound_at_max_speed() {
        return sound_at_max_speed;
    }

    public void setSound_at_max_speed(int sound_at_max_speed) {
        this.sound_at_max_speed = sound_at_max_speed;
    }

    public int getFan_sweep_diameter() {
        return fan_sweep_diameter;
    }

    public void setFan_sweep_diameter(int fan_sweep_diameter) {
        this.fan_sweep_diameter = fan_sweep_diameter;
    }

    public double getHeight_min() {
        return height_min;
    }

    public void setHeight_min(double height_min) {
        this.height_min = height_min;
    }

    public double getHeight_max() {
        return height_max;
    }

    public void setHeight_max(double height_max) {
        this.height_max = height_max;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getFirm() {
        return firm;
    }

    public void setFirm(int firm) {
        this.firm = firm;
    }

    public int getGlobal() {
        return global;
    }

    public void setGlobal(int global) {
        this.global = global;
    }

    public String getContact_s_name() {
        return contact_s_name;
    }

    public void setContact_s_name(String contact_s_name) {
        this.contact_s_name = contact_s_name;
    }

    public String getContact_s_phone() {
        return contact_s_phone;
    }

    public void setContact_s_phone(String contact_s_phone) {
        this.contact_s_phone = contact_s_phone;
    }

    public String getContact_s_email() {
        return contact_s_email;
    }

    public void setContact_s_email(String contact_s_email) {
        this.contact_s_email = contact_s_email;
    }

    public String getContact_s_web() {
        return contact_s_web;
    }

    public void setContact_s_web(String contact_s_web) {
        this.contact_s_web = contact_s_web;
    }

    public String getContact_m_department() {
        return contact_m_department;
    }

    public void setContact_m_department(String contact_m_department) {
        this.contact_m_department = contact_m_department;
    }

    public String getContact_m_phone() {
        return contact_m_phone;
    }

    public void setContact_m_phone(String contact_m_phone) {
        this.contact_m_phone = contact_m_phone;
    }

    public String getContact_m_email() {
        return contact_m_email;
    }

    public void setContact_m_email(String contact_m_email) {
        this.contact_m_email = contact_m_email;
    }

    public String getContact_m_web() {
        return contact_m_web;
    }

    public void setContact_m_web(String contact_m_web) {
        this.contact_m_web = contact_m_web;
    }

    public String getFan_image() {
        return fan_image;
    }

    public void setFan_image(String fan_image) {
        this.fan_image = fan_image;
    }


}