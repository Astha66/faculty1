package com.astha;
import com.astha.bean.Course;
//import com.astha.bean.faculty;
//import com.astha.bean.student;
//import com.astha.util.SessionUtil;
//import org.hibernate.Session;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
///**
// * Root resource (exposed at "myresource" path)
// */
//@Path("myresource")
//public class MyResource {
//
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//
//
//        student s=new student();
//        faculty f1=new faculty();
//        faculty f2=new faculty();
//
//        Course c1=new Course();
//        Course c2=new Course();
//        // c1.setCname("Algorithm");
//        //c2.setCname("Network");
//        //c3.setCname("system software");
//        //c4.setCname("Machine learning");
//
//
//        f1.setFname("Abhishek");
//        f1.setFpassword("abhishek");
//
////        s.setName("Astha");
////        s.setPassword("Astha");
//
//        f2.setFname("Abhi");
//        f2.setFpassword("abhishek");
//         c1.getFaculty().add(f1);
//         c1.getFaculty().add(f2);
//
//         f1.setCour(c1);
//         f2.setCour(c1);
//        Session session = SessionUtil.getSession();
//
//        session.beginTransaction();
//
////        session.save(s);
//         session.save(f1);
//        session.save(f2);
//
//
//
//        session.getTransaction().commit();
//        session.close();
//        return "Got it!";
//    }
//
//
//}
//
//
