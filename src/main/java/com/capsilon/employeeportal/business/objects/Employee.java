package com.capsilon.employeeportal.business.objects;

import java.util.Date;

public class Employee extends Record
{
	private Integer employeeId;
	private String name;
	private String emailId;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private Date dateOfResignation;
	private String designation;
	private Integer salary;
	private Integer reportingManagerId;
	private String reportingManagerName;
	private String capsilonPortalRole;
	private String status;	
	private String bloodGroup;
	private String PAN_Number;
	private String current_PIN_Code;
	private String currentAddress;
	private String permanent_PIN_Code;
	private String parmentAddress;
	private String personalEmail;
	private String cellPhone;
	private String homePhone;	
	private String skillSet;

	//Emergency Contacts
	private String NameOfPrimaryContact;	
	private String relationshipWithPrimaryContact;	
	private String addressOfPrimaryContact;	
	private String contactNumberOfPrimaryContact;	
	private String nameOfSecondaryContact;	
	private String relationshipWithSecondaryContact;	
	private String addressOfSecondaryContact;	
	private String contactNumberOfSecondaryContact;
	 
	//Capsilon Employment History	 
	private String Department;	
	private String Workphone;	 
	 
	//Education Qualification
	private String highestDegree;
	private String specialization;
	private Date yearOfCompletion;
	private int monthOfExprience;			 
	 
	//Passport and Visa Details
	private boolean haveValidPssport;
	private String passportNumber;
	private Date dateOfExpiry;
	private String haveValidVisa;
	private String visaNumber;
	private Date DateOfExpiryOfVisa;
	
	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPAN_Number() {
		return PAN_Number;
	}

	public void setPAN_Number(String pAN_Number) {
		PAN_Number = pAN_Number;
	}

	public String getCurrentPIN_Code() {
		return current_PIN_Code;
	}

	public void setCurrentPIN_Code(String pIN_Code) {
		current_PIN_Code = pIN_Code;
	}
	
	public String getPermanentPIN_Code() {
		return permanent_PIN_Code;
	}

	public void setPermanentPIN_Code(String pIN_Code) {
		permanent_PIN_Code = pIN_Code;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getParmentAddress() {
		return parmentAddress;
	}

	public void setParmentAddress(String parmentAddress) {
		this.parmentAddress = parmentAddress;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
		 
	public String getNameOfPrimaryContact() {
		return NameOfPrimaryContact;
	}

	public void setNameOfPrimaryContact(String nameOfPrimaryContact) {
		NameOfPrimaryContact = nameOfPrimaryContact;
	}

	public String getRelationshipWithPrimaryContact() {
		return relationshipWithPrimaryContact;
	}

	public void setRelationshipWithPrimaryContact(String relationshipWithPrimaryContact) {
		this.relationshipWithPrimaryContact = relationshipWithPrimaryContact;
	}

	public String getAddressOfPrimaryContact() {
		return addressOfPrimaryContact;
	}

	public void setAddressOfPrimaryContact(String addressOfPrimaryContact) {
		this.addressOfPrimaryContact = addressOfPrimaryContact;
	}

	public String getContactNumberOfPrimaryContact() {
		return contactNumberOfPrimaryContact;
	}

	public void setContactNumberOfPrimaryContact(String contactNumberOfPrimaryContact) {
		this.contactNumberOfPrimaryContact = contactNumberOfPrimaryContact;
	}

	public String getNameOfSecondaryContact() {
		return nameOfSecondaryContact;
	}

	public void setNameOfSecondaryContact(String nameOfSecondaryContact) {
		this.nameOfSecondaryContact = nameOfSecondaryContact;
	}

	public String getRelationshipWithSecondaryContact() {
		return relationshipWithSecondaryContact;
	}

	public void setRelationshipWithSecondaryContact(String relationshipWithSecondaryContact) {
		this.relationshipWithSecondaryContact = relationshipWithSecondaryContact;
	}

	public String getAddressOfSecondaryContact() {
		return addressOfSecondaryContact;
	}

	public void setAddressOfSecondaryContact(String addressOfSecondaryContact) {
		this.addressOfSecondaryContact = addressOfSecondaryContact;
	}

	public String getContactNumberOfSecondaryContact() {
		return contactNumberOfSecondaryContact;
	}

	public void setContactNumberOfSecondaryContact(String contactNumberOfSecondaryContact) {
		this.contactNumberOfSecondaryContact = contactNumberOfSecondaryContact;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getWorkphone() {
		return Workphone;
	}

	public void setWorkphone(String workphone) {
		Workphone = workphone;
	}

	public String getHighestDegree() {
		return highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Date getYearOfCompletion() {
		return yearOfCompletion;
	}

	public void setYearOfCompletion(Date yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}

	public int getMonthOfExprience() {
		return monthOfExprience;
	}

	public void setMonthOfExprience(int monthOfExprience) {
		this.monthOfExprience = monthOfExprience;
	}

	public boolean isHaveValidPassport() {
		return haveValidPssport;
	}

	public void setHaveValidPassport(boolean havepassport) {
		this.haveValidPssport = havepassport;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getHaveValidVisa() {
		return haveValidVisa;
	}

	public void setHaveValidVisa(String haveValidVisa) {
		this.haveValidVisa = haveValidVisa;
	}

	public String getVisaNumber() {
		return visaNumber;
	}

	public void setVisaNumber(String visaNumber) {
		this.visaNumber = visaNumber;
	}

	public Date getDateOfExpiryOfVisa() {
		return DateOfExpiryOfVisa;
	}

	public void setDateOfExpiryOfVisa(Date dateOfExpiryOfVisa) {
		DateOfExpiryOfVisa = dateOfExpiryOfVisa;
	}




	public Integer getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId)
	{
		this.employeeId = employeeId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining()
	{
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfResignation()
	{
		return dateOfResignation;
	}

	public void setDateOfResignation(Date dateOfResignation)
	{
		this.dateOfResignation = dateOfResignation;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	public Integer getSalary()
	{
		return salary;
	}

	public void setSalary(Integer salary)
	{
		this.salary = salary;
	}

	public Integer getReportingManagerId()
	{
		return reportingManagerId;
	}

	public void setReportingManagerId(Integer reportingManagerId)
	{
		this.reportingManagerId = reportingManagerId;
	}

	public String getReportingManagerName()
	{
		return reportingManagerName;
	}

	public void setReportingManagerName(String reportingManagerName)
	{
		this.reportingManagerName = reportingManagerName;
	}

	public String getCapsilonPortalRole()
	{
		return capsilonPortalRole;
	}

	public void setCapsilonPortalRole(String capsilonPortalRole)
	{
		this.capsilonPortalRole = capsilonPortalRole;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}
