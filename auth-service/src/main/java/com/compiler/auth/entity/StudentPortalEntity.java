package com.compiler.auth.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_portal")
public class StudentPortalEntity 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // Primary Key

    // Personal Details
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "phone_number", nullable = false, length = 10, unique = true)
    private String phoneNumber;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "house_name", nullable = false)
    private String housename;

    @Column(name = "pincode", nullable = false, length = 6)
    private String pincode;

    // College Details
    @Column(name = "current_semester", nullable = false)
    private String currentSemester;

    @Column(name = "current_cgpa", nullable = false)
    private double currentCgpa;

    @Column(name = "ktu_id", nullable = false, unique = true)
    private String ktuId;

    // Authentication Details
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    // Education Details
    @Column(name = "high_school_course", nullable = false)
    private String highSchoolCourse;

    @Column(name = "high_school_college", nullable = false)
    private String highSchoolCollege;

    @Column(name = "high_school_graduation_year", nullable = false)
    private int highSchoolGraduationYear;

    @Column(name = "higher_secondary_course", nullable = false)
    private String higherSecondaryCourse;

    @Column(name = "higher_secondary_college", nullable = false)
    private String higherSecondaryCollege;

    @Column(name = "higher_secondary_graduation_year", nullable = false)
    private int higherSecondaryGraduationYear;

    @Column(name = "graduation_degree", nullable = false)
    private String graduationDegree;

    @Column(name = "graduation_college", nullable = false)
    private String graduationCollege;

    @Column(name = "graduation_graduation_year", nullable = false)
    private String graduationGraduationYear;

    // Projects
    @Column(name = "mini_project_name")
    private String miniProjectName;

    @Column(name = "mini_project_stack")
    private String miniProjectStack;

    @Column(name = "mini_project_year")
    private String miniProjectYear;

    @Column(name = "main_project_name")
    private String mainProjectName;

    @Column(name = "main_project_stack")
    private String mainProjectStack;

    @Column(name = "main_project_year")
    private String mainProjectYear;

    @Column(name = "personal_project_name")
    private String personalProjectName;

    @Column(name = "personal_project_stack")
    private String personalProjectStack;

    @Column(name = "personal_project_year")
    private String personalProjectYear;

    // Frameworks, Languages & Skills
    @Column(name = "frameworks_known_1")
    private String frameworksKnown1;

    @Column(name = "frameworks_known_2")
    private String frameworksKnown2;

    @Column(name = "frameworks_known_3")
    private String frameworksKnown3;

    @Column(name = "programming_languages_1")
    private String programmingLanguages1;

    @Column(name = "programming_languages_2")
    private String programmingLanguages2;

    @Column(name = "programming_languages_3")
    private String programmingLanguages3;

    @Column(name = "languages_known_1")
    private String languagesKnown1;

    @Column(name = "languages_known_2")
    private String languagesKnown2;

    @Column(name = "languages_known_3")
    private String languagesKnown3;

    // Hobbies & Achievements
    @Column(name = "hobbies_1")
    private String hobbies1;

    @Column(name = "hobbies_2")
    private String hobbies2;

    @Column(name = "hobbies_3")
    private String hobbies3;

    @Column(name = "achievements_1")
    private String achievements1;

    @Column(name = "achievements_2")
    private String achievements2;

    @Column(name = "achievements_3")
    private String achievements3;

    @Column(name = "soft_skills_1")
    private String softSkills1;

    @Column(name = "soft_skills_2")
    private String softSkills2;

    @Column(name = "soft_skills_3")
    private String softSkills3;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
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
    
    

}
