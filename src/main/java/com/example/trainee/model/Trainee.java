package com.example.trainee.model;

import jakarta.persistence.*;

@Entity
public class Trainee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
    private String skills;
    private String summary;
    private String experience;
    private String education;
    private String projects;
    private String profileImageUrl;

    public Trainee() {}

    public Trainee(String name, String role, String skills, String summary, String experience, String education, String projects, String profileImageUrl) {
        this.name = name;
        this.role = role;
        this.skills = skills;
        this.summary = summary;
        this.experience = experience;
        this.education = education;
        this.projects = projects;
        this.profileImageUrl = profileImageUrl;
    }

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }

    public String getProjects() { return projects; }
    public void setProjects(String projects) { this.projects = projects; }

    public String getProfileImageUrl() { return profileImageUrl; }
    public void setProfileImageUrl(String profileImageUrl) { this.profileImageUrl = profileImageUrl; }
}
