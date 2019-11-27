package com.astha.Controller;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import javax.management.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.astha.bean.faculty;
import com.astha.util.SessionUtil;
//import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
//import org.glassfish.jersey.media.multipart.FormDataParam;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

//import model.Faculty;
//import util.SessionUtil;



@Path("/login")
public class login {
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)

    public String checkCredentials(@FormParam("exampleInputEmail1") String username, @FormParam("exampleInputPassword1") String password
    ) throws URISyntaxException {
        System.out.println("hii");
        Session session = SessionUtil.getSession();
        try { Transaction tx= session.beginTransaction();
   String hql ="FROM" +faculty.class.getName()+ " di WHERE di.uname LIKE :uname";
   Query query = (Query) session.createQuery(hql);
   ((org.hibernate.query.Query) query).setParameter("username", "%" + username + "%");

            Criteria criteria=session.createCriteria(faculty.class);
            CriteriaBuilder builder = session.getCriteriaBuilder();
            criteria.add(Restrictions.eq("username",username));


            faculty f=(faculty)criteria.uniqueResult();
            if(f!=null)
            {   System.out.println(f.getFname());
                System.out.println(f.getFpassword());
                if(f.getFpassword().equals(password))
                    return String.valueOf(Response.seeOther(new URI("/webapp/WEB_INF/facultyhomepage.html")).build());
            }
            else
            {
                return String.valueOf(Response.noContent().build());

            }
            tx.commit();
            session.close();


        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "I'm in";


    }


}
