package com.compiler.auth.dto;
import jakarta.validation.constraints.*;

public class StudentPortalDTO 
{
	// Personal Details
    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name should not exceed 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name should not exceed 50 characters")
    private String lastName;
    
    private String username;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phoneNumber;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "House name is required")
    private String collegename;

    @NotBlank(message = "Pincode is required")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
    private String pincode;

    // College Details
    @NotBlank(message = "Current semester is required")
    private String currentSemester;

    @DecimalMin(value = "0.0", inclusive = true, message = "CGPA must be at least 0.0")
    @DecimalMax(value = "10.0", inclusive = true, message = "CGPA cannot be more than 10.0")
    private double currentCgpa;

    @NotBlank(message = "KTU ID is required")
    private String ktuId;

    // Authentication Details
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    // Education Details
    @NotBlank(message = "High school course is required")
    private String highSchoolCourse;

    @NotBlank(message = "High school college name is required")
    private String highSchoolCollege;

    @Min(value = 1900, message = "Invalid graduation year")
    private int highSchoolGraduationYear;

    @NotBlank(message = "Higher secondary course is required")
    private String higherSecondaryCourse;

    @NotBlank(message = "Higher secondary college name is required")
    private String higherSecondaryCollege;

    @Min(value = 1900, message = "Invalid graduation year")
    private int higherSecondaryGraduationYear;

    @NotBlank(message = "Graduation degree is required")
    private String graduationDegree;

    @NotBlank(message = "Graduation college name is required")
    private String graduationCollege;

    @NotBlank(message = "Graduation year is required")
    private String graduationGraduationYear;

    // Projects
    private String miniProjectName;
    private String miniProjectStack;
    private String miniProjectYear;

    private String mainProjectName;
    private String mainProjectStack;
    private String mainProjectYear;

    private String personalProjectName;
    private String personalProjectStack;
    private String personalProjectYear;

    // Frameworks, Languages & Skills
    private String frameworksKnown1;
    private String frameworksKnown2;
    private String frameworksKnown3;

    private String programmingLanguages1;
    private String programmingLanguages2;
    private String programmingLanguages3;

    private String languagesKnown1;
    private String languagesKnown2;
    private String languagesKnown3;

    // Hobbies & Achievements
    private String hobbies1;
    private String hobbies2;
    private String hobbies3;

    private String achievements1;
    private String achievements2;
    private String achievements3;

    private String softSkills1;
    private String softSkills2;
    private String softSkills3;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCurrentSemester() {
		return currentSemester;
	}
	public void setCurrentSemester(String currentSemester) {
		this.currentSemester = currentSemester;
	}
	public double getCurrentCgpa() {
		return currentCgpa;
	}
	public void setCurrentCgpa(double currentCgpa) {
		this.currentCgpa = currentCgpa;
	}
	public String getKtuId() {
		return ktuId;
	}
	public void setKtuId(String ktuId) {
		this.ktuId = ktuId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHighSchoolCourse() {
		return highSchoolCourse;
	}
	public void setHighSchoolCourse(String highSchoolCourse) {
		this.highSchoolCourse = highSchoolCourse;
	}
	public String getHighSchoolCollege() {
		return highSchoolCollege;
	}
	public void setHighSchoolCollege(String highSchoolCollege) {
		this.highSchoolCollege = highSchoolCollege;
	}
	public int getHighSchoolGraduationYear() {
		return highSchoolGraduationYear;
	}
	public void setHighSchoolGraduationYear(int highSchoolGraduationYear) {
		this.highSchoolGraduationYear = highSchoolGraduationYear;
	}
	public String getHigherSecondaryCourse() {
		return higherSecondaryCourse;
	}
	public void setHigherSecondaryCourse(String higherSecondaryCourse) {
		this.higherSecondaryCourse = higherSecondaryCourse;
	}
	public String getHigherSecondaryCollege() {
		return higherSecondaryCollege;
	}
	public void setHigherSecondaryCollege(String higherSecondaryCollege) {
		this.higherSecondaryCollege = higherSecondaryCollege;
	}
	public int getHigherSecondaryGraduationYear() {
		return higherSecondaryGraduationYear;
	}
	public void setHigherSecondaryGraduationYear(int higherSecondaryGraduationYear) {
		this.higherSecondaryGraduationYear = higherSecondaryGraduationYear;
	}
	public String getGraduationDegree() {
		return graduationDegree;
	}
	public void setGraduationDegree(String graduationDegree) {
		this.graduationDegree = graduationDegree;
	}
	public String getGraduationCollege() {
		return graduationCollege;
	}
	public void setGraduationCollege(String graduationCollege) {
		this.graduationCollege = graduationCollege;
	}
	public String getGraduationGraduationYear() {
		return graduationGraduationYear;
	}
	public void setGraduationGraduationYear(String graduationGraduationYear) {
		this.graduationGraduationYear = graduationGraduationYear;
	}
	public String getMiniProjectName() {
		return miniProjectName;
	}
	public void setMiniProjectName(String miniProjectName) {
		this.miniProjectName = miniProjectName;
	}
	public String getMiniProjectStack() {
		return miniProjectStack;
	}
	public void setMiniProjectStack(String miniProjectStack) {
		this.miniProjectStack = miniProjectStack;
	}
	public String getMiniProjectYear() {
		return miniProjectYear;
	}
	public void setMiniProjectYear(String miniProjectYear) {
		this.miniProjectYear = miniProjectYear;
	}
	public String getMainProjectName() {
		return mainProjectName;
	}
	public void setMainProjectName(String mainProjectName) {
		this.mainProjectName = mainProjectName;
	}
	public String getMainProjectStack() {
		return mainProjectStack;
	}
	public void setMainProjectStack(String mainProjectStack) {
		this.mainProjectStack = mainProjectStack;
	}
	public String getMainProjectYear() {
		return mainProjectYear;
	}
	public void setMainProjectYear(String mainProjectYear) {
		this.mainProjectYear = mainProjectYear;
	}
	public String getPersonalProjectName() {
		return personalProjectName;
	}
	public void setPersonalProjectName(String personalProjectName) {
		this.personalProjectName = personalProjectName;
	}
	public String getPersonalProjectStack() {
		return personalProjectStack;
	}
	public void setPersonalProjectStack(String personalProjectStack) {
		this.personalProjectStack = personalProjectStack;
	}
	public String getPersonalProjectYear() {
		return personalProjectYear;
	}
	public void setPersonalProjectYear(String personalProjectYear) {
		this.personalProjectYear = personalProjectYear;
	}
	public String getFrameworksKnown1() {
		return frameworksKnown1;
	}
	public void setFrameworksKnown1(String frameworksKnown1) {
		this.frameworksKnown1 = frameworksKnown1;
	}
	public String getFrameworksKnown2() {
		return frameworksKnown2;
	}
	public void setFrameworksKnown2(String frameworksKnown2) {
		this.frameworksKnown2 = frameworksKnown2;
	}
	public String getFrameworksKnown3() {
		return frameworksKnown3;
	}
	public void setFrameworksKnown3(String frameworksKnown3) {
		this.frameworksKnown3 = frameworksKnown3;
	}
	public String getProgrammingLanguages1() {
		return programmingLanguages1;
	}
	public void setProgrammingLanguages1(String programmingLanguages1) {
		this.programmingLanguages1 = programmingLanguages1;
	}
	public String getProgrammingLanguages2() {
		return programmingLanguages2;
	}
	public void setProgrammingLanguages2(String programmingLanguages2) {
		this.programmingLanguages2 = programmingLanguages2;
	}
	public String getProgrammingLanguages3() {
		return programmingLanguages3;
	}
	public void setProgrammingLanguages3(String programmingLanguages3) {
		this.programmingLanguages3 = programmingLanguages3;
	}
	public String getLanguagesKnown1() {
		return languagesKnown1;
	}
	public void setLanguagesKnown1(String languagesKnown1) {
		this.languagesKnown1 = languagesKnown1;
	}
	public String getLanguagesKnown2() {
		return languagesKnown2;
	}
	public void setLanguagesKnown2(String languagesKnown2) {
		this.languagesKnown2 = languagesKnown2;
	}
	public String getLanguagesKnown3() {
		return languagesKnown3;
	}
	public void setLanguagesKnown3(String languagesKnown3) {
		this.languagesKnown3 = languagesKnown3;
	}
	public String getHobbies1() {
		return hobbies1;
	}
	public void setHobbies1(String hobbies1) {
		this.hobbies1 = hobbies1;
	}
	public String getHobbies2() {
		return hobbies2;
	}
	public void setHobbies2(String hobbies2) {
		this.hobbies2 = hobbies2;
	}
	public String getHobbies3() {
		return hobbies3;
	}
	public void setHobbies3(String hobbies3) {
		this.hobbies3 = hobbies3;
	}
	public String getAchievements1() {
		return achievements1;
	}
	public void setAchievements1(String achievements1) {
		this.achievements1 = achievements1;
	}
	public String getAchievements2() {
		return achievements2;
	}
	public void setAchievements2(String achievements2) {
		this.achievements2 = achievements2;
	}
	public String getAchievements3() {
		return achievements3;
	}
	public void setAchievements3(String achievements3) {
		this.achievements3 = achievements3;
	}
	public String getSoftSkills1() {
		return softSkills1;
	}
	public void setSoftSkills1(String softSkills1) {
		this.softSkills1 = softSkills1;
	}
	public String getSoftSkills2() {
		return softSkills2;
	}
	public void setSoftSkills2(String softSkills2) {
		this.softSkills2 = softSkills2;
	}
	public String getSoftSkills3() {
		return softSkills3;
	}
	public void setSoftSkills3(String softSkills3) {
		this.softSkills3 = softSkills3;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
    
	
    
    
    
    
    
}
