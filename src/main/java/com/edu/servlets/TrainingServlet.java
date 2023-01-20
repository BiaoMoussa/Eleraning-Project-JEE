package com.edu.servlets;

import com.edu.beans.Course;
import com.edu.beans.Module;
import com.edu.beans.Project;
import com.edu.beans.Training;
import com.edu.beans.Tutorial;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/trainings"})
public class TrainingServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        Course course = new Course();
        course.setName("Les bases de l'orientée objet");
        course.setClassroom("Sale E1");
        course.setDuration(20);
        course.setDescription("Cours pour maitriser les bases");
        course.setNbrOfStudents(25);

        Tutorial tutorial = new Tutorial();
        tutorial.setDuration(4);
        tutorial.setName("Tuto en ligne");
        tutorial.setVideoLink("lien/delavideo");

        Project project = new Project();
        project.setName("TP");
        project.setDuration(30);
        project.setNbrOfGroups(4);
        project.setNbrOfStudentsPerGroup(5);

        Training training = new Training();
        training.setName("Programmer en java");
        List<Module> modules = new ArrayList<Module>();

        modules.add(course);
        modules.add(tutorial);
        modules.add(project);
        training.setModules(modules);

        this.getServletContext()
                .setAttribute("trainings",new ArrayList<Module>(){
                    {
                        add(project);
                        add(tutorial);
                        add(course);
                    }
                });
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String target = "list.jsp";
        String action = request.getParameter("action");

        switch (action) {

            case "create":
                target = "create.jsp";
                break;
            case "update":
                target = "update.jsp";
                break;
            case "delete":
                target = "delete.jsp";
                break;
        }
        getServletContext()
                .getRequestDispatcher("/WEB-INF/views/trainings/" + target)
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
