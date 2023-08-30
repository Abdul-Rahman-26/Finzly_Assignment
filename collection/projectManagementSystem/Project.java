package collection.projectManagementSystem;

import java.util.Set;
import java.util.HashSet;

public class Project {
    private String projectName;
    private String projectDescription;
    private Set<String> teamMembers;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void addTeamMember(String teamMember) {
        teamMembers.add(teamMember);
    }

    @Override
    public String toString() {
        return "ProjectName = " + projectName + ", ProjectDescription = " + projectDescription + ", Team Members ="
                + teamMembers;
    }
}
