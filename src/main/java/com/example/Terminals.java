package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.validator.constraints.NotEmpty;

@Entity 
public class Terminals {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }	
	
    @Column(name = "terminal_id")
    @NotEmpty
	protected String terminalId;
	
    @Column(name = "customer_num")
	protected String customerNum;
    
    @Column(name = "preference")
    protected String preference;

    @Column(name = "preference_value")
    protected String preferenceValue;
	

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getCustomerNum() {
		return this.customerNum;
	}

	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}

	public String getPreference() {
		return this.preference;
	}

	public void setPreferenceValue(String preferenceValue) {
		this.preferenceValue = preferenceValue;
	}
	public String getPreferenceValue() {
		return this.preferenceValue;
	}

	public void setPreference(String preferenceValue) {
		this.preferenceValue = preferenceValue;
	}
}
