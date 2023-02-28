package in.ineuron.main;

import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import in.ineuron.Model.Employee;
import in.ineuron.util.HibernateUtil;

public class DbRowToEntityApp {

	public static void main(String[] args) throws IOException {

		Session session = HibernateUtil.getSession();
		Employee employee = null;

		
			try {
					employee = session.get(Employee.class,4);
					if (employee != null) {
						System.out.println("Before Modification::"+employee);
						System.in.read();
						session.refresh(employee);
						System.out.println("After Modification::"+employee);
					}else {
						System.out.println("Record not found");
						System.exit(0);
					}	
			} catch (HibernateException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Record not updated..");
				
					}
			}
		
		 
	}

