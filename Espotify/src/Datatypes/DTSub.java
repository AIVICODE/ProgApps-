/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datatypes;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author ivan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class DTSub {
    @XmlElement
    private Long id; // ID de la suscripción
    @XmlElement
    private String cliente; // Nombre o ID del cliente
    @XmlElement
    private String tipo; // Tipo de suscripción (semanal, mensual, anual)
    @XmlElement
    private String estado; // Estado de la suscripción (Pendiente, Vigente, Cancelada, Vencida)
    @XmlElement
    private Date fechaActivacion; // Fecha en que se activó la suscripción
    @XmlElement
    private Date fechaVencimiento; // Fecha de vencimiento de la suscripción

    // Constructor
    public DTSub() {}

    public DTSub(Long id, String cliente, String tipo, String estado, Date fechaActivacion) {
        this.id = id;
        this.cliente = cliente;
        this.tipo = tipo;
        this.estado = estado;
        this.fechaActivacion = fechaActivacion;

    }

    // Getters y Setters    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }
    
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


}
