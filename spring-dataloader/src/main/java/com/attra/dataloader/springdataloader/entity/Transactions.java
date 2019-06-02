package com.attra.dataloader.springdataloader.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transactions")
public class Transactions {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	
	private String acquirerBankCode;
	
	private String issuerBankCode;
	
	private String outletNumber;
	
	private String terminalId;
	
	private String terminalType;
	
	private String merchantCity;
	
	private String merchantState;
	
	private String merchantCountry;
	
	private String merchantZipcode;
	
	private String mcc;
	
	private String mcg;
	
	private String cardType;
	
	private String productType;
	
	private String networkCode;
	
	private String acquirerId;
	
	private int transactionAmount;
	
	private String transactionCurrency;
	
	private int interchangeFees;
	
	private String deviceTypeIndicator;
	
	private int surchargeBillingAmount;	
	
	private String processingCode;
	
	private int serviceTax;
	private Date transactionDate;

	public String getAcquirerBankCode() {
		return acquirerBankCode;
	}

	public void setAcquirerBankCode(String acquirerBankCode) {
		this.acquirerBankCode = acquirerBankCode;
	}

	public String getIssuerBankCode() {
		return issuerBankCode;
	}

	public void setIssuerBankCode(String issuerBankCode) {
		this.issuerBankCode = issuerBankCode;
	}

	public String getOutletNumber() {
		return outletNumber;
	}

	public void setOutletNumber(String outletNumber) {
		this.outletNumber = outletNumber;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantState() {
		return merchantState;
	}

	public void setMerchantState(String merchantState) {
		this.merchantState = merchantState;
	}

	public String getMerchantCountry() {
		return merchantCountry;
	}

	public void setMerchantCountry(String merchantCountry) {
		this.merchantCountry = merchantCountry;
	}

	public String getMerchantZipCode() {
		return merchantZipcode;
	}

	public void setMerchantZipCode(String merchantZipCode) {
		this.merchantZipcode = merchantZipCode;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMcg() {
		return mcg;
	}

	public void setMcg(String mcg) {
		this.mcg = mcg;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getNetworkCode() {
		return networkCode;
	}

	public void setNetworkCode(String networkCode) {
		this.networkCode = networkCode;
	}

	public String getAcquirerId() {
		return acquirerId;
	}

	public void setAcquirerId(String acquirerId) {
		this.acquirerId = acquirerId;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public int getInterchangeFees() {
		return interchangeFees;
	}

	public void setInterchangeFees(int interchangeFees) {
		this.interchangeFees = interchangeFees;
	}

	public String getDeviceTypeIndicator() {
		return deviceTypeIndicator;
	}

	public void setDeviceTypeIndicator(String deviceTypeIndicator) {
		this.deviceTypeIndicator = deviceTypeIndicator;
	}

	public int getSurchargeBillingAmount() {
		return surchargeBillingAmount;
	}

	public void setSurchargeBillingAmount(int surchargeBillingAmount) {
		this.surchargeBillingAmount = surchargeBillingAmount;
	}

	public String getProcessingCode() {
		return processingCode;
	}

	public void setProcessingCode(String processingCode) {
		this.processingCode = processingCode;
	}

	public int getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(int serviceTax) {
		this.serviceTax = serviceTax;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId
				+ ", acquirerBankCode=" + acquirerBankCode
				+ ", issuerBankCode=" + issuerBankCode + ", outletNumber="
				+ outletNumber + ", terminalId=" + terminalId
				+ ", terminalType=" + terminalType + ", merchantCity="
				+ merchantCity + ", merchantState=" + merchantState
				+ ", merchantCountry=" + merchantCountry + ", merchantZipcode="
				+ merchantZipcode + ", mcc=" + mcc + ", mcg=" + mcg
				+ ", cardType=" + cardType + ", productType=" + productType
				+ ", networkCode=" + networkCode + ", acquirerId=" + acquirerId
				+ ", transactionAmount=" + transactionAmount
				+ ", transactionCurrency=" + transactionCurrency
				+ ", interchangeFees=" + interchangeFees
				+ ", deviceTypeIndicator=" + deviceTypeIndicator
				+ ", surchargeBillingAmount=" + surchargeBillingAmount
				+ ", processingCode=" + processingCode + ", serviceTax="
				+ serviceTax + "]";
	}
	
	

}
