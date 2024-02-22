package Model;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private static List<Project> projectList = new ArrayList<>();

    static {
        // Thêm một số dự án mẫu
        projectList.add(new Project(1, "Project 1", "https://scontent-xsp1-2.xx.fbcdn.net/v/t39.30808-6/426507036_2011158579263630_2561235367195753725_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=efb6e6&_nc_ohc=jNcL1XRo3vkAX8MHwKw&_nc_ht=scontent-xsp1-2.xx&oh=00_AfAvr2a2AzLKL1Q-l12rrvDfCdcCDWOHy_z4DEFXNi47aA&oe=65DBF109", "Content 1", 100, 50));
        projectList.add(new Project(2, "Project 2", "image2.jpg", "Content 2", 200, 75));
        projectList.add(new Project(3, "Project 3", "image3.jpg", "Content 3", 150, 80));
    }

    public static List<Project> getAllProjects() {
        return projectList;
    }

    public static Project getProjectById(int id) {
        for (Project project : projectList) {
            if (project.getProjectId() == id) {
                return project;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
    public static List<Project> searchProjects(String keyword) {
        if (keyword != null) {
            String lowercaseKeyword = keyword.toLowerCase();
        List<Project> searchResults = new ArrayList<>();
        for (Project project : projectList) {
            // Kiểm tra từ khóa trong tên và nội dung của dự án
            if (project.getPostContent().toLowerCase().contains(keyword.toLowerCase())
                    || project.getProjectName().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(project);
            } else {
            }
        }
        return searchResults;
    }
        return null;
   }
        
}