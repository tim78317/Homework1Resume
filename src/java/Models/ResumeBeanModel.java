
package Models;

/**
 *
 * @author timothy
 */
public class ResumeBeanModel {
    private String education = "EDUCATION <br><br> -Waukesha Technical College - Wctc <br> -Start Date:Fall 2010     End Date:Summer 2016 <br>-Field of Study: Web and Software Development";
    private String achievements = "ACHIEVEMENTS <br><br>-Excelled in Informations Systems Project Course and created an amazing application using ASp.Net <br> that was intergrated with SalesForce."; 
    private String skills = "SKILLS <br><br>-Proficient in Java <br> -Proficient in VB <br> -Proficient in ASP.Net <br> -Proficient in HTML <br> -Proficient in CSS <br> -Proficient in JavaScript <br>"
            + "-Proficient in jQuery <br>-Proficient in Objective C <br> -Proficient in C# <br> -Proficient in SQL "; 
    private String volunteer = "VOLUNTEER<br><br>-Youth Soccer Coach <br> -Played piano for local church";
    private String goals = "GOALS<br><br>-Secure a fullfiling job as a Web and Software Developer"; 
    private String jobHistory = "JOB HISTORY<br><br>-Current Job: Butler Tool Inc. <br> -Phone: 262-781-9505 <br>-Address: 2741 N. 125th street <br> -Length of Employment: 10 years <br> "
            + "Position: Manager<br> Job Duties: Quality Inspection of parts, "
            + "Managing employees, Read and create CAD drawings.";
   
    
    
     
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(String volunteer) {
        this.volunteer = volunteer;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getJobHistory() {
        return jobHistory;
    }

    public void setJobHistory(String jobHistory) {
        this.jobHistory = jobHistory;
    }

}
